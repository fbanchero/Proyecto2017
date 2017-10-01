/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.Classifier#getStructuralFeatures <em>Structural Features</em>}</li>
 *   <li>{@link uml.Classifier#getBehavioralFeatures <em>Behavioral Features</em>}</li>
 *   <li>{@link uml.Classifier#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Element {
	/**
	 * Returns the value of the '<em><b>Structural Features</b></em>' containment reference list.
	 * The list contents are of type {@link uml.StructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Features</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_StructuralFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralFeature> getStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>Behavioral Features</b></em>' containment reference list.
	 * The list contents are of type {@link uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Features</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_BehavioralFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehavioralFeature> getBehavioralFeatures();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

} // Classifier
