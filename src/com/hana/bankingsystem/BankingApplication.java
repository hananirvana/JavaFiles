package com.hana.bankingsystem;

import java.util.*;

public class BankingApplication {
// here i shall use xml from AccountDetails.xml
	public static void main(String[] args) {
		int Acc1;
		// String Acc2 = "";
		String AccName = "";
		String AccBalance = "";
		int AccNum = 1842518;

		int myAccBalance = 10000;
		String myAccName = "Hana Mai";

		Random random = new Random();
		int randomnumber = random.nextInt(100000);
		System.out.println(randomnumber);

		Scanner scnNumbers = new Scanner(System.in);
		Scanner scnText = new Scanner(System.in);

		System.out.println("Choose the following options: " + "\nType 0 for Exiting the program"
				+ "\nType 1 for Depositing in Account" + "\nType 2 for Withdrawing from Account"
				+ "\nType 3 for Balance" + "\nType 4 for Opening an Account");
		int inp1 = scnNumbers.nextInt();

		switch (inp1) {
		case 0:
			break;
		case 2:
			System.out.println("Please enter your account number");
			int userAcc = scnNumbers.nextInt();

			if (userAcc == AccNum) {
				System.out.println("How much would you like to deposit?");
				int deposit = scnNumbers.nextInt();
				myAccBalance += deposit;
				System.out.println("Successfully added $" + deposit + " to Account: " + userAcc + ". New Balance is: "
						+ myAccBalance);
			} else
				System.out.println("The account number you have entered is invalid. Please try again!");
			break;

		case 3:
			System.out.println("Please enter your account number");
			int userAcc2 = scnNumbers.nextInt();

			if (userAcc2 == AccNum) {
				System.out.println("How much would you like to withdraw?");
				int withdraw = scnNumbers.nextInt();
				myAccBalance -= withdraw;
				System.out.println("Successfully removed $" + withdraw + " from Account: " + userAcc2
						+ ". New Balance is: " + myAccBalance);
			} else
				System.out.println("The account number you have entered is invalid. Please try again!");
			break;

		case 4:
			System.out.println("Please Enter your Full name");
			AccName = scnText.nextLine();
			System.out.println("Please Enter the amount you want to put into your account: ");
			AccBalance = scnText.nextLine();
			Acc1 = genRandomNum();

			System.out.println(
					" Given Name: " + AccName + "\n Account Balance: " + AccBalance + "\n Account Number: " + Acc1);
			break;
		}
		System.out.println("Hey! Thank You for visiting us! Hope you have a nice day!");

		System.exit(0);
	}

	public static int genRandomNum() {
		Random r = new Random();
		int low = 1000000;
		int high = 1999999;
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
