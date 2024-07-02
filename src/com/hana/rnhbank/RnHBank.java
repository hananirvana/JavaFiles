package com.hana.rnhbank;

import java.util.Scanner;
import java.util.Map.Entry;

public class RnHBank {
	
	public static void main(String[] args) {
		
		double balance = 0;
		int AccNo;
		String sName = "";
		String pNumber;
		
		
		System.out.println("--------Welcome to R & H Bank!--------");
		System.out.println("Please choose the option you want: \n"+
		"1 for new account\n"+
		"2 for withdrawl \n"+
		"3 for deposit \n"+
		"4 for balance \n"+
		"0 for Exit \n");
		int UserOp = new Scanner(System.in).nextInt();
		
		switch(UserOp) {
		case 1:
			System.out.println("Enter Customer Name: ");
			sName = new Scanner(System.in).nextLine();
			
			System.out.println("Enter Phone Number: ");
			pNumber = new Scanner(System.in).nextLine();

			AccountCreate.storeCustomerAccInfo(sName);
			AccNo = AccountCreate.customerInfo.get(sName);
			//System.out.println("Your Account Number is: "+ AccNo );
			
			/*
			 * System.out.println("Name of the customer ID please?"); int accNo = new
			 * Scanner(System.in).nextInt();
			 * 
			 * for (Entry<String, Integer> entry : AccountCreate.customerInfo.entrySet()) {
			 * if (entry.getValue().equals(accNo)) {
			 * System.out.println("Customer Name of the account no."+accNo+" is: "+
			 * entry.getKey()); } }
			 */
			System.out.println("Enter the Account Opening Deposit Amount: $");
			balance = new Scanner(System.in).nextDouble();
			
			System.out.println("New Account Set up is completed. Here are your details:\n"
					+ "Account No. : "+ AccNo +"\n"
					+ "Name in Account : "+ sName + "\n"
					+ "Account Balance is : $" + balance + "\n"
					+ "Phone number link to your account is : " + pNumber + "\n"
					);
			System.out.println("Please remember your account number!");
			System.out.println("Thank you for opening account with R&H Bank. Please visit again!");
		    break;
		case 2:
			System.out.println("ID please.");
			String osName = new Scanner(System.in).nextLine();
			System.out.println("Please identify your ID again.");
			int osoName = new Scanner(System.in).nextInt();
			
			
			
		}
		
		
		
	}

}
