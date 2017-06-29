package api.classes;

import java.util.ArrayList;

public class DomainOperation {
	
	private String id;
	
	private String name;
	
	private String retorno;
	
	private ArrayList<Parameter> listParameter;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public ArrayList<Parameter> getListParameter() {
		if (listParameter == null) {
			listParameter = new ArrayList<Parameter>();
		}
		return listParameter;
	}

	public void setListParameter(ArrayList<Parameter> listParameter) {
		this.listParameter = listParameter;
	}
	
}
