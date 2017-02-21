/**
 */
package ifml.extensions;

import ifml.core.ViewElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.extensions.Button#getButtonText <em>Button Text</em>}</li>
 *   <li>{@link ifml.extensions.Button#getAlign <em>Align</em>}</li>
 * </ul>
 *
 * @see ifml.extensions.ExtensionsPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Button Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Text</em>' attribute.
	 * @see #setButtonText(String)
	 * @see ifml.extensions.ExtensionsPackage#getButton_ButtonText()
	 * @model default=""
	 * @generated
	 */
	String getButtonText();

	/**
	 * Sets the value of the '{@link ifml.extensions.Button#getButtonText <em>Button Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Text</em>' attribute.
	 * @see #getButtonText()
	 * @generated
	 */
	void setButtonText(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see ifml.extensions.ExtensionsPackage#getButton_Align()
	 * @model
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link ifml.extensions.Button#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

} // Button
