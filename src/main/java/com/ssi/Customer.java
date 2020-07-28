package com.ssi;

public class Customer {
	private int code;
	private String name;
	private Address address;
	
	
	
	public Customer() {
		super();
		System.out.println("Zero Arg Constructor");
	}
	
	public Customer(String s1, String s2) {
		System.out.println("Two Args Constructor(String,String)");
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
	}
	
	public Customer(int code, String name) {
		super();
		System.out.println("Two Args Constructor (int,String) ...");
		this.code = code;
		this.name = name;
	}
	public Customer(int code, String name, Address address) {
		super();
		System.out.println("Three Args Constructor...");
		this.code = code;
		this.name = name;
		this.address = address;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		System.out.println("Setting Code.....");
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Name.....");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Setting Address....");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
