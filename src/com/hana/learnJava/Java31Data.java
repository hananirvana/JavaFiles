package com.hana.learnJava;

public class Java31Data {
	private String data;
	
	//This is to get the value from main
	public String getData() {
		System.out.println(data);
		return data;
	}
	//This is to set the value from the main method to the var in this class.
	public void setData(String data) {
		this.data = data;
	}
	
}
