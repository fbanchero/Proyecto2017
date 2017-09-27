/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.core.DataBinding#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link ifml.core.DataBinding#getVisualizationAttributes <em>Visualization Attributes</em>}</li>
 *   <li>{@link ifml.core.DataBinding#getDomainConcept <em>Domain Concept</em>}</li>
 * </ul>
 *
 * @see ifml.core.CorePackage#getDataBinding()
 * @model
 * @generated
 */
public interface DataBinding extends ContentBinding {
	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' reference list.
	 * The list contents are of type {@link ifml.core.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' reference list.
	 * @see ifml.core.CorePackage#getDataBinding_ConditionalExpression()
	 * @model
	 * @generated
	 */
	EList<ConditionalExpression> getConditionalExpression();

	/**
	 * Returns the value of the '<em><b>Visualization Attributes</b></em>' reference list.
	 * The list contents are of type {@link ifml.core.VisualizationAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Attributes</em>' reference list.
	 * @see ifml.core.CorePackage#getDataBinding_VisualizationAttributes()
	 * @model
	 * @generated
	 */
	EList<VisualizationAttribute> getVisualizationAttributes();

	/**
	 * Returns the value of the '<em><b>Domain Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Concept</em>' reference.
	 * @see #setDomainConcept(DomainConcept)
	 * @see ifml.core.CorePackage#getDataBinding_DomainConcept()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DomainConcept getDomainConcept();

	/**
	 * Sets the value of the '{@link ifml.core.DataBinding#getDomainConcept <em>Domain Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Concept</em>' reference.
	 * @see #getDomainConcept()
	 * @generated
	 */
	void setDomainConcept(DomainConcept value);

} // DataBinding
