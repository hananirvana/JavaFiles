package com.hana.practicingjava;

import java.util.Scanner;

class Mainhead {

	public void add(int a, int b) {
		double c = a + b;
		System.out.println("The sum of "+a+" and "+b+" is: "+c);
	}
	
	public void subtract(int d,int e) {
		double f = d - e;
		System.out.println("The difference of  "+d+" and "+e+" is: "+ f);		
	}
	
	public void multiply(int g, int h) {
		double e = g * h ;
		System.out.println("The product of "+g+" and "+h+" is:"+e);
	}	
	
	public void divide(int j, int k ) {
		double l = j / k;
		System.out.println("The quotient of"+j+" and "+k+" is: "+l);
	}
}


public class BasicCalculator {

	public static void main(String[] args) {
		System.out.println("-----This Program is using lots of java topics which are related to classes, enums, etc.-----");
		
		Mainhead myObj = new Mainhead();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Welcome to Calculator!");
		System.out.println("Please type the arthimetic operator needed."
				+"/n 1.Add  ( + )"
				+"/n 2.Subtract  ( - )"
				+"/n 3.Multiply  ( * )"
				+"/n 4.Divide  ( / )"	);
		
		
		
		
		
		
	}

}
