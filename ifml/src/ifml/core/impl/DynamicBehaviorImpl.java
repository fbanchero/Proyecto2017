/**
 */
package ifml.core.impl;

import ifml.core.BehaviorConcept;
import ifml.core.BehavioralFeatureConcept;
import ifml.core.CorePackage;
import ifml.core.DynamicBehavior;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ifml.core.impl.DynamicBehaviorImpl#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}</li>
 *   <li>{@link ifml.core.impl.DynamicBehaviorImpl#getBehaviorConcept <em>Behavior Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicBehaviorImpl extends ContentBindingImpl implements DynamicBehavior {
	/**
	 * The cached value of the '{@link #getBehavioralFeatureConcept() <em>Behavioral Feature Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeatureConcept behavioralFeatureConcept;

	/**
	 * The cached value of the '{@link #getBehaviorConcept() <em>Behavior Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorConcept()
	 * @generated
	 * @ordered
	 */
	protected BehaviorConcept behaviorConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DYNAMIC_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureConcept getBehavioralFeatureConcept() {
		if (behavioralFeatureConcept != null && behavioralFeatureConcept.eIsProxy()) {
			InternalEObject oldBehavioralFeatureConcept = (InternalEObject)behavioralFeatureConcept;
			behavioralFeatureConcept = (BehavioralFeatureConcept)eResolveProxy(oldBehavioralFeatureConcept);
			if (behavioralFeatureConcept != oldBehavioralFeatureConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, oldBehavioralFeatureConcept, behavioralFeatureConcept));
			}
		}
		return behavioralFeatureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureConcept basicGetBehavioralFeatureConcept() {
		return behavioralFeatureConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralFeatureConcept(BehavioralFeatureConcept newBehavioralFeatureConcept) {
		BehavioralFeatureConcept oldBehavioralFeatureConcept = behavioralFeatureConcept;
		behavioralFeatureConcept = newBehavioralFeatureConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT, oldBehavioralFeatureConcept, behavioralFeatureConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConcept getBehaviorConcept() {
		if (behaviorConcept != null && behaviorConcept.eIsProxy()) {
			InternalEObject oldBehaviorConcept = (InternalEObject)behaviorConcept;
			behaviorConcept = (BehaviorConcept)eResolveProxy(oldBehaviorConcept);
			if (behaviorConcept != oldBehaviorConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT, oldBehaviorConcept, behaviorConcept));
			}
		}
		return behaviorConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConcept basicGetBehaviorConcept() {
		return behaviorConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorConcept(BehaviorConcept newBehaviorConcept) {
		BehaviorConcept oldBehaviorConcept = behaviorConcept;
		behaviorConcept = newBehaviorConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT, oldBehaviorConcept, behaviorConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				if (resolve) return getBehavioralFeatureConcept();
				return basicGetBehavioralFeatureConcept();
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				if (resolve) return getBehaviorConcept();
				return basicGetBehaviorConcept();
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				setBehavioralFeatureConcept((BehavioralFeatureConcept)newValue);
				return;
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				setBehaviorConcept((BehaviorConcept)newValue);
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				setBehavioralFeatureConcept((BehavioralFeatureConcept)null);
				return;
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				setBehaviorConcept((BehaviorConcept)null);
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
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT:
				return behavioralFeatureConcept != null;
			case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT:
				return behaviorConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicBehaviorImpl
