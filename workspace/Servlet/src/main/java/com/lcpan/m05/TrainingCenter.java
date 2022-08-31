package com.lcpan.m05;

public class TrainingCenter {
	private String name;
	private String address;
	private String tel;
	
	public TrainingCenter(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTel() {
		return tel;
	}
}
