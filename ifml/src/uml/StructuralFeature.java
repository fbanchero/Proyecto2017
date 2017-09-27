/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.StructuralFeature#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getStructuralFeature()
 * @model
 * @generated
 */
public interface StructuralFeature extends Element {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see uml.UmlPackage#getStructuralFeature_PrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link uml.StructuralFeature#getPrimitiveType <em>Primitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // StructuralFeature
