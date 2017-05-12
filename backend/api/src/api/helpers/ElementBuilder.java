package api.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

import api.classes.DomainAttribute;
import api.classes.DomainClass;
import api.classes.DomainOperation;
import api.classes.DomainRelationship;
import api.classes.DomainRelationshipEnd;
import api.classes.MockupGeneralElement;
import api.classes.MockupMultipleColumnElement;
import api.classes.MockupSingleColumnElement;
import api.classes.NavigationEvent;
import api.classes.Parameter;
import ifml.core.CoreFactory;
import ifml.core.DomainModel;
import ifml.core.NavigationFlow;
import ifml.core.UMLBehavioralFeature;
import ifml.core.UMLDomainConcept;
import ifml.core.UMLStructuralFeature;
import ifml.core.ViewContainer;
import ifml.core.ViewElement;
import ifml.core.ViewElementEvent;
import ifml.extensions.Button;
import ifml.extensions.ExtensionsFactory;
import ifml.extensions.Image;
import ifml.extensions.List;
import ifml.extensions.SelectEvent;
import ifml.extensions.SimpleField;
import ifml.extensions.SubmitEvent;
import ifml.extensions.TextField;
import ifml.extensions.Video;
import ifml.extensions.Window;

public class ElementBuilder {
	
    public static CoreFactory f;
    public static ExtensionsFactory ef;
    public static UMLFactory umlf;
	public static TypeFactory tf;
	public static EcoreFactory ecf;

	public ElementBuilder(CoreFactory pf, ExtensionsFactory pef, UMLFactory uf) {
		f = pf;
		ef = pef;
		umlf = uf;
		tf = new TypeFactory(umlf);
	}
	
	public ArrayList<PrimitiveType> getTypes(){
		return tf.getTypes();
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
	public List createList(MockupMultipleColumnElement elem, ArrayList<LinkElem> links) {
		
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
			LinkElem le = new LinkElem();
			le.setId(ne.getLink());
			le.setNavigationFlow(nf);
			
			links.add(le);
		}
		
		return list;
		
	}

