package com.ssi;

import java.util.Map;
import java.util.Set;

public class Emp {
	private int code;
	private String name;
	private Address address;
	//private List<String> area;
	private Set<String> area;
	private Map<String,String> parents;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Map<String, String> getParents() {
		return parents;
	}
	public void setParents(Map<String, String> parents) {
		this.parents = parents;
	}
	@Override
	public String toString() {
		return "Emp [code=" + code + ", name=" + name + ", parents=" + parents + "]";
	}
	
	
}
