package com.hana.learnJava;

import java.util.Scanner;

public class LearnJava12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter a number");
			value = scn.nextInt();
		}
		while(value != 5);
		
		System.out.println("Got 5!");
		scn.close();
	}

}
