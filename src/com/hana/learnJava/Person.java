package com.hana.learnJava;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -7045216446114550416L;
	//connected to WriteObjects, LearnJava49 
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id="+id+", name="+name+"]";
	}
	
}
