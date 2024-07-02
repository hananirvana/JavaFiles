package com.hana.learnJava;

import java.util.Scanner;

public class MyJavaLearn4 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int val;
		System.out.println("Enter a number to check whether it is even or odd.");
		val = scn.nextInt();
		
		if(val%2 == 0) {
			System.out.println("Number given: "+val+" is even.");
		}else {
			System.out.println("Number given: "+val+" is odd.");
		}
		
		
		
	}
}
