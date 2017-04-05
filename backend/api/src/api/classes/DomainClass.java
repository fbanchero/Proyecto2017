package api.classes;

import java.util.ArrayList;

public class DomainClass {
	
	private String name;
	
	private ArrayList<DomainAttribute> children;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<DomainAttribute> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<DomainAttribute> children) {
		this.children = children;
	}


	
}
