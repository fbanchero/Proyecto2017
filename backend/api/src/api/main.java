package api;

import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.post;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.internal.impl.UMLFactoryImpl;

import com.google.gson.Gson;

import api.classes.DataPage;
import api.classes.Domain;
import api.classes.DomainClass;
import api.classes.DomainProperty;
import api.classes.DomainRelationship;
import api.classes.Mockup;
import api.classes.MockupMultipleColumnElement;
import api.classes.MockupSingleColumnElement;
import api.classes.NavigationEvent;
import api.helpers.ElementBuilder;
import ifml.core.CoreFactory;
import ifml.core.DomainConcept;
import ifml.core.DomainElement;
import ifml.core.DomainModel;
import ifml.core.IFMLModel;
import ifml.core.InteractionFlowModel;
import ifml.core.InteractionFlowModelElement;
import ifml.core.NavigationFlow;
import ifml.core.UMLDomainConcept;
import ifml.core.ViewContainer;
import ifml.core.ViewElement;
import ifml.core.ViewElementEvent;
import ifml.extensions.Button;
import ifml.extensions.ExtensionsFactory;
import ifml.extensions.Form;
import ifml.extensions.Image;
import ifml.extensions.List;
import ifml.extensions.SimpleField;
import ifml.extensions.SubmitEvent;
import ifml.extensions.TextField;
import ifml.extensions.Window;

public class main {
	
    public static CoreFactory f = CoreFactory.eINSTANCE;
    public static ExtensionsFactory ef = ExtensionsFactory.eINSTANCE;
    public static UMLFactory umlf = new UMLFactoryImpl();
    public static ElementBuilder eb = new ElementBuilder(f, ef, umlf);
    
    private static final Map<String, String> MockupElementTypes = new HashMap<String, String>();
    
    /**
     * Initialization of mockup element types.
     */
    private static void initHash() {

    	MockupElementTypes.put("page", "ViewContainer");
    	MockupElementTypes.put("column", "ViewContainer");
    	MockupElementTypes.put("item", "ViewElement");
    	MockupElementTypes.put("form", "Form");
    	MockupElementTypes.put("legend", "LEGEND");
    	MockupElementTypes.put("input", "SimpleField");
    	MockupElementTypes.put("submit_button", "SubmitEvent");
    	MockupElementTypes.put("image", "Image");
    	MockupElementTypes.put("button", "Button");
    	MockupElementTypes.put("text", "Text");
    	MockupElementTypes.put("table", "List");
    	MockupElementTypes.put("modal", "Window");
    	MockupElementTypes.put("tabs", "ViewContainer");
    	
    }
    
	/**
	 * Enables CORS on requests. This method is an initialization method and should be called once.
	 * 
	 * @param origin   Requests origins allowed.
	 * @param methods  Methods allowed for the requests.
	 * @param headers  Headers to be added in all requests.
	 */
	private static void enableCORS(final String origin, final String methods, final String headers) {

	    options("/*", (request, response) -> {

	        String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
	        if (accessControlRequestHeaders != null) {
	            response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
	        }

	        String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
	        if (accessControlRequestMethod != null) {
	            response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
	        }

	        return "OK";
	        
	    });

	    before((request, response) -> {
	        response.header("Access-Control-Allow-Origin", origin);
	        response.header("Access-Control-Request-Method", methods);
	        response.header("Access-Control-Allow-Headers", headers);
	    });
	    
	}
	
    /**
     * Main class method publishing all the endpoints and handlers.
     * 
     * @param args
     */
    public static void main(String[] args){  	    	

    	initHash();
    	enableCORS("*", "*", "*");
    	
        get("/status", (request, response) -> 
        	"Ok"
        );
        
        post("/getIfml", (request, response) -> {
        	
        	return createIFML(request.body());
        	//return createIFMLDomain(request.body());
        	
        });
        
    }
    
