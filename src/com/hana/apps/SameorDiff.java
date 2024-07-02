package com.hana.apps;

import java.util.Scanner;

public class SameorDiff {

	public static void main(String[] args) {
		
		System.out.println("Which number do you want to compare?");
		 int a= new Scanner(System.in).nextInt();
		     
		 System.out.println("Which number do you want to compare?");
		 String a2= new Scanner(System.in).nextLine();
		     
		int a21 = Integer.valueOf(a2);

		if(a == a21){
		 System.out.println("Same");
		 }
		 else{
		  System.out.println("Different");
		 }

		
	}

	

}
