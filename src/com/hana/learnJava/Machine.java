package com.hana.learnJava;

public class Machine {

	private String name;

	public Machine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Machine [name=" + name + "]";
	}

}
