package com.hana.learnJava;

public class Java29_Machine {

	private String name;
	
	// Good practice:
	public final static int ID = 435662;
	
	// Bad practice:
	public boolean ans = true;
	
	protected String nw = "Hello Jesus!";
	
	//Getter
	public String getName() {
		return name;
	}
	public void setName(String newName) {
	//Setter
		this.name = newName;
		System.out.println(newName);
	}
	
}
