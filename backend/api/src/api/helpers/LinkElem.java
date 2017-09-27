package api.helpers;

import ifml.core.NavigationFlow;
import ifml.core.ParameterBindingGroup;

public class LinkElem {
	public String id;
	public NavigationFlow navigationFlow;
	public ParameterBindingGroup parameterBindingGroup;
	
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
	public ParameterBindingGroup getParameterBindingGroup() {
		return parameterBindingGroup;
	}
	public void setParameterBindingGroup(ParameterBindingGroup parameterBindingGroup) {
		this.parameterBindingGroup = parameterBindingGroup;
	}
	
}
