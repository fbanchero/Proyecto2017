/**
 */
package ifml.extensions;

import ifml.core.ViewElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.extensions.TextField#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ifml.extensions.TextField#getTextFieldText <em>Text Field Text</em>}</li>
 * </ul>
 *
 * @see ifml.extensions.ExtensionsPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends ViewElement {

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see ifml.extensions.ExtensionsPackage#getTextField_FontSize()
	 * @model
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link ifml.extensions.TextField#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Text Field Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Field Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Field Text</em>' attribute.
	 * @see #setTextFieldText(String)
	 * @see ifml.extensions.ExtensionsPackage#getTextField_TextFieldText()
	 * @model
	 * @generated
	 */
	String getTextFieldText();

	/**
	 * Sets the value of the '{@link ifml.extensions.TextField#getTextFieldText <em>Text Field Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Field Text</em>' attribute.
	 * @see #getTextFieldText()
	 * @generated
	 */
	void setTextFieldText(String value);
} // TextField
