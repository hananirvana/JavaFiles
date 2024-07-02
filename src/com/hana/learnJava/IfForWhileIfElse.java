package com.hana.learnJava;

import java.util.Scanner;

public class IfForWhileIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// If Else Condition
		String password = "7638";
		String username = "Blackcat123";
		Scanner scn = new Scanner(System.in);
		int count = 0;

		System.out.println("Entering the login page using if loop:");

		System.out.println("What is your username?");
		String Userin = scn.nextLine();

		if (Userin.equalsIgnoreCase("Blackcat123")) {
			for (int i = 0; i<3; i++) {
				count++;
				System.out.println("Please enter your password");
				String userPassword = scn.next();
				if (userPassword.equalsIgnoreCase(password)) {
					System.out.println("You have loged in successfully to " + username + "\n");
					break;
				}
				else
					if(count<3)
					System.out.println("Wrong password. Please try again");
					else
					System.out.println("You have reached the max attempt allowed. Get Lost!");
			}
			
		}else {
			System.out.println("Please enter a correct user login id.");
		}

		// For loop
		int num = 10;

		System.out.println("Starting count from 1 to 10 using for loop:");
		for (int i = 1; i <= num; i++) {
			System.out.println("Counting Number: " + i);
		}

		// While Loop
		System.out.println("\nStarting count from 1 to 10 using while loop:");

		int count1 = 1;

		while (count1 <= 10) {
		  System.out.println("counting number= "+count1);
		  count1++;
		}
		
		System.out.println("End of the loops and conditions in java.");
		
	}

}
