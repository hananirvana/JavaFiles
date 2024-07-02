package com.hana.learnJava;

import java.io.Serializable;

public class Person2 implements Serializable {
	//Connected to LearnJava51 and ReadObjs
	private static final long serialVersionUID = -8025046310213489565L;
	private transient int id;
	private String name;
	
	private static int count;
	
	public Person2() {
		System.out.println("Default Constructor.");
	}
	public Person2(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two-Argument constructor");
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Person2.count = count;
	}
	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + "]";
	}
}
