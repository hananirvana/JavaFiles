package com.hana.refreshjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RefreshJava4 {
	public static void main(String[] args) {
		//Play with math programs found in Java!
		System.out.println("--------In this program, we are going to play around with lots of math programs amd options.--------\n");
		
		//add 2 numbers
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("The Sum of "+a+" and "+b+" is: "+c);
		
		//subtract 2 numbers
		int d = 4;
		int e = 3;
		int f = d-e;
		System.out.println("The difference of "+d+" and "+e+" is: "+f);
		
		//multiply 2 numbers
		int g = 5;
		int h = 6;
		int i = g*h;
		System.out.println("The product of "+g+" and "+h+" is: "+i);
		
		//divide 2 numbers
		int j = 8;
		int k = 2;
		int l = j/k;
		System.out.println("The quotient of "+j+" and "+k+" is: "+l);
		
		//ascending order
		System.out.print("The ascending order for the numbers: ");
		int[] m = {5, 2, 7, 9, 3};
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		//descending order
		System.out.print("The descending order for the numbers: ");
		Integer n[]= {5, 2, 1, 8, 10};
		Arrays.sort(n, Collections.reverseOrder());// i made o a Integer instead of int because it doesn't accept.
		System.out.println(Arrays.toString(n));
		
		//randomizing from 0 to 1
		System.out.println("Random number from 0 to 1: "+Math.random());
		
		//randomizing from 0, 100
		int o =(int)(Math.random()*101);
		System.out.println("Random number from 0 to 100: "+o);
		
		//finding the bigger number
		int p = 10;
		int q = 11;
		System.out.println("Which is the bigger number? "+p+" or "+q+"? It is "+Math.max(p, q));
		
		//finding the smaller number
		int r = 12;
		int s = 15;
		System.out.println("Which is the smaller number? "+r+" or "+s+"? It is "+Math.min(r, s));
		
		//find the square root of a number. e.g. 6x6 = 36 so 6 is square root
		int t = 16;
		System.out.println("The square root of "+t+" is: "+Math.sqrt(t));
		
		//now we will see some math programs like prime number list, multi tables, even numbers etc.
		System.out.println("\n--------Now we will see math programs--------");
		
		//prime number list
		List<Integer> numList = new ArrayList<>();
		Boolean flag = true;
		System.out.print("Prime number list uptill 20: ");
		int input = 20;
		for (int u = 2; u <= input; u++) {
			for (int v = 2; v < u; v++) {
				if (u %v != 0) {
					flag = true;
				} else {
					flag = false;// first flag = f
					break;
				}
			}
			if (flag == true) {
				numList.add(u);
			}	
		}
		System.out.println(numList.toString());
		
		//even list
		List<Integer> lst = new ArrayList<>();
		int x = 20;
		for(int w = 1; w<=x; w++){
			if(w % 2 ==0){
				lst.add(w);
			}
		}
		System.out.println("The even number list till "+x+" is: "+lst+"");
		
		//odd list
		List<Integer> oddlist = new ArrayList<>();
		int y = 20;
		for(int z = 1;z<=y;z++) {
			if(z % 2 != 0) {
				oddlist.add(z);
			}
		}
		System.out.println("The odd number list till "+y+" is: "+oddlist+"");
		
		//multiplication tables for a number till 10;
		System.out.println("The multiplication tables for 12 till 10, ");
		int aa = 12;
		for(int ab = 1; ab<=10; ab++) {
			int ac = aa*ab;
			System.out.println(aa+" x "+ab+" = "+ac);
		}
		
		//
		
	}
}
