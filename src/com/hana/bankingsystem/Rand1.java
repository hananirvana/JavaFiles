package com.hana.bankingsystem;

import java.util.Random;

public class Rand1 {

	public static void main(String[] args) {
		Random r = new Random();
		int low = 1000000;
		int high = 1999999;
		int result = r.nextInt(high-low) + low;
		System.out.println(result);
	}

}
