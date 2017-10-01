/**
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Association;
import uml.BehavioralFeature;
import uml.Classifier;
import uml.StructuralFeature;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.impl.ClassifierImpl#getStructuralFeatures <em>Structural Features</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getBehavioralFeatures <em>Behavioral Features</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierImpl extends ElementImpl implements Classifier {
	/**
	 * The cached value of the '{@link #getStructuralFeatures() <em>Structural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralFeature> structuralFeatures;

	/**
	 * The cached value of the '{@link #getBehavioralFeatures() <em>Behavioral Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<BehavioralFeature> behavioralFeatures;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getStructuralFeatures() {
		if (structuralFeatures == null) {
			structuralFeatures = new EObjectContainmentEList<StructuralFeature>(StructuralFeature.class, this, UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES);
		}
		return structuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehavioralFeature> getBehavioralFeatures() {
		if (behavioralFeatures == null) {
			behavioralFeatures = new EObjectContainmentEList<BehavioralFeature>(BehavioralFeature.class, this, UmlPackage.CLASSIFIER__BEHAVIORAL_FEATURES);
		}
		return behavioralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		if (associations == null) {
			associations = new EObjectContainmentEList<Association>(Association.class, this, UmlPackage.CLASSIFIER__ASSOCIATIONS);
		}
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
				return ((InternalEList<?>)getStructuralFeatures()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__BEHAVIORAL_FEATURES:
				return ((InternalEList<?>)getBehavioralFeatures()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIER__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
				return getStructuralFeatures();
			case UmlPackage.CLASSIFIER__BEHAVIORAL_FEATURES:
				return getBehavioralFeatures();
			case UmlPackage.CLASSIFIER__ASSOCIATIONS:
				return getAssociations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
				getStructuralFeatures().clear();
				getStructuralFeatures().addAll((Collection<? extends StructuralFeature>)newValue);
				return;
			case UmlPackage.CLASSIFIER__BEHAVIORAL_FEATURES:
				getBehavioralFeatures().clear();
				getBehavioralFeatures().addAll((Collection<? extends BehavioralFeature>)newValue);
				return;
			case UmlPackage.CLASSIFIER__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
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
			case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
				getStructuralFeatures().clear();
				return;
			case UmlPackage.CLASSIFIER__BEHAVIORAL_FEATURES:
				getBehavioralFeatures().clear();
				return;
			case UmlPackage.CLASSIFIER__ASSOCIATIONS:
				getAssociations().clear();
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
			case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
				return structuralFeatures != null && !structuralFeatures.isEmpty();
			case UmlPackage.CLASSIFIER__BEHAVIORAL_FEATURES:
				return behavioralFeatures != null && !behavioralFeatures.isEmpty();
			case UmlPackage.CLASSIFIER__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassifierImpl
