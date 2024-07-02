package com.hana.practicingjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		
		String[] aa = {"4","8","4","6","8","4","1"};
		//System.out.println("Value of aa is: "+ aa);
		
		List ls = new ArrayList();
		ls.add("4");
		ls.add("12");
		ls.add("4");
		ls.add("12");
		ls.add("8");
		ls.add("12");
		
		System.out.println("Value of ls is: "+ ls.toString());
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("How many entries do you want in the data set?");
		 * 
		 * int count = scan.nextInt(); for(int i = 0; i <count;i++) {
		 * System.out.println("Enter data no. "+i);
		 */
			//data.add(scan.nextDouble());
		//}
				
		HashMap<String,Integer> counting = new HashMap<>();
		//System.out.println(counting);
		int count = 0;
		//System.out.println("Size of array is: "+ ls.size());
		for(int i = 0; i<ls.size(); i++) {
			if(counting.containsKey(ls.get(i))) 
			{ 
				//System.out.println("Skipping");
				continue; 
			}
			//System.out.println("value of i: " + i);
			for(int j = i; j<ls.size(); j++) {
				//System.out.println("value of j is: "+ j);
				if(ls.get(i) == ls.get(j)) 
				{ 
					//System.out.println("Found! "+ls.get(i)+" same as "+ls.get(j)); 
					count++; 
				}
			}
			counting.put((String) ls.get(i), count);
			System.out.println(ls.get(i) + " is found "+count+ " times");
			count = 0;
		}

		System.out.println("The values in hashmap is: " + counting.toString());
		
		int temp = 0;
		String temp1 = null;
		
		for (Map.Entry<String, Integer> entry : counting.entrySet()) {	
			
			if (entry.getValue() > temp) {
				temp = entry.getValue();
				temp1 = entry.getKey();
			}

		}
		
		System.out.println("Number "+ temp1 + " is appeared highest in the array with "+temp+" times");
	}

}
