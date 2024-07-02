package com.hana.apps;

import java.util.Scanner;

public class MultiTables {
	public static void main(String[] arg) {
		 
		 System.out.println("Which number would you like tables for?");
		 int a= new Scanner(System.in).nextInt();
		     
		 for(int i = 1; i <= 10; i++) { 
				int multi = a*i;
	            System.out.println(a+" x "+i+" = "+multi);
		     }
		 }
}
