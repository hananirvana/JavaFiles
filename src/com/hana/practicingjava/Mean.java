package com.hana.practicingjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
	public static void main(String[] args) {
		ArrayList<Double> data = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		System.out.println("How many entries do you want in the data set?");
		
		int count = scan.nextInt();
		for(int i = 0; i <=count;i++) {
			System.out.println("Enter data no. "+i);
			data.add(scan.nextDouble());
		}
		System.out.println(FindMean(data));
		scan.close();
	}
	
	public static double FindMean(ArrayList<Double> set) {
		double sum = 0;
		for(Double d : set)
		    sum += d;
		double answer = sum / set.size();
		return answer;
	}

}
