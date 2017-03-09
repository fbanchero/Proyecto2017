package api.classes;

import java.util.ArrayList;

public class DomainRelationship {
	
	private ArrayList<DomainRelationshipEnd> relationsEnd;

	public ArrayList<DomainRelationshipEnd> getRelationsEnd() {
		return relationsEnd;
	}

	public void setRelationsEnd(ArrayList<DomainRelationshipEnd> relationsEnd) {
		this.relationsEnd = relationsEnd;
	}
	
}
