package api.classes;

import java.util.ArrayList;

public class Model {
	
private String name;
	
	private ArrayList<DomainClass> listClass;
	
	private ArrayList<DomainRelationship> listRelationship;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<DomainClass> getListClass() {
		if (listClass == null) {
			listClass = new ArrayList<DomainClass>();
		}
		return listClass;
	}
	
	public void setListClass(ArrayList<DomainClass> listClass) {
		this.listClass = listClass;
	}

	public ArrayList<DomainRelationship> getListRelationship() {
		if (listRelationship == null) {
			listRelationship = new ArrayList<DomainRelationship>();
		}
		return listRelationship;
	}

	public void setListRelationship(ArrayList<DomainRelationship> listRelationship) {
		this.listRelationship = listRelationship;
	}

}
