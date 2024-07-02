package com.hana.learnJava;

public class MyJavaLearn1 {

	static int sum = 0;
	static String fullname = "";
	public static void main(String[] args) {
		
		//String str ="Java";
		int a = 5;
		int b = 10;
		//int sum = a+b;
		//System.out.println("Hi, Welcome to " + str);
		//System.out.println("Sum of " +a+ " and " +b+" = " + sum);
		
		sum(a, b);	
		int c = sum1(10, 20);
		System.out.println("The value of c is: "+ c);
		
		String name1 = fullName("Ryan", "Maibam", 2);
		System.out.println("The value stored in name1 is: "+ name1);
		
	}
	
	public static void sum(int num1, int num2) {
		sum = num1+num2;
		System.out.println("Sum of "+num1+" , "+num2+" = "+ sum);
	}
	
	public static int sum1(int n1, int n2) {
		sum = n1+n2;
		//System.out.println("the value of sum is "+sum);
		return sum;
	}
	
	public static String fullName(String fName, String lName, int a) {
		fullname = fName +" "+ lName;
		return fullname;
	}

}
