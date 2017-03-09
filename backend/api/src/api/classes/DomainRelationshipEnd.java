package api.classes;

public class DomainRelationshipEnd {
	
	private DomainClass typeClass;
	
	private int cardinality;

	public DomainClass getTypeClass() {
		return typeClass;
	}

	public void setTypeClass(DomainClass typeClass) {
		this.typeClass = typeClass;
	}

	public int getCardinality() {
		return cardinality;
	}

	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}
	
}
