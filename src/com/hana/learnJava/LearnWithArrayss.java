package com.hana.learnJava;

import java.util.Scanner;

public class LearnWithArrayss {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] vals = {1, 454, 9, 287, 34};
		
		System.out.println(vals[1]);

		int[][] ages = {
		{13, 13, 12, 9}	, // 13 = HANA 11 = RYAN 12 = DING 9 = ECHAN
		{5, 13, 3}, //5 = ARI 13 = LEISHANA 3 = VINCENT
		{10} //10 = NAMITA 
		};
		
		System.out.println("Who's age would you like to know?"
				+ "\n 1. Hana"
				+ "\n 2. Ryan"
				+ "\n 3. Namita"
				+ "\n 4. Leishana"
				+ "\n 5. Ari"
				+ "\n 6. Vince"
				+ "\n 7. Destiny");
		String ageName = scn.nextLine();
		
		switch (ageName) {
		case "1":
			System.out.println("The age of Hana is: "+ages[0][0]);
			break;
		case "2":
			System.out.println("The age of Ryan is: "+ages[0][1]);
			break;
		case "3":
			System.out.println("The age of Namita is: "+ages[2][0]);
			break;
		case "4":
			System.out.println("The age of Leishana is: "+ages[1][1]);
			break;
		case "5":
			System.out.println("The age of Ari is: "+ages[1][0]);
			break;
		case "6":
			System.out.println("The age of Vince is: "+ages[0][0]);
			break;
		case "7":
			System.out.println("The age of Destiny is: "+ages[0][3]);
			break;
		default:
			System.out.println("Sorry the number you have said doesn't exist.");
			
		}
	}

}
