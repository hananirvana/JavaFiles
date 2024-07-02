package com.hana.refreshjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Program to print Prime number list");
		System.out.println("Enter the number upto which you need to see the prime number list");
		int ans = scn.nextInt();

		Boolean flag = true;

		List<Integer> plist = new ArrayList<>();
		// plist.add(2);

		System.out.println("The number you have entered is: " + ans);

		for (int i = 2; i <= ans; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					flag = true;
				} else {
					flag = false;// first flag = f
					break;
				}
			}
			if (flag == true) {
				plist.add(i);
			}	
		}
		System.out.println(plist.toString());
	}
}
