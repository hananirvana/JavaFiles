package com.hana.apps;

import java.util.Scanner;

class Calculator {
	public void addition(int a, int b) {
		int ans = a + b;
		System.out.println("Addition of "+ a +" and "+ b+ " is: "+ ans );
	}
	public void subtraction(int a, int b) {
		int ans = a - b;
		System.out.println("Subtraction of "+a+" and "+b+" is: "+ ans );
	}
	public void division(int a, int b) {
		int ans = a / b;
		System.out.println("Quotient of "+a+" and "+b+" is: "+ ans );
	}
	public void multiplication(int a, int b) {
		int ans = a * b;
		System.out.println("Multiplication of "+a+" and "+b+" is: "+ ans );
	}
}


public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		
		
		Scanner scn = new Scanner(System.in);
		
		cal1.addition(12, 3);
		cal1.subtraction(5, 2);
	}

}
