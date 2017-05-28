package api.classes;

import java.util.ArrayList;

public class DomainRelationship {
	
	private ArrayList<DomainRelationshipEnd> relationsEnd;

	public ArrayList<DomainRelationshipEnd> getRelationsEnd() {
		if (relationsEnd == null) {
			relationsEnd = new ArrayList<DomainRelationshipEnd>();
		}
		return relationsEnd;
	}

	public void setRelationsEnd(ArrayList<DomainRelationshipEnd> relationsEnd) {
		this.relationsEnd = relationsEnd;
	}
	
}
