package com.hana.bankingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) throws IOException {
		//Here I am using text file, so it will be a bit complicated.
		Scanner scn = new Scanner(System.in);//For finding numbers as input
		Scanner scn1 = new Scanner(System.in);// for finding string as input

		System.out.println("Welcome to BankingSystem! Please select the following options: "
				+ "\n Type 1 for Account Info" + "\n Type 2 for Withdraw" + "\n Type 3 for Deposit"
				+ "\n Type 4 for Balance" + "\n Type 5 for Opening Account" + "\n Type 0 for Exit");
		int opt = scn.nextInt();

		switch (opt) {
		case 0:
			break;
		case 1:

			System.out.println("Please Type in name of the file which contains the info: ");
			String nameCheck = scn1.nextLine();

			File file = new File(nameCheck);

			try {
				System.out.println("Recieved Details!");
				Scanner fileread = new Scanner(file);
				while (fileread.hasNextLine()) {
					String line = fileread.nextLine();
					System.out.println(line);
				}
				fileread.close();

			} catch (FileNotFoundException e) {
				System.out.println("An error has occured with Database");
			}

			break;
		case 2:
			System.out.println("Please enter the name of the file that contains your info:");
			String fileename = scn1.nextLine();
			int n = 1; // The line number
		      try{
		        System.out.println("Recieved Details!");
		        String line = Files.readAllLines(Paths.get(fileename)).get(n);
		        System.out.println(line);
		      } 
		      catch(IOException e){
		        System.out.println(e);
		      }
			System.out.println("How much would you like withdraw? Please enter a valid amount.\n");
			double withdraw = scn.nextDouble();
			System.out.println("Would you like to withdraw this amount: " + withdraw + "? Y or N \n");
			
			String verify1 = scn1.nextLine();
			if (verify1.equalsIgnoreCase("Y")) {
				//I need help over here. I need to update the current line from a file! How to do that?
			} else {
				System.out.println("Cancelled. Returning to main menu...");
			}
			break;
		case 3:
			System.out.println("How much woud you like to deposit?");
			String depo = scn1.nextLine();
			System.out.println("Please enter account ID: ");
			String idcheck = scn1.nextLine();
			System.out.println("Please enter account ID again: ");
			String idcheck2 = scn1.nextLine();
			if (idcheck2.equalsIgnoreCase(idcheck)) {
				System.out.println("Your Account ID is: " + idcheck2 + ". Is this correct? Y or N");
				String verifyy = scn1.nextLine();
				if (verifyy.equalsIgnoreCase("Y")) {
					System.out.println("Sucessfully deposited! Thank you for visiting BankingSystem! See you Again!");
				} else {
					System.out.println("Request timeout. Please relaunch the app again. Sorry for the inconvineice.");
				}
			} else {
				System.out.println("Uh oh! It seems you have entered your wrong ID! Please relaunch the application");
			}

			break;

		case 4:
			
			System.out.println("Please Type in name of the file: ");
			String nameCh2eck = scn1.nextLine();
			
			File fil = new File(nameCh2eck);
			
			try {
				System.out.println("Recieved Details!");
				Scanner fileread = new Scanner(fil);
				
				for(int i = 1; i<= 2; i++) {
					String line = fileread.nextLine();
					System.out.println(line);
				}
				
				fileread.close();

			} catch (FileNotFoundException e) {
				System.out.println("An error has occured with Database");
			}
			break;

		case 5:

			System.out.println("Please Enter your Full name");
			String fullname = scn1.nextLine();
			System.out.println("Please Enter your balance without decimal points please: ");
			int balanc = scn.nextInt();
			System.out.println("Please enter your phone number only with numbers and no whitespace please: ");
			long phone = scn.nextLong();
			System.out.println("Please enter your email:");
			String email = scn1.nextLine();

			String fileName2 = fullname + "Bank.txt";

			int number = genRandomNum();

			// this will convert any number sequence into 6 character.

			try {
				FileWriter myWriter = new FileWriter(fileName2);
				myWriter.write("Name: ");
				myWriter.write(fullname);
				myWriter.write(System.lineSeparator());
				myWriter.write("");
				myWriter.write(new Integer(balanc).toString());
				myWriter.write(System.lineSeparator());
				myWriter.write("Phone no: ");
				myWriter.write(new Long(phone).toString());
				myWriter.write(System.lineSeparator());
				myWriter.write("Email: ");
				myWriter.write(email);
				myWriter.write(System.lineSeparator());
				myWriter.write("Account ID: ");
				myWriter.write(new Integer(number).toString());
				myWriter.close();
				System.out.println("Successfully Created your Account! Here are the details: \n" + " Full Name : "
						+ fullname + "\n Balance: " + balanc + "\n Phone number: " + phone + "\n Email: " + email
						+ "\n Account ID generated: " + number + "\n File which contains your info: " + fileName2);
			} catch (IOException e) {
				System.out.println("An error occurred.");

			}
			break;

		default:
			System.out.println("Sorry, but you have typed a wrong option. Please try again.");
		}
	}

	public static int genRandomNum() {
		Random r = new Random();
		int low = 1000000;
		int high = 1999999;
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
