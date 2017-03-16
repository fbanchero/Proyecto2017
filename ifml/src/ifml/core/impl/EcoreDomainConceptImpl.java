package ifml.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ifml.core.CorePackage;
import ifml.core.EcoreDomainConcept;

public class EcoreDomainConceptImpl extends DomainConceptImpl implements EcoreDomainConcept {

	protected EClass classifier;

	protected EcoreDomainConceptImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.UML_DOMAIN_CONCEPT;
	}

	public EClass getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (EClass)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ECORE_DOMAIN_CONCEPT__ECLASS, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	public EClass basicGetClassifier() {
		return classifier;
	}

	public void setClassifier(EClass newClassifier) {
		EClass oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ECORE_DOMAIN_CONCEPT__ECLASS, oldClassifier, classifier));
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ECORE_DOMAIN_CONCEPT__ECLASS:
				if (resolve) return getClassifier();
				return basicGetClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ECORE_DOMAIN_CONCEPT__ECLASS:
				setClassifier((EClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.ECORE_DOMAIN_CONCEPT__ECLASS:
				setClassifier((EClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.ECORE_DOMAIN_CONCEPT__ECLASS:
				return classifier != null;
		}
		return super.eIsSet(featureID);
	}

}
