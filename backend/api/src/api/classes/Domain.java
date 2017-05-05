package api.classes;

import java.util.ArrayList;

public class Domain {
	
	private String name;
	
	private ArrayList<DomainGeneralElement> children;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<DomainGeneralElement> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<DomainGeneralElement> children) {
		this.children = children;
	}
	
}
