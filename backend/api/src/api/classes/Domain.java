package api.classes;

import java.util.ArrayList;

public class Domain {
	
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
		return listClass;
	}
	
	public void setListClass(ArrayList<DomainClass> listClass) {
		this.listClass = listClass;
	}

	public ArrayList<DomainRelationship> getListRelationship() {
		return listRelationship;
	}

	public void setListRelationship(ArrayList<DomainRelationship> listRelationship) {
		this.listRelationship = listRelationship;
	}
	
}
