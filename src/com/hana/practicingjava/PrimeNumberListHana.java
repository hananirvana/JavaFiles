package com.hana.practicingjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberListHana {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		Boolean flag = false;
		System.out.println("---Welcome to Prime Number Printing Lists! Till which number would you like to print prime number list?");
		int input = scn.nextInt();
		for(int i = 2; i<input; i++) {//i+1
			for(int j = 2;j<i;j++) {
				if(i % j != 0 ) {
					flag = true;
				}else {
					flag = false;
					break;
				}
				
			}
			if(flag=true) {
				numList.add(i);
			}
		}
		
		System.out.println(numList);
	}

}
