package api.helpers;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLFactory;

public class TypeFactory {
	
	private UMLFactory umlf;
	private HashMap<String, PrimitiveType> types;

	public TypeFactory(UMLFactory umlf){		
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
			t.setName(type);
			types.put(type, t);
			return t;
					
		}
			
	}



	public ArrayList<PrimitiveType> getTypes() {
		return new ArrayList<PrimitiveType>(types.values());
	}
}
