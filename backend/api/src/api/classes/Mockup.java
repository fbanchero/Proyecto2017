package api.classes;

import java.util.ArrayList;

public class Mockup {
	private String name;
	private ArrayList<MockupSingleColumnElement> pages;
	private ArrayList<Domain> domain;
	
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

	public ArrayList<Domain> getDomain() {
		return domain;
	}

	public void setDomain(ArrayList<Domain> domain) {
		this.domain = domain;
	}
	
}
