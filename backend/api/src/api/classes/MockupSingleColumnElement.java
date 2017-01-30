package api.classes;

import java.util.ArrayList;

public class MockupSingleColumnElement extends MockupGeneralElement{
	
	private ArrayList<MockupMultipleColumnElement> children;

	public ArrayList<MockupMultipleColumnElement> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<MockupMultipleColumnElement> children) {
		this.children = children;
	}
	
}
