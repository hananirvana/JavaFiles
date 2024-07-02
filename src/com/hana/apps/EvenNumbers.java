package com.hana.apps;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] arg){
		
	
		System.out.println("What is the max number you would like odd and even list for?");
		 int max= new Scanner(System.in).nextInt();
		    
		 even(max);
		odd(max);
			
	}
	
	public static void even(int max){
		for(int i = 1; i<=max; i++){
			if(i % 2 ==0){
				System.out.println("Even number is:"+ i);
			}
		}
	}
	
	public static void odd(int max){
	for(int i = 1; i<=max; i++){
			if(i % 2 !=0){
				System.out.println("Odd number is:"+ i);
			}
		}
	}
}
//Even: 2, 4, 6, 8, 10; Odd: 1, 3, 5, 7, 9