package com.hana.practicingjava;

import java.util.Scanner;

public class PrimeNumberVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prime numbers
		
		System.out.println("-------Welcome to my math program! Prime numbers-------");
		
		System.out.println("Which number would you like to check whether it is prime or composite?");
		int ans = new Scanner(System.in).nextInt();
		
		check(ans);
		
		
	}

	
	public static void check(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println("Number is composite!");
				System.exit(0);
			}
		}
		System.out.println("Number is prime.");
	}
}

