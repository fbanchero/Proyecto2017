package api.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class MockupGeneralElement {
	
	private String id;
	private String type;
	private String name;
	private HashMap<String, Object> properties;
	private ArrayList<NavigationEvent> events; 
	
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

	public ArrayList<NavigationEvent> getEvents() {
		return events;
	}
	
	public void setEvents(ArrayList<NavigationEvent> events) {
		this.events = events;
	}

}