    /**
     * Returns the xmi generated based on the mockup json parameter.
     * 
     * @param mockupJson - String json containing all the mockup information.
     * @return           - String xmi generated based on the mockup json object.
     */
    private static String createIFML(String mockupJson) {
    	
    	// Generate mockup object based on json
    	Mockup mockup = new Gson().fromJson(mockupJson, Mockup.class);
    	
		// Generate IFML from mockup object
		InteractionFlowModel ifm = generateIFMLPages(mockup.getPages());
		DomainModel domainModel = generateIFMLDomain(mockup.getDomain());

		IFMLModel ifmlModel = f.createIFMLModel();
		ifmlModel.setName(mockup.getName());
		ifmlModel.setInteractionFlowModel(ifm);
		ifmlModel.setDomainModel(domainModel);

		return getXMIFromIFML(ifmlModel);
		
    }
    
    /**
     * Returns the xmi generated based on the mockup json parameter.
     * 
     * @param domainJson - String json containing all the mockup information.
     * @return           - String xmi generated based on the mockup json object.
     */
    private static String createIFMLDomain(String mockupJson) {
    	
    	// Generate mockup object based on json
    	Mockup mockup = new Gson().fromJson(mockupJson, Mockup.class);
        	    
		// Generate IFML from mockup object
		DomainModel domainModel = generateIFMLDomain(mockup.getDomain());
		domainModel.setId("12");

		IFMLModel ifmlModel = f.createIFMLModel();
		ifmlModel.setName(mockup.getDomain().get(0).getName());
		ifmlModel.setDomainModel(domainModel);

		return getXMIFromIFML(ifmlModel);
		
    }

	/**
	 * @param mockupElements - ArrayList<MockupElement> mockupElements
	 * @return               - InteractionFlowModel generated based on mockup elements array.
	 */
	private static InteractionFlowModel generateIFMLPages(ArrayList<MockupSingleColumnElement> mockupPages) {

		InteractionFlowModel ifm = f.createInteractionFlowModel();		
		EList<InteractionFlowModelElement> ifmElements = ifm.getInteractionFlowModelElements();
		HashMap<String, NavigationFlow> links = new HashMap<String, NavigationFlow>();
		HashMap<String, DataPage> pages = new HashMap<String, DataPage>();
		
		for (MockupSingleColumnElement elem : mockupPages) {
			
			if (MockupElementTypes.get(elem.getType()).equals("ViewContainer")) {
				
				ViewContainer vc = eb.createViewContainer(elem, links);
				ifmElements.add(vc);
				recursiveIFMLHierarchy(elem, vc, links);
				
				DataPage page = new DataPage();
				page.setObject(vc);
				page.setType("ViewContainer");
				pages.put(elem.getId(), page);
				
				if (links.containsKey(elem.getId())) {
					
					NavigationFlow nf = links.get(elem.getId());
					nf.setTrgtInteractionFlowElement(vc);
					vc.getInInteractionFlows().add(nf);
					
				}
				
			} else if(MockupElementTypes.get(elem.getType()).equals("Window")) {
				
				Window w = eb.createWindow(elem);
				ifmElements.add(w);
				recursiveIFMLHierarchy(elem, w, links);
				
				DataPage page = new DataPage();
				page.setObject(w);
				page.setType("Window");
				
				if (links.containsKey(elem.getId())) {
					
					NavigationFlow nf = links.get(elem.getId());
					nf.setTrgtInteractionFlowElement(w);
					w.getInInteractionFlows().add(nf);
					
				}
				
			}
		}
		
		Iterator<Entry<String, DataPage>> it = pages.entrySet().iterator();
	    while (it.hasNext()) {
	        
	    	Map.Entry<String, DataPage> pair = (Map.Entry<String, DataPage>)it.next();
	        String pageId = pair.getKey();
	        
	        if (links.containsKey(pageId)) {
	        	DataPage page = (DataPage) pair.getValue();
				NavigationFlow nf = links.get(pageId);
				
				if (page.getType().equals("ViewContainer")) {
					ViewContainer vc = (ViewContainer) page.getObject();
					nf.setTrgtInteractionFlowElement(vc);
					vc.getInInteractionFlows().add(nf);
				}else{
					Window w = (Window) page.getObject();
					nf.setTrgtInteractionFlowElement(w);
					w.getInInteractionFlows().add(nf);
				}
				
			}
	        
	    }
	    
		ifm.setName("Pages");
		
		return ifm;
		
	}
	
