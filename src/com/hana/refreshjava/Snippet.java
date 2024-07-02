package com.hana.refreshjava;

public class Snippet {

	public static void main(String[] args) {

		/*
		 * String name = "March";
		 * 
		 * int number;
		 * 
		 * switch (name) {
		 * 
		 * case "January":
		 * 
		 * number = 1;
		 * 
		 * System.out.println(name + " is " + number);
		 * 
		 * break;
		 * 
		 * case "February":
		 * 
		 * number = 2;
		 * 
		 * System.out.println(name + " is " + number);
		 * 
		 * break;
		 * 
		 * case "March":
		 * 
		 * number = 3;
		 * 
		 * System.out.println(name + " is " + number);
		 * 
		 * break;
		 * 
		 * default:
		 * 
		 * number = 0;
		 * 
		 * System.out.println(name + " is " + number);
		 * 
		 * break;
		 */
		//}
		// new code
		
		int[] weight = { 6, 3, 12, 5, 8, 7, 1 };

		int heaviest = 0;

		int l = weight.length;

		for (int i = 0; i < l; i++) {
			if (heaviest < weight[i]) {
				heaviest = weight[i];
			}
		}
		System.out.println("The heaviest out of all are: " + heaviest);
		
		
	}
}
