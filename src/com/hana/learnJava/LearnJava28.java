package com.hana.learnJava;

public class LearnJava28 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Joe");
		dog1.bark();
		
		Laptop Hp = new Laptop();
		Hp.on();
		
		Info info1 = new Laptop();
		info1.showInfo();
		
		Info info2 = dog1;
		info2.showInfo();
		
		System.out.println();
		
		outputInfo(Hp);
		outputInfo(dog1);
	}

	private static void outputInfo(Info info1) {
		info1.changeInfo();
		// This Method is used to access the methods in our interface, which is, Info.java
	}
}
