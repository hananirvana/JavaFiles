package com.hana.refreshjava;

public class ForEachExample {

	public static void main(String[] args) {
		int[] i = {10, 20, 30, 40, 50};
		String[] fruits= {"Apple","Banana","Orange"};
	
		for(int j:i) {
			System.out.println("value of j: "+ j);
		}
		
		for (String f:fruits) {
			System.out.println(f);
		}

	}

}
