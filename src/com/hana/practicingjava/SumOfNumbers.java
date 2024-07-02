package com.hana.practicingjava;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		int cons = 1 + 2;
		int s = cons;

		Scanner scn = new Scanner(System.in);
		System.out.println(
				"------- Hi! What number do you want to see the sum added?Note: Minimum input number is 2.----------");
		int ans = scn.nextInt();

		if (ans == 1) {
			System.out.println("the sum of numbers upto 1 is 1. ");
			System.exit(0);
		}

		for (int i = 3; i <= ans; i++) {
			s = s + i;
		}
		System.out.println("The sum of numbers till " + ans + " is: " + s);
	}

}
