/**
 */
package ifml.extensions;

import ifml.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ifml.extensions.ExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/IFML/ext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsPackage eINSTANCE = ifml.extensions.impl.ExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.FormImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Submit Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUBMIT_EVENT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.FieldImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = CorePackage.VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONSTRAINTS = CorePackage.VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CorePackage.VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARAMETERS = CorePackage.VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SUB_VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARENT_VIEW_COMPONENT_PART = CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SelectionFieldImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSelectionField()
	 * @generated
	 */
	int SELECTION_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__CONSTRAINTS = FIELD__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ANNOTATIONS = FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PARAMETERS = FIELD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__IN_INTERACTION_FLOWS = FIELD__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__OUT_INTERACTION_FLOWS = FIELD__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__VIEW_ELEMENT_EVENTS = FIELD__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ACTIVATION_EXPRESSION = FIELD__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__SUB_VIEW_COMPONENT_PARTS = FIELD__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PARENT_VIEW_COMPONENT_PART = FIELD__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Is Multi Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__IS_MULTI_SELECTION = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.ValidationRuleImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getValidationRule()
	 * @generated
	 */
	int VALIDATION_RULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ID = CorePackage.CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__CONSTRAINTS = CorePackage.CONSTRAINT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ANNOTATIONS = CorePackage.CONSTRAINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__LANGUAGE = CorePackage.CONSTRAINT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__BODY = CorePackage.CONSTRAINT__BODY;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_FEATURE_COUNT = CorePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_OPERATION_COUNT = CorePackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SlotImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__ID = CorePackage.VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__CONSTRAINTS = CorePackage.VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__ANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__NAME = CorePackage.VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__PARAMETERS = CorePackage.VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__SUB_VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__PARENT_VIEW_COMPONENT_PART = CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__PARAMETER = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SortAttributeImpl <em>Sort Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SortAttributeImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSortAttribute()
	 * @generated
	 */
	int SORT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ATTRIBUTE__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Sort Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sort Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SelectEventImpl <em>Select Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SelectEventImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSelectEvent()
	 * @generated
	 */
	int SELECT_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__NAVIGATION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__NAVIGATION_FLOWS;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Select Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Select Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.ListImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Select Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SELECT_EVENT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Submit Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SUBMIT_EVENT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SimpleFieldImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSimpleField()
	 * @generated
	 */
	int SIMPLE_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__CONSTRAINTS = FIELD__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ANNOTATIONS = FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__PARAMETERS = FIELD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__IN_INTERACTION_FLOWS = FIELD__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__OUT_INTERACTION_FLOWS = FIELD__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__VIEW_ELEMENT_EVENTS = FIELD__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ACTIVATION_EXPRESSION = FIELD__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__SUB_VIEW_COMPONENT_PARTS = FIELD__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__PARENT_VIEW_COMPONENT_PART = FIELD__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The number of structural features of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SubmitEventImpl <em>Submit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SubmitEventImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSubmitEvent()
	 * @generated
	 */
	int SUBMIT_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Navigation Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__NAVIGATION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__NAVIGATION_FLOWS;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.SelectorImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ID = CorePackage.EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__CONSTRAINTS = CorePackage.EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ANNOTATIONS = CorePackage.EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__LANGUAGE = CorePackage.EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__BODY = CorePackage.EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__NAME = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__PARAMETERS = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__IN_INTERACTION_FLOWS = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__OUT_INTERACTION_FLOWS = CorePackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__VIEW_ELEMENT_EVENTS = CorePackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ACTIVATION_EXPRESSION = CorePackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__SUB_VIEW_COMPONENT_PARTS = CorePackage.EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__PARENT_VIEW_COMPONENT_PART = CorePackage.EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_OPERATION_COUNT = CorePackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.DeviceImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = CorePackage.CONTEXT_DIMENSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONSTRAINTS = CorePackage.CONTEXT_DIMENSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ANNOTATIONS = CorePackage.CONTEXT_DIMENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.PositionImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ID = CorePackage.CONTEXT_DIMENSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONSTRAINTS = CorePackage.CONTEXT_DIMENSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ANNOTATIONS = CorePackage.CONTEXT_DIMENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.UserRoleImpl <em>User Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.UserRoleImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ID = CorePackage.CONTEXT_DIMENSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__CONSTRAINTS = CorePackage.CONTEXT_DIMENSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__ANNOTATIONS = CorePackage.CONTEXT_DIMENSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The number of structural features of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.DetailsImpl <em>Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.DetailsImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getDetails()
	 * @generated
	 */
	int DETAILS = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The number of structural features of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.WindowImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Land Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_LAND_MARK = CorePackage.VIEW_CONTAINER__IS_LAND_MARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Is Xor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>Is Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_MODAL = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_NEW = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.ImageImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = CorePackage.VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONSTRAINTS = CorePackage.VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ANNOTATIONS = CorePackage.VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = CorePackage.VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PARAMETERS = CorePackage.VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VIEW_CONTAINER = CorePackage.VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALIGN = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.ButtonImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = CorePackage.VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONSTRAINTS = CorePackage.VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ANNOTATIONS = CorePackage.VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = CorePackage.VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PARAMETERS = CorePackage.VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VIEW_CONTAINER = CorePackage.VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Button Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BUTTON_TEXT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ALIGN = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.TextFieldImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ID = CorePackage.VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CONSTRAINTS = CorePackage.VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ANNOTATIONS = CorePackage.VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = CorePackage.VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__PARAMETERS = CorePackage.VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__VIEW_CONTAINER = CorePackage.VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FONT_SIZE = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Field Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TEXT_FIELD_TEXT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.impl.VideoImpl
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ID = CorePackage.VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CONSTRAINTS = CorePackage.VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ANNOTATIONS = CorePackage.VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = CorePackage.VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__PARAMETERS = CorePackage.VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__VIEW_CONTAINER = CorePackage.VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__HEIGHT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ALIGN = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__WIDTH = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ifml.extensions.SortOrderEnum <em>Sort Order Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ifml.extensions.SortOrderEnum
	 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSortOrderEnum()
	 * @generated
	 */
	int SORT_ORDER_ENUM = 20;


	/**
	 * Returns the meta object for class '{@link ifml.extensions.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see ifml.extensions.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the reference list '{@link ifml.extensions.Form#getSubmitEvent <em>Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submit Event</em>'.
	 * @see ifml.extensions.Form#getSubmitEvent()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_SubmitEvent();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see ifml.extensions.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Field</em>'.
	 * @see ifml.extensions.SelectionField
	 * @generated
	 */
	EClass getSelectionField();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.SelectionField#isIsMultiSelection <em>Is Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Selection</em>'.
	 * @see ifml.extensions.SelectionField#isIsMultiSelection()
	 * @see #getSelectionField()
	 * @generated
	 */
	EAttribute getSelectionField_IsMultiSelection();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see ifml.extensions.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see ifml.extensions.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the reference '{@link ifml.extensions.Slot#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see ifml.extensions.Slot#getParameter()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Parameter();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.SortAttribute <em>Sort Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Attribute</em>'.
	 * @see ifml.extensions.SortAttribute
	 * @generated
	 */
	EClass getSortAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.SortAttribute#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see ifml.extensions.SortAttribute#getOrder()
	 * @see #getSortAttribute()
	 * @generated
	 */
	EAttribute getSortAttribute_Order();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.SelectEvent <em>Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Event</em>'.
	 * @see ifml.extensions.SelectEvent
	 * @generated
	 */
	EClass getSelectEvent();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see ifml.extensions.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link ifml.extensions.List#getSelectEvent <em>Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Event</em>'.
	 * @see ifml.extensions.List#getSelectEvent()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SelectEvent();

	/**
	 * Returns the meta object for the reference list '{@link ifml.extensions.List#getSubmitEvent <em>Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submit Event</em>'.
	 * @see ifml.extensions.List#getSubmitEvent()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SubmitEvent();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field</em>'.
	 * @see ifml.extensions.SimpleField
	 * @generated
	 */
	EClass getSimpleField();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.SubmitEvent <em>Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Event</em>'.
	 * @see ifml.extensions.SubmitEvent
	 * @generated
	 */
	EClass getSubmitEvent();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see ifml.extensions.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see ifml.extensions.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see ifml.extensions.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Role</em>'.
	 * @see ifml.extensions.UserRole
	 * @generated
	 */
	EClass getUserRole();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Details <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details</em>'.
	 * @see ifml.extensions.Details
	 * @generated
	 */
	EClass getDetails();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see ifml.extensions.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Window#isIsModal <em>Is Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modal</em>'.
	 * @see ifml.extensions.Window#isIsModal()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_IsModal();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Window#isIsNew <em>Is New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is New</em>'.
	 * @see ifml.extensions.Window#isIsNew()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_IsNew();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see ifml.extensions.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Image#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see ifml.extensions.Image#getAlign()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Align();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ifml.extensions.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Url();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ifml.extensions.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Width();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see ifml.extensions.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Button#getButtonText <em>Button Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Text</em>'.
	 * @see ifml.extensions.Button#getButtonText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_ButtonText();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Button#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see ifml.extensions.Button#getAlign()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Align();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see ifml.extensions.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.TextField#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see ifml.extensions.TextField#getFontSize()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.TextField#getTextFieldText <em>Text Field Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Field Text</em>'.
	 * @see ifml.extensions.TextField#getTextFieldText()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_TextFieldText();

	/**
	 * Returns the meta object for class '{@link ifml.extensions.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see ifml.extensions.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Video#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ifml.extensions.Video#getHeight()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Height();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Video#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see ifml.extensions.Video#getAlign()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Align();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ifml.extensions.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for the attribute '{@link ifml.extensions.Video#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ifml.extensions.Video#getWidth()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Width();

	/**
	 * Returns the meta object for enum '{@link ifml.extensions.SortOrderEnum <em>Sort Order Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Order Enum</em>'.
	 * @see ifml.extensions.SortOrderEnum
	 * @generated
	 */
	EEnum getSortOrderEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionsFactory getExtensionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.FormImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Submit Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__SUBMIT_EVENT = eINSTANCE.getForm_SubmitEvent();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.FieldImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SelectionFieldImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSelectionField()
		 * @generated
		 */
		EClass SELECTION_FIELD = eINSTANCE.getSelectionField();

		/**
		 * The meta object literal for the '<em><b>Is Multi Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_FIELD__IS_MULTI_SELECTION = eINSTANCE.getSelectionField_IsMultiSelection();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.ValidationRuleImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getValidationRule()
		 * @generated
		 */
		EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SlotImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__PARAMETER = eINSTANCE.getSlot_Parameter();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SortAttributeImpl <em>Sort Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SortAttributeImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSortAttribute()
		 * @generated
		 */
		EClass SORT_ATTRIBUTE = eINSTANCE.getSortAttribute();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_ATTRIBUTE__ORDER = eINSTANCE.getSortAttribute_Order();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SelectEventImpl <em>Select Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SelectEventImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSelectEvent()
		 * @generated
		 */
		EClass SELECT_EVENT = eINSTANCE.getSelectEvent();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.ListImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Select Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SELECT_EVENT = eINSTANCE.getList_SelectEvent();

		/**
		 * The meta object literal for the '<em><b>Submit Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SUBMIT_EVENT = eINSTANCE.getList_SubmitEvent();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SimpleFieldImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSimpleField()
		 * @generated
		 */
		EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SubmitEventImpl <em>Submit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SubmitEventImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSubmitEvent()
		 * @generated
		 */
		EClass SUBMIT_EVENT = eINSTANCE.getSubmitEvent();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.SelectorImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.DeviceImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.PositionImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.UserRoleImpl <em>User Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.UserRoleImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getUserRole()
		 * @generated
		 */
		EClass USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.DetailsImpl <em>Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.DetailsImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getDetails()
		 * @generated
		 */
		EClass DETAILS = eINSTANCE.getDetails();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.WindowImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Is Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__IS_MODAL = eINSTANCE.getWindow_IsModal();

		/**
		 * The meta object literal for the '<em><b>Is New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__IS_NEW = eINSTANCE.getWindow_IsNew();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.ImageImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALIGN = eINSTANCE.getImage_Align();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.ButtonImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Button Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__BUTTON_TEXT = eINSTANCE.getButton_ButtonText();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__ALIGN = eINSTANCE.getButton_Align();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.TextFieldImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__FONT_SIZE = eINSTANCE.getTextField_FontSize();

		/**
		 * The meta object literal for the '<em><b>Text Field Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__TEXT_FIELD_TEXT = eINSTANCE.getTextField_TextFieldText();

		/**
		 * The meta object literal for the '{@link ifml.extensions.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.impl.VideoImpl
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__HEIGHT = eINSTANCE.getVideo_Height();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__ALIGN = eINSTANCE.getVideo_Align();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URL = eINSTANCE.getVideo_Url();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__WIDTH = eINSTANCE.getVideo_Width();

		/**
		 * The meta object literal for the '{@link ifml.extensions.SortOrderEnum <em>Sort Order Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ifml.extensions.SortOrderEnum
		 * @see ifml.extensions.impl.ExtensionsPackageImpl#getSortOrderEnum()
		 * @generated
		 */
		EEnum SORT_ORDER_ENUM = eINSTANCE.getSortOrderEnum();

	}

} //ExtensionsPackage
