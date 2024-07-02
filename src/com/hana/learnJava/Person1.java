package com.hana.learnJava;

import java.io.Serializable;

public class Person1 implements Serializable {
	private static final long serialVersionUID = -960392854591488520L;
	//LearnJava50 and ReadObjects is connected.
	private int id;
	private String name;
	
	public Person1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id="+id+", name="+name+"]";
	}}
