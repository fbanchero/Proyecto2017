/**
 */
package ifml.extensions.impl;

import ifml.core.impl.ViewElementImpl;
import ifml.extensions.ExtensionsPackage;
import ifml.extensions.TextField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ifml.extensions.impl.TextFieldImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ifml.extensions.impl.TextFieldImpl#getTextFieldText <em>Text Field Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFieldImpl extends ViewElementImpl implements TextField {
	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTextFieldText() <em>Text Field Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFieldText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FIELD_TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTextFieldText() <em>Text Field Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFieldText()
	 * @generated
	 * @ordered
	 */
	protected String textFieldText = TEXT_FIELD_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.TEXT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.TEXT_FIELD__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextFieldText() {
		return textFieldText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFieldText(String newTextFieldText) {
		String oldTextFieldText = textFieldText;
		textFieldText = newTextFieldText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.TEXT_FIELD__TEXT_FIELD_TEXT, oldTextFieldText, textFieldText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.TEXT_FIELD__FONT_SIZE:
				return getFontSize();
			case ExtensionsPackage.TEXT_FIELD__TEXT_FIELD_TEXT:
				return getTextFieldText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionsPackage.TEXT_FIELD__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case ExtensionsPackage.TEXT_FIELD__TEXT_FIELD_TEXT:
				setTextFieldText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.TEXT_FIELD__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case ExtensionsPackage.TEXT_FIELD__TEXT_FIELD_TEXT:
				setTextFieldText(TEXT_FIELD_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionsPackage.TEXT_FIELD__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case ExtensionsPackage.TEXT_FIELD__TEXT_FIELD_TEXT:
				return TEXT_FIELD_TEXT_EDEFAULT == null ? textFieldText != null : !TEXT_FIELD_TEXT_EDEFAULT.equals(textFieldText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (FontSize: ");
		result.append(fontSize);
		result.append(", TextFieldText: ");
		result.append(textFieldText);
		result.append(')');
		return result.toString();
	}

} //TextFieldImpl
