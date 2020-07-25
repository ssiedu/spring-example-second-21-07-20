package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private int code;
	private String name;
	private Map<String,Address> addresses;
	//private List<String> area;
	private Set<String> area;
	private Map<String,String> parents;
	private Properties education;
	private List<Project> projects;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public Set<String> getArea() {
		return area;
	}
	public void setArea(Set<String> area) {
		this.area = area;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public Map<String, Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getParents() {
		return parents;
	}
	public void setParents(Map<String, String> parents) {
		this.parents = parents;
	}
	public Properties getEducation() {
		return education;
	}
	public void setEducation(Properties education) {
		this.education = education;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Emp [code=" + code + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
	
}
