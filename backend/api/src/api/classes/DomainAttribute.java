package api.classes;

public class DomainAttribute {
	
	private String name;
	
	private String type;
	
	private DomainProperty properties;
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DomainProperty getProperties() {
		return properties;
	}

	public void setProperties(DomainProperty properties) {
		this.properties = properties;
	}

	

	
}
