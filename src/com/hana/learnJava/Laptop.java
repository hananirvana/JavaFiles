package com.hana.learnJava;

public class Laptop implements Info {

	private int id = 533432;

	public void on() {
		System.out.println("Laptop Running!");
	}

	public void off() {
		System.out.println("Shutting Down...");
	}

	public void showInfo() {
		System.out.println("This is a laptop and ID is: " + id);

	}

	@Override
	public void changeInfo() {
		System.out.println("I am a machine and I am a portable device.");

	}

}
