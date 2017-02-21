/**
 */
package ifml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}</li>
 * </ul>
 *
 * @see ifml.core.CorePackage#getVisualizationAttribute()
 * @model
 * @generated
 */
public interface VisualizationAttribute extends ViewComponentPart {
	/**
	 * Returns the value of the '<em><b>Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Concept</em>' reference.
	 * @see #setFeatureConcept(FeatureConcept)
	 * @see ifml.core.CorePackage#getVisualizationAttribute_FeatureConcept()
	 * @model required="true"
	 * @generated
	 */
	FeatureConcept getFeatureConcept();

	/**
	 * Sets the value of the '{@link ifml.core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Concept</em>' reference.
	 * @see #getFeatureConcept()
	 * @generated
	 */
	void setFeatureConcept(FeatureConcept value);

} // VisualizationAttribute
