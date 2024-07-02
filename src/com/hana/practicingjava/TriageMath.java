package com.hana.practicingjava;

import java.util.Scanner;

public class TriageMath {

	public static void main(String[] args) {
		int count = 0;
		double inputA = 0.0;
		double inputH = 0.0;
		double inputB = 0.0;
		Scanner scnText = new Scanner(System.in);
		System.out.println("Do you know the Height value of the Triangle? Type \"Yes\" or \"No\"");
		String yesH = scnText.next();
		if(yesH.equalsIgnoreCase("Yes")) {
			System.out.println("Please enter height value?");
			inputH = scnText.nextDouble();
			count ++;
		}
		System.out.println("Do you know the Base value of the Triangle? Type \"Yes\" or \"No\"");
		String yesB = scnText.next();
		if(yesB.equalsIgnoreCase("Yes")) {
			System.out.println("Please enter base value?");
			inputB = scnText.nextDouble();
			count ++;
		}
		if (count<2) {
			System.out.println("Do you know the Area value of the Triangle? Type \"Yes\" or \"No\"");
			String yesA = scnText.next();
			if(yesA.equalsIgnoreCase("Yes")) {
				System.out.println("Please enter Area value?");
				inputA = scnText.nextDouble();
			}
		}
		
		double result;
		
		//Area of a Triagle
		if(inputB!=0 && inputH!=0) {
			result = triangle(inputB,inputH);
			System.out.println("Area of the given triangle is: "+ result);
		}else if(inputA!=0 && inputH!=0) {
			result = findingBaseOfTriangle(inputA,inputH);
			System.out.println("Base of the given triangle is: "+ result);
		}else {
			result = findingHeightOfTriangle(inputA, inputB);
			System.out.println("Height of the given triangle is: "+ result);
		}
		
	}
	
	public static double triangle(double h, double b) {
		double a = 0.5*b*h;
		return a;
	}
	
	public static double findingBaseOfTriangle(double a, double h) {
		double bb = 2*a/h;
		return bb;
	}
	
	public static double findingHeightOfTriangle(double a, double b) {
		double hh = 2*a/b;
		return hh;
	}

}
