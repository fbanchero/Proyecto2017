/**
 */
package ifml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.core.DomainConcept#getDataBinding <em>Data Binding</em>}</li>
 * </ul>
 *
 * @see ifml.core.CorePackage#getDomainConcept()
 * @model
 * @generated
 */
public interface DomainConcept extends DomainElement {
	/**
	 * Returns the value of the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Binding</em>' reference.
	 * @see #setDataBinding(DataBinding)
	 * @see ifml.core.CorePackage#getDomainConcept_DataBinding()
	 * @model ordered="false"
	 * @generated
	 */
	DataBinding getDataBinding();

	/**
	 * Sets the value of the '{@link ifml.core.DomainConcept#getDataBinding <em>Data Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Binding</em>' reference.
	 * @see #getDataBinding()
	 * @generated
	 */
	void setDataBinding(DataBinding value);

} // DomainConcept
