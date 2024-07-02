package com.hana.learnJava;

import java.util.ArrayList;

public class LearnJava34 {
	// generic class that can work with other object and can specify the object it
	// can work with
	//wildcards are used when you don't know the data type, so you use ? for it.
	public static void main(String[] args) {
		
		///////////////////Before Java 5/////////////
		ArrayList lis = new ArrayList();
		lis.add("apple");
		lis.add("banana");
		lis.add("cantaloupe");
		
		String fruit = (String)lis.get(1);
		
		System.out.println(fruit);
		
		/////////////////// Modern Style ////////////////////
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Cat!");
		strings.add("Dog!");
		strings.add("Parrot!");
		
		String animal;

	}
}
