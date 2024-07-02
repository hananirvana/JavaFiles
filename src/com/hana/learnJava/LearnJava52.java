package com.hana.learnJava;

public class LearnJava52 {
	//In java, we do not have passing by reference, but we do have passing by value.
	//Passing by reference in other languages is that when you declare the method and you want to pass by reference,
	//some languages allow you to put a symbol, and like what we did for non-primitive types,
	// it has to be the same name so it is connected, and when you change the value in a method, it will change it completely.
	//Passing by value is like making a copy of a variable which contains a value,
	// and you change it up, but it won't affect the original.
	public static void main(String[] args) {
		LearnJava52 lv52 = new LearnJava52();
		
		//===============================================================
		
		int value = 7;
		System.out.println("1. Value is: "+ value);
		lv52.show(value);
		System.out.println("4. Value is: " + value);

		// ===============================================================

		System.out.println();
		Machine machine = new Machine("Bob");
		System.out.println("1. Machine is: " + machine);
		lv52.show(machine);
		System.out.println("5. Machine is: " + machine);
	}

	public void show(int value) {
		System.out.println("2. Value is: " + value);
		value = 8;
		System.out.println("3. Value is: " + value);
	}

	public void show(Machine machine) {
		System.out.println("2. Machine is: " + machine);
		machine.setName("Sue");//This one is referring to the main method
		machine = new Machine("Mike");
		System.out.println("3. Machine is: " + machine);
		machine.setName("Zan");//This one is referring to the main method
		System.out.println("4. Machine is: " + machine);
		
	}
}
