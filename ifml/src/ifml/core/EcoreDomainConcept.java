package ifml.core;

import org.eclipse.emf.ecore.EClass;

public interface EcoreDomainConcept extends DomainConcept {

	EClass getClassifier();

	void setClassifier(EClass value);

}
