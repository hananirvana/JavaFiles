package com.hana.refreshjava;

public class RefreshJava1 {

	public static void main(String[] args) {
		// loops in Java

		System.out.println(
				"There are around 5 types of Loops in Java. In this refresh program, we will see the loops in Java.");

		// for loop
		int numA = 7; // this is how many times we want code to loop

		System.out.println("\n--------This is for loop--------");
		
		System.out.println("Value of numA :"+numA);
		
		for (int j = 1; numA >= j; j++) {
			// code that needs to get executed by the loop
			System.out.println(j + ": Count");// to produce the count of the loop.
		}

		// while loop
		int numB = 0;

		System.out.println("\n--------This is while loop--------");
		System.out.println("Value of numB :"+numB);
		
		while (numB <= 5) {
			System.out.println("Value : " + numB);
			numB++;
		}

		// so what is the difference between a for loop and a while loop?

		// do while loop
		int numC = 0;

		System.out.println("\n--------This is do while Loop--------");
		System.out.println("Value of numC :"+numC);
		
		do {
			System.out.println("value : " + numC);
			numC++;
		} while (numC < 5);

		// what is the difference between a do while and while?
		System.out.println(
				"\n-----The difference between a while loop and for loop and a do while loop,----- \na while loop is used when you don't know the number of iterations \na for loop is for looping when you know the number of iterations \na do while loop executes code once, and then checks if condition given is true. If true, it will return up and go all over again. ");
		// switch case
		int numD = 0;

		System.out.println("\n--------This is switch case-------");

		System.out.println("Value of numD :" + numD);

		switch (numD) {
		case 1:
			System.out.println("numD is equal to: 1");
			break;
		case 2:
			System.out.println("numD is equal to: 2");
			break;
		default:
			System.out.println("numD is greater than 2 or lesser than 1");
		}
		// if else loop
		int numE = 12;

		System.out.println("\n--------This is if else loop--------");

		System.out.println("Value of numA :" + numE);

		if (numE == 10) {
			System.out.println("numE = " + numE);
		} else if (numE < 10) {// we can use else if for other conditions
			System.out.println("numE is less than 10");
		} else if (numE > 10) {
			System.out.println("numE is greater than 10");
		}

		// we use switch case when we need to make many if else statements.
		System.out.println("\n-----We use switch case when we need to make many if else statements.-----");
		
		System.out.println("\nNow, these loops above are useful when it comes to logical making.");
	}
}
