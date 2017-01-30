package api.classes;

import java.util.ArrayList;

public class MockupMultipleColumnElement extends MockupGeneralElement{

	private ArrayList<ArrayList<MockupMultipleColumnElement>> children;
	
	public ArrayList<ArrayList<MockupMultipleColumnElement>> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<ArrayList<MockupMultipleColumnElement>> children) {
		this.children = children;
	}



}
