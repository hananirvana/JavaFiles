package com.hana.refreshjava;

public class PatterTest {

	public static void main(String[] args) {

		int num = 4;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
