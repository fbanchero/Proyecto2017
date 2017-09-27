/**
 */
package ifml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}</li>
 *   <li>{@link ifml.core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}</li>
 * </ul>
 *
 * @see ifml.core.CorePackage#getDynamicBehavior()
 * @model
 * @generated
 */
public interface DynamicBehavior extends ContentBinding {
	/**
	 * Returns the value of the '<em><b>Behavioral Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Feature Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Feature Concept</em>' reference.
	 * @see #setBehavioralFeatureConcept(BehavioralFeatureConcept)
	 * @see ifml.core.CorePackage#getDynamicBehavior_BehavioralFeatureConcept()
	 * @model ordered="false"
	 * @generated
	 */
	BehavioralFeatureConcept getBehavioralFeatureConcept();

	/**
	 * Sets the value of the '{@link ifml.core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Feature Concept</em>' reference.
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 */
	void setBehavioralFeatureConcept(BehavioralFeatureConcept value);

	/**
	 * Returns the value of the '<em><b>Behavior Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Concept</em>' reference.
	 * @see #setBehaviorConcept(BehaviorConcept)
	 * @see ifml.core.CorePackage#getDynamicBehavior_BehaviorConcept()
	 * @model ordered="false"
	 * @generated
	 */
	BehaviorConcept getBehaviorConcept();

	/**
	 * Sets the value of the '{@link ifml.core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Concept</em>' reference.
	 * @see #getBehaviorConcept()
	 * @generated
	 */
	void setBehaviorConcept(BehaviorConcept value);

} // DynamicBehavior
