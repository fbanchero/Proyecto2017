package api.classes;

import java.util.ArrayList;

public class DomainClass {
	
	private String name;
	
	private ArrayList<DomainAttribute> listAttribute;
	
	private ArrayList<DomainOperation> listOperation;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<DomainAttribute> getListAttribute() {
		if (listAttribute == null) {
			listAttribute = new ArrayList<DomainAttribute>();
		}
		return listAttribute;
	}

	public void setListAttribute(ArrayList<DomainAttribute> listAttribute) {
		this.listAttribute = listAttribute;
	}

	public ArrayList<DomainOperation> getListOperation() {
		if (listOperation == null) {
			listOperation = new ArrayList<DomainOperation>();
		}
		return listOperation;
	}

	public void setListOperation(ArrayList<DomainOperation> listOperation) {
		this.listOperation = listOperation;
	}

}
