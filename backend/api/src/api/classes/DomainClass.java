package api.classes;

import java.util.ArrayList;

public class DomainClass {
	
	private String name;
	
	private ArrayList<DomainAttribute> listAttribute;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<DomainAttribute> getListAttribute() {
		return listAttribute;
	}

	public void setListAttribute(ArrayList<DomainAttribute> listAttribute) {
		this.listAttribute = listAttribute;
	}
	
}
