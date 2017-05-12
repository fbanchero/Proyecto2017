package api.helpers;

import ifml.core.NavigationFlow;

public class LinkElem {
	public String id;
	public NavigationFlow navigationFlow;  	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public NavigationFlow getNavigationFlow() {
		return navigationFlow;
	}
	public void setNavigationFlow(NavigationFlow navigationFlow) {
		this.navigationFlow = navigationFlow;
	}
}
