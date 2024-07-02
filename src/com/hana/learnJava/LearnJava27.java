package com.hana.learnJava;

public class LearnJava27 {

	public static void main(String[] args) {
		Mach1 timem = new Mach1();
		timem.start();
		timem.stop();
		
		System.out.println("       ");
		
		Car c1 = new Car();
		
		c1.start();// Function of Mach1
		c1.WWs();// Function of its own
		c1.showInfo();// Function of its own
		c1.stop();// Function of Mac1, which its parent.
		

	}

}
