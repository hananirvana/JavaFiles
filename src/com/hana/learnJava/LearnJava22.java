package com.hana.learnJava;

class MacOS {
	private String name;
	private int code;
	
	public MacOS()  {
		this("Annie", 5);
		
		System.out.println("First constructor running....");
	}
	
	public MacOS(String name)  {
		this(name, 0);
		System.out.println("Second constructor running....");
		this.name = name;
	}
	
	public MacOS(String name, int code) {
		
		System.out.println("Third Constructor running....");
		this.name = name;
		this.code = code;
	}
}

public class LearnJava22 {

	public static void main(String[] args) {
		MacOS mac1 = new MacOS();

		//MacOS mac2 = new MacOS("Banner");
		
		//MacOS mac3 = new MacOS("Banner",23);
	}

}
