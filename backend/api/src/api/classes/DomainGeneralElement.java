package api.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class DomainGeneralElement {
	
	private String id;
	
	private String type;
	
	private String name;
	
	private HashMap<String, Object> properties;
	
	private ArrayList<DomainGeneralElement> children;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public HashMap<String, Object> getProperties() {
		return properties;
	}
	
	public void setProperties(HashMap<String, Object> properties) {
		this.properties = properties;
	}
	
	public ArrayList<DomainGeneralElement> getChildren() {
		return children;
	}
	
	public void setChildren(ArrayList<DomainGeneralElement> children) {
		this.children = children;
	}
	

}
