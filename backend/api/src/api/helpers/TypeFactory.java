package api.helpers;

import java.util.ArrayList;
import java.util.HashMap;

import uml.PrimitiveType;
import uml.UmlFactory;

public class TypeFactory {
	
	private UmlFactory umlf;
	private HashMap<String, PrimitiveType> types;

	public TypeFactory(UmlFactory umlf){		
		this.umlf = umlf;
		types = new HashMap<String, PrimitiveType>();
	}
	
	
	
	public PrimitiveType getPrimitiveType(String type){
		PrimitiveType t = types.get(type);
		if(t != null)
			return t;
		else
		{
			t = umlf.createPrimitiveType();
			t.setNombre(type);
			types.put(type, t);
			return t;
					
		}
			
	}



	public ArrayList<PrimitiveType> getTypes() {
		return new ArrayList<PrimitiveType>(types.values());
	}
}
