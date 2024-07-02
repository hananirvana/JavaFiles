package com.hana.refreshjava;

public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		int dots = 5;

		for (int i = 1; i <= dots; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		/**/

		/*
		 * a[rep] = "_ "; int aR = rep - 1; int bR = rep + 1;
		 * 
		 * a[aR] = "2 "; a[bR] = "2 ";
		 * 
		 * System.out.println(" ");
		 * 
		 * for(int i = 0; i<a.length; i++) { System.out.print(a[i]+" "); }
		 * 
		 * int aaR = aR - 1; int bbR = bR + 1; int ccR = aR + 1;
		 * 
		 * a[aaR] = "3 "; a[bbR] = "3 "; a[ccR] = "3 ";
		 * 
		 * a.clear(); System.out.println(" ");
		 * 
		 * for(int i = 0; i<a.length; i++) { System.out.print(a[i]+" "); }
		 */
	}
}