	/**
	 * @param mockupElements - ArrayList<MockupElement> mockupElements
	 * @return               - InteractionFlowModel generated based on mockup elements array.
	 */
	private static DomainModel generateIFMLDomain(ArrayList<Domain> domain) {
		DomainModel domainModel = f.createDomainModel();
		domainModel.setId("domainId");
		domainModel.setName("Dominio");		
		domainModel.setName(domain.get(0).getName());
		for (DomainClass domainClass : domain.get(0).getChildren()) {
			DomainConcept dc = eb.createDomainConcept(domainClass);
			dc.setDomainModel(domainModel);
			domainModel.getElements().add(dc);
		}
				
		return domainModel;
		
	}

	/**
	 * Generates the child collection of a specific IFML element. 
	 * This method will also be applied to the children of the current object being constructed.
	 * 
	 * @param father  	  - MockupElement containing relevant information.
	 * @param fatherIFML  - Object IFML class already created for the current father.
	 * @param links       - HashMap<String, NavigationFlow> which contains all the object references.
	 */
	private static void recursiveIFMLHierarchy(MockupSingleColumnElement father, Object fatherIFML, HashMap<String, NavigationFlow> links) {
				
		if (MockupElementTypes.get(father.getType()).equals("ViewContainer") || MockupElementTypes.get(father.getType()).equals("Window")) {
			
			ViewContainer fatherVC = (ViewContainer) fatherIFML;
			EList<ViewElement> viewElements = fatherVC.getViewElements();
			
			for (MockupMultipleColumnElement elem : father.getChildren()) {
				
				MockupSingleColumnElement mergedElem = mergeChildren(elem);
				
				if (MockupElementTypes.containsKey(elem.getType())) {
				
					if (MockupElementTypes.get(elem.getType()).equals("ViewContainer")) {
						
						ViewContainer vc = eb.createViewContainer(elem, links);
						viewElements.add(vc);						
						recursiveIFMLHierarchy(mergedElem, vc, links);
						
						if(links.containsKey(elem.getId())){
							
							NavigationFlow nf = links.get(elem.getId());
							nf.setTrgtInteractionFlowElement(vc);
							vc.getInInteractionFlows().add(nf);
							
						}
						
					} else if (MockupElementTypes.get(elem.getType()).equals("ViewElement")) {
						
						ViewElement ve = eb.createViewElement(elem, links);
						viewElements.add(ve);						
						recursiveIFMLHierarchy(mergedElem, ve, links);
					
					} else if (MockupElementTypes.get(elem.getType()).equals("Form")) {
						
						Form form = ef.createForm();						
						viewElements.add(form);
						recursiveIFMLHierarchy(mergedElem, form, links);
						
					} else if(MockupElementTypes.get(elem.getType()).equals("Image")) {
						
						Image img = eb.createImage(elem, links);
						viewElements.add(img);
						
					} else if(MockupElementTypes.get(elem.getType()).equals("Button")) {
						
						Button button = eb.createButton(elem, links);
						viewElements.add(button);
						
					} else if(MockupElementTypes.get(elem.getType()).equals("Text")) {
						
						TextField textField = eb.createTextField(elem, links);
						viewElements.add(textField);
						
					} else if(MockupElementTypes.get(elem.getType()).equals("List")) {
						
						List list = eb.createList(elem, links);
						viewElements.add(list);
						
						
					}
				}
			}
			
		} else if (MockupElementTypes.get(father.getType()).equals("Form")) {

			Form fatherForm = (Form) fatherIFML;
			EList<ViewElementEvent> viewElementEvents = fatherForm.getViewElementEvents();
			
			for (MockupMultipleColumnElement elem : father.getChildren()) {
				
				if (MockupElementTypes.containsKey(elem.getType())) {
			
					if (MockupElementTypes.get(elem.getType()).equals("LEGEND")) {

						SimpleField sf = eb.createSimpleField(elem);
						fatherForm.getViewComponentParts().add(sf);
						
					} else if (MockupElementTypes.get(elem.getType()).equals("SimpleField")) {
						
						SimpleField sf = eb.createSimpleField(elem);
						fatherForm.getViewComponentParts().add(sf);
						
					} else if (MockupElementTypes.get(elem.getType()).equals("SubmitEvent")) {
						
						SubmitEvent se = eb.createSubmitEvent(elem);
						
						if(elem.getEvents() != null && !elem.getEvents().get(0).getLink().equals("")) {
							NavigationEvent ne = elem.getEvents().get(0);
							NavigationFlow nf = f.createNavigationFlow();

							nf.setSrcInteractionFlowElement(se);
							se.getNavigationFlows().add(nf);
							links.put(ne.getLink(), nf);
						}
		
						viewElementEvents.add(se);
						
					}
				
				}
				
			}
			
		}
		
	}

