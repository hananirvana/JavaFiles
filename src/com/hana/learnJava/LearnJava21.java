package com.hana.learnJava;

import java.util.Scanner;

class OptionCenter {
	//public static void main(String[] arms) {

	public void myBankDetail() {
		int balance = 50000;
		John pr = new John();
		System.out.println("Name is:"+ pr.name); 
		
		
		System.out.println("Do you want to know your current account balance?");
		String choice = new Scanner(System.in).next();
		
		if(choice.equalsIgnoreCase("Yes"))
			System.out.println("Current balance is =====>"+ balance);
		
		System.out.println("Choose your option:-\n" + "1 for Withdraw\n" + "2 for Balance\n" + "3 for Deposit\n"
				+ "4 for Open New account\n" + "0 for Exit");
		
		int Op = new Scanner(System.in).nextInt();

		switch (Op) {
		case 0: 
			System.out.println("Have a good day. See you again!");
			break;
		case 1: 
			System.out.println("How much would you like to withdraw?");
			int TOp = new Scanner(System.in).nextInt();

			balance = balance - TOp;
			System.out.println("Sucessfully Withdrawed! Balance => " + balance);
			break;
		
		case 2: 
			System.out.println("Balance => " + balance);
			break;
		
		case 3: 
			System.out.println("How much would you like to deposit?");
			int Top = new Scanner(System.in).nextInt();

			balance = balance + Top;
			System.out.println("Sucessfully Deposited! Balance => " + balance);
			break;
		
		case 4: 
			System.out.println("New account name?");
			String nAccName = new Scanner(System.in).nextLine();

			System.out.println("New account age?");
			int nCusAge = new Scanner(System.in).nextInt();

			System.out.println("New Email Id?");
			String nCusEmailId = new Scanner(System.in).nextLine();

			System.out.println("Sucessfully created your account with these details => \n" + nAccName + "\n "
					+ nCusAge + "\n " + nCusEmailId + " ");
			
			break;
		

		}
	}
}

class John {
	public static String name;
	public static int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class LearnJava21 {

	public static void main(String[] args) {

		 
		John p1 = new John();
		OptionCenter op = new OptionCenter();

		System.out.println();
		System.out.println("--------Welcome to R & H Bank!--------\n");
		System.out.println("What is your name?");
		String sName = new Scanner(System.in).nextLine();

		System.out.println("What is your age?");
		int iAge = new Scanner(System.in).nextInt();

		p1.setName(sName);
		p1.setAge(iAge);

		System.out.println("Name is: " + p1.name);
		System.out.println("Age is: " + p1.age);

		System.out.println("I need your email id please. Please enter email id.");
		String sEmail = new Scanner(System.in).nextLine();

        op.myBankDetail();
			
	}
	
	
	
	
	

}
