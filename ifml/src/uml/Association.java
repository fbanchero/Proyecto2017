/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.Association#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.Association#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Element {

	/**
	 * Returns the value of the '<em><b>Member End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member End</em>' reference.
	 * @see #setMemberEnd(Classifier)
	 * @see uml.UmlPackage#getAssociation_MemberEnd()
	 * @model required="true"
	 * @generated
	 */
	Classifier getMemberEnd();

	/**
	 * Sets the value of the '{@link uml.Association#getMemberEnd <em>Member End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member End</em>' reference.
	 * @see #getMemberEnd()
	 * @generated
	 */
	void setMemberEnd(Classifier value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(Integer)
	 * @see uml.UmlPackage#getAssociation_Cardinality()
	 * @model
	 * @generated
	 */
	Integer getCardinality();

	/**
	 * Sets the value of the '{@link uml.Association#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Integer value);
} // Association
