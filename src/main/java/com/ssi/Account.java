package com.ssi;

public class Account {
	private int ano;
	private String name;
	private String branchName;
	private String branchAddress;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", name=" + name + ", branchName=" + branchName + ", branchAddress="
				+ branchAddress + "]";
	}
	
	

}