	/**
	 * Transforms a multiple column object into single column.
	 * 
	 * @param mockupElem - MockupMultipleColumnElement object.
	 * @return           - MockupSingleColumnElement object.
	 */
	private static MockupSingleColumnElement mergeChildren(MockupMultipleColumnElement mockupElem) {

		ArrayList<MockupMultipleColumnElement> mergedChildren = new ArrayList<MockupMultipleColumnElement>();
		if(mockupElem.getChildren()!=null){
			for(ArrayList<MockupMultipleColumnElement> elemArray : mockupElem.getChildren()){
				for(MockupMultipleColumnElement elem : elemArray){
					mergedChildren.add(elem);
				}
			}
		}

		MockupSingleColumnElement result = new MockupSingleColumnElement();
		result.setChildren(mergedChildren);
		result.setId(mockupElem.getName());
		result.setProperties(mockupElem.getProperties());
		result.setEvents(mockupElem.getEvents());
		result.setType(mockupElem.getType());
		result.setId(mockupElem.getId());
		
		return result;
	}
	
	
    
    /**
     * @param ifmlModel - IFMLModel object containing all the mockup structure	.
     * @return          - String xmi generated based on IFMLModel input.
     */
    private static String getXMIFromIFML(IFMLModel ifmlModel) {
    
    	// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		URI fileURI = URI.createFileURI(new File("test.xmi").getAbsolutePath());
//		URI fileURI2 = URI.createFileURI(new File("domain.xmi").getAbsolutePath());

		// Create a resource and get the first model element and
		// cast it to the right type, in my example everything is 
		// hierarchical included in this first node.		
		Resource resource = resSet.createResource(fileURI);
		resource.getContents().add(ifmlModel);
		DomainModel domain =  ifmlModel.getDomainModel();
		//resource.getContents().add(domain);
		for(DomainElement element: domain.getElements()){
			UMLDomainConcept dc = (UMLDomainConcept)element;
			resource.getContents().add(dc);		
			org.eclipse.uml2.uml.Class c = (Class) dc.getClassifier();
			resource.getContents().add(c);
			for(Property prop: c.getOwnedAttributes()){				
				resource.getContents().add(prop.getType());	
			}
			
		}
		
		
		try {
		
			Map<String, Object> options = new HashMap<String, Object>(); 
			options.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
			resource.save(options);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			resource.save(outputStream, options);
			return outputStream.toString();
			
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}
		
		return "There was an error during the file creation.";
    	
    }
}