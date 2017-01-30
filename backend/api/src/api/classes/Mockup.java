package api.classes;

import java.util.ArrayList;

public class Mockup {
	private String name;
	private ArrayList<MockupSingleColumnElement> pages;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<MockupSingleColumnElement> getPages() {
		return pages;
	}
	
	public void setPages(ArrayList<MockupSingleColumnElement> pages) {
		this.pages = pages;
	}
	
}