	/**
	 * Creates a Button based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - Button object.
	 */
	public Button createButton(MockupMultipleColumnElement elem, ArrayList<LinkElem> links) {
		
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
				LinkElem le = new LinkElem();
				le.setId(navEvent.getLink());
				le.setNavigationFlow(nf);
				
				links.add(le);
				
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
	public TextField createTextField(MockupMultipleColumnElement elem, ArrayList<LinkElem> links) {
		
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
				LinkElem le = new LinkElem();
				le.setId(navEvent.getLink());
				le.setNavigationFlow(nf);
				
				links.add(le);
				
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
	public ViewContainer createViewContainer(MockupGeneralElement elem, ArrayList<LinkElem> links) {
		
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
				LinkElem le = new LinkElem();
				le.setId(navEvent.getLink());
				le.setNavigationFlow(nf);
				
				links.add(le);
				
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
	public ViewElement createViewElement(MockupGeneralElement elem, ArrayList<LinkElem> links) {
		
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
				LinkElem le = new LinkElem();
				le.setId(navEvent.getLink());
				le.setNavigationFlow(nf);
				
				links.add(le);
				
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
	public Image createImage(MockupGeneralElement elem, ArrayList<LinkElem> links) {
		
		Image img = ef.createImage();
		img.setId(elem.getId());
		img.setName(elem.getName());
		HashMap<String, Object> properties = elem.getProperties();
		
		if (properties.containsKey("align")) {
			img.setAlign((String) properties.get("align")); 
		}
		
		if (properties.containsKey("url")) {
			img.setUrl((String) properties.get("url"));
		}
		
		if (properties.containsKey("width")) {
			img.setWidth(Double.parseDouble((String) elem.getProperties().get("width"))); 
		}
		
		if (elem.getEvents() != null) {
			for (NavigationEvent navEvent: elem.getEvents()) {
				
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				img.getViewElementEvents().add(event);
				LinkElem le = new LinkElem();
				le.setId(navEvent.getLink());
				le.setNavigationFlow(nf);
				
				links.add(le);
				
			}
		}	
		
		return img;
		
	}
	/**
	 * Creates a Video based on a MockupElement.
	 * 
	 * @param elem - MockupElement with all the relevant info.
	 * @return     - Video object.
	 */
	public Video createVideo(MockupGeneralElement elem, ArrayList<LinkElem> links) {
		
		Video vid = ef.createVideo();
		vid.setId(elem.getId());
		vid.setName(elem.getName());
		HashMap<String, Object> properties = elem.getProperties();
		
		if (properties.containsKey("align")) {
			vid.setAlign((String) properties.get("align")); 
		}
		
		if (properties.containsKey("url")) {
			String url = (String)elem.getProperties().get("url");
			if(url.contains("watch?v=")){
				url = url.replace("watch?v=", "embed/");
			}
			vid.setUrl(url);
		}
		
		if (properties.containsKey("height")) {
			vid.setHeight(Double.parseDouble((String) elem.getProperties().get("height")));
		}
		
		if (properties.containsKey("width")) {
			vid.setWidth(Double.parseDouble((String) elem.getProperties().get("width")));
		}
		
		if (elem.getEvents() != null) {
			for (NavigationEvent navEvent: elem.getEvents()) {
				
				ViewElementEvent event = f.createViewElementEvent();
				NavigationFlow nf = f.createNavigationFlow();
				
				nf.setSrcInteractionFlowElement(event);
				event.getNavigationFlows().add(nf);
				vid.getViewElementEvents().add(event);
				LinkElem le = new LinkElem();
				le.setId(navEvent.getLink());
				le.setNavigationFlow(nf);
				
				links.add(le);
				
			}
		}	
		
		return vid;
		
	}
	
//	public DomainConcept createDomainConcept(DomainClass domainClass) {
//
//		UMLDomainConcept dc = f.createUMLDomainConcept();
//		dc.setId(domainClass.getName() + "Id");
//		dc.setName(domainClass.getName());
//		org.eclipse.uml2.uml.Class c = umlf.createClass();
//		c.setName(domainClass.getName());		
//		for (DomainAttribute da : domainClass.getListAttribute()) {
//			DomainProperty prop = da.getProperties();
//			PrimitiveType pt = tf.getPrimitiveType(prop.getTipo());
//			c.createOwnedAttribute(prop.getNombre(), pt);
//		}
//		dc.setClassifier(c);
//		return dc;
//	}
	
	public org.eclipse.uml2.uml.Class createClass(DomainClass domainClass, DomainModel domainModel) {
		org.eclipse.uml2.uml.Class c = umlf.createClass();
		c.setName(domainClass.getName());
		for (DomainAttribute da: domainClass.getListAttribute()) {
//			Property p = umlf.createProperty();
//			p.setName(da.getName());
//			PrimitiveType pt = umlf.createPrimitiveType();
			PrimitiveType pt = tf.getPrimitiveType(da.getType());
//			pt.setName(da.getName());
//			p.setType(pt);
//			c.getAttributes().add(p);
			Property p = c.createOwnedAttribute(da.getName(), pt);
			UMLStructuralFeature umlsf = f.createUMLStructuralFeature();
			umlsf.setStructuralFeature(p);
			domainModel.getElements().add(umlsf);
		}
		for (DomainOperation oper: domainClass.getListOperation()) {
			Operation bf = umlf.createOperation();
			bf.setName(oper.getName());
			if (oper.getRetorno() != null) {
				PrimitiveType pt = umlf.createPrimitiveType();
				pt.setName(oper.getRetorno());
				bf.createReturnResult(null, pt);
			}
			for (Parameter p: oper.getListParameter()) {
				PrimitiveType pt = umlf.createPrimitiveType();
				pt.setName(p.getTipo());
				bf.createOwnedParameter(p.getName(), pt);
			}
			c.getAllOperations().add(bf);
			UMLBehavioralFeature umlbf = f.createUMLBehavioralFeature();
			umlbf.setBehavioralFeature(bf);
			domainModel.getElements().add(umlbf);
		}
		
		UMLDomainConcept umldc = f.createUMLDomainConcept();
		umldc.setClassifier(c);
		domainModel.getElements().add(umldc);
		return c;
	}
	
	public Association createAssociation(DomainRelationship domainRelationship, Map<String, org.eclipse.uml2.uml.Class> mapClassifiers) {
		Association a = umlf.createAssociation();
		for (DomainRelationshipEnd dre: domainRelationship.getRelationsEnd()) {
			org.eclipse.uml2.uml.Class c = mapClassifiers.get(dre.getNameClass());
			Property p = umlf.createProperty();
			p.setType(c);
			p.setUpper(dre.getCardUpper());
			p.setLower(dre.getCardLower());
			a.getMemberEnds().add(p);
			c.getAssociations().add(a);
		}
		return a;
	}
	
}
