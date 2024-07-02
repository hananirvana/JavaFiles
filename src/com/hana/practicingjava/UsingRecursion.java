package com.hana.practicingjava;

public class UsingRecursion {

	public static void main(String[] args) {
		System.out.println("The numbers below are multiplied by each other.");
		System.out.println("\n"+factorial(3));

	}
	
	private static int factorial(int val) {
		System.out.print(val);
		if(val == 1)
			return 1;
		//This is called Recursion
		//This is way that a method could call itself in a method
		//But it is not used because it could throw a StackOverflowError
		//It is called that because a Stack in Java is where they store temporary things.
		//If we run this program without the code above, it will be infinite and Java will have to 
		//keep on adding the temporary values to the stack, letting it overflow.
		//A stack cannot hold much values in it.
		return factorial(val-1)* val;
	}
}
