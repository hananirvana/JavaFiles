package com.hana.refreshjava;

public class HollowDiamondPattern {

	public static void main(String[] args) {
	
		int num = 5;
		
		for (int i=1; i<=num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			
			  for (int j=1; j<(i-1)*2;j++) 
			  { 
				  System.out.print(" ");
			  
			  }
						
			if (i == 1)
				System.out.print("\n");
			else
				System.out.print("*\n");
			
			
		}for(

	int i = num - 1;i>=1;i--)
	{
		for (int j = 1; j <= num - i; j++) {
			System.out.print(" ");
		}
		System.out.print("*");

		for (int j = 1; j < (i - 1) * 2; j++) {
			System.out.print(" ");
		}

		if (i == 1)
			System.out.print("\n");
		else
			System.out.print("*\n");

	}

	}

	private static void foreach(Class<Integer> class1) {
		// TODO Auto-generated method stub
		
	}

}
