/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ifml.core.DomainModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see ifml.core.CorePackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ifml.core.DomainElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ifml.core.CorePackage#getDomainModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainElement> getElements();

} // DomainModel
