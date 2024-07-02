package com.hana.learnJava;

public class Dog implements Info {

	private String name;

	public Dog(String name) {
		this.name = name;
		// This constructor is telling that the name in cyan is equal to the one in
		// light purple.
	}

	public void bark() {
		System.out.println("Woof!");
	}

	public void talk() {
		System.out.println("Woof Woof!");
	}

	@Override
	public void showInfo() {
		System.out.println("Hi! I am a dog. My name is: " + name);
		// This is needed as this class implements Info.java, which is our interface, to
		// use the methods since we implement Info.java.
		// If we don't implement Info.java, this will throw an error. That is why. Also
		// the @Override is to check. It is optional to keep it or not.
	}

	@Override
	public void changeInfo() {
		System.out.println("I am an animal and I am a domestic animal.");

	}
}
