package com.hana.learnJava;

public class Car extends Mach1{

	
	//@Override is an annotation. 
	

	@Override
	public void start() {
		System.out.println("Car starting.");
	}

	public void WWs() {
		System.out.println("Wiping Window shield...");
	}
	
	public void showInfo() {
		System.out.println("Car type: " + naema);
	}
}
