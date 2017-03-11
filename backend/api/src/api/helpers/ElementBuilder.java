package api.helpers;

import java.util.HashMap;

import api.classes.*;
import ifml.core.*;
import ifml.extensions.*;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.uml2.types.TypesFactory;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ClassifierImpl;

public class ElementBuilder {
	
    public static CoreFactory f;
    public static ExtensionsFactory ef;
    public static UMLFactory umlf;
    public static TypesFactory tf;

	public ElementBuilder(CoreFactory pf, ExtensionsFactory pef) {
		f = pf;
		ef = pef;
	}

	/**
	 * Creates a Window based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - Window object.
	 */
	public Window createWindow(MockupSingleColumnElement elem) {
		
		Window window = ef.createWindow();
		window.setId(elem.getId());
		window.setName(elem.getName());
		window.setIsModal(true);
		
		return window;
		
	}

	/**
	 * Creates a List based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - List object.
	 */
	public List createList(MockupMultipleColumnElement elem, HashMap<String, NavigationFlow> links) {
		
		List list = ef.createList();
		list.setId(elem.getId());
		list.setName(elem.getName());
		
		if(elem.getEvents() != null && !elem.getEvents().get(0).getLink().equals("")) {
			SelectEvent se = createSelectEvent(elem);
			NavigationEvent ne = elem.getEvents().get(0);
			NavigationFlow nf = f.createNavigationFlow();

			nf.setSrcInteractionFlowElement(se);
			se.getNavigationFlows().add(nf);	
			list.getViewElementEvents().add(se);
			links.put(ne.getLink(), nf);
		}
		
		return list;
		
	}

	/**
	 * Creates a Button based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - Button object.
	 */
	public Button createButton(MockupMultipleColumnElement elem, HashMap<String, NavigationFlow> links) {
		
		Button button = ef.createButton();
		button.setId(elem.getId());
		button.setName(elem.getName());
		HashMap<String, Object> properties = elem.getProperties();
		
		if (properties.containsKey("align")) {
			button.setAlign((String) properties.get("align")); 
		}
		
		if (properties.containsKey("value")) {
			button.setButtonText((String)elem.getProperties().get("value"));
		}

		if(elem.getEvents() != null){
			for(NavigationEvent navEvent: elem.getEvents()){
				
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				button.getViewElementEvents().add(event);
				
				links.put(navEvent.getLink(), nf);
				
			}
		}
	    
		return button;
		
	}

	/**
	 * Creates a TextField based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - TextField object.
	 */
	public TextField createTextField(MockupMultipleColumnElement elem, HashMap<String, NavigationFlow> links) {
		
		TextField textField = ef.createTextField();
		textField.setId(elem.getId());
		textField.setName(elem.getName());
		HashMap<String, Object> properties = elem.getProperties();
		
		if (properties.containsKey("fontSize")) {
			textField.setFontSize((String) properties.get("fontSize")); 
		}
		
		if (properties.containsKey("value")) {
			textField.setTextFieldText((String)elem.getProperties().get("value"));
		}
		
		if(elem.getEvents() != null){
			for(NavigationEvent navEvent: elem.getEvents()){
				
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				textField.getViewElementEvents().add(event);
				
				links.put(navEvent.getLink(), nf);
				
			}
		}
	    
		return textField;
		
	}
	
	/**
	 * Creates a ViewContainer based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - ViewContainer object.
	 */
	public ViewContainer createViewContainer(MockupGeneralElement elem, HashMap<String, NavigationFlow> links) {
		
		ViewContainer vc = f.createViewContainer();
		vc.setId(elem.getId());
		vc.setName(elem.getName());
		vc.setIsXor(elem.getType().equals("tabs"));
		
		if (elem.getEvents() != null){
			
			for(NavigationEvent navEvent: elem.getEvents()){
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				vc.getViewElementEvents().add(event);
				
				links.put(navEvent.getLink(), nf);
				
			}
		
		}
		
		return vc;
		
	}
	
	/**
	 * Creates a ViewElement based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - ViewElement object.
	 */
	public ViewElement createViewElement(MockupGeneralElement elem, HashMap<String, NavigationFlow> links) {
		
		ViewElement ve = f.createViewElement();
		ve.setId(elem.getId());
		ve.setName(elem.getName());
		
		if (elem.getEvents() != null) {
			for (NavigationEvent navEvent: elem.getEvents()) {
				
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				ve.getViewElementEvents().add(event);
				
				links.put(navEvent.getLink(), nf);
				
			}
		}
		
		return ve;
		
	}
	
	/**
	 * Creates a SubmitEvent based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - SubmitEvent object.
	 */
	public SubmitEvent createSubmitEvent(MockupGeneralElement elem) {
		
		SubmitEvent ve = ef.createSubmitEvent();
		ve.setId(elem.getId());
		ve.setName(elem.getName());
		// TODO: add remaining properties.
		
		return ve;
		
	}

	/**
	 * Creates a SelectEvent based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - SelectEvent object.
	 */
	public static SelectEvent createSelectEvent(MockupGeneralElement elem) {
		
		SelectEvent se = ef.createSelectEvent();
		se.setId(elem.getId());
		se.setName(elem.getName());

		return se;
		
	}
	
	/**
	 * Creates a SimpleField based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - SimpleField object.
	 */
	public SimpleField createSimpleField(MockupGeneralElement elem) {
		
		SimpleField sf = ef.createSimpleField();
		sf.setId(elem.getId());
		sf.setName(elem.getName());
		
		// TODO: add remaining properties.
		HashMap<String, Object> properties = elem.getProperties();
		
		if (properties.containsKey("placeholder")) {
			// sf.setPlaceholder((String) properties.get("placeholder")); 
		}
		
		if (properties.containsKey("label")) {
			// sf.setLabel((String)elem.getProperties().get("label"));
		}
		
		return sf;
		
	}

	/**
	 * Creates a Image based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - Image object.
	 */
	public Image createImage(MockupGeneralElement elem, HashMap<String, NavigationFlow> links) {
		
		Image img = ef.createImage();
		img.setId(elem.getId());
		img.setName(elem.getName());
		HashMap<String, Object> properties = elem.getProperties();
		
		if (properties.containsKey("align")) {
			img.setAlign((String) properties.get("align")); 
		}
		
		if (properties.containsKey("url")) {
			img.setUrl((String)elem.getProperties().get("url"));
		}
		
		if (elem.getEvents() != null) {
			for (NavigationEvent navEvent: elem.getEvents()) {
				
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				img.getViewElementEvents().add(event);
				
				links.put(navEvent.getLink(), nf);
				
			}
		}	
		
		return img;
		
	}
	
	
	/**
	 * Creates a Image based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - Image object.
	 */
	public DomainConcept createDomainConcept(DomainClass domainClass) {
		
		UMLDomainConcept dc = f.createUMLDomainConcept();
		org.eclipse.uml2.uml.Class c = umlf.createClass();
		for (DomainAttribute da: domainClass.getListAttribute()) {
			Property p = umlf.createProperty();
			p.setName(da.getName());
			DataType dt = umlf.createDataType();
			EDataType tipeAttr = tf.getTypesPackage().getString();
			tf.create(tipeAttr)
			p.setType(typeAttr);
		}
		dc.setClassifier(c);
		return dc;
		
	}
	
}
