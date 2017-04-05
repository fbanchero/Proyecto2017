package api.classes;

import java.util.ArrayList;

public class Domain {
	
	private String name;
	
	private ArrayList<DomainClass> children;
	
	private ArrayList<DomainRelationship> listRelationship;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	


	public ArrayList<DomainRelationship> getListRelationship() {
		return listRelationship;
	}

	public void setListRelationship(ArrayList<DomainRelationship> listRelationship) {
		this.listRelationship = listRelationship;
	}

	public ArrayList<DomainClass> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<DomainClass> children) {
		this.children = children;
	}
	
}
