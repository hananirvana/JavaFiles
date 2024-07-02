package com.hana.bankingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TWST {

	public static void main(String[] args) {
		
		File file = new File("Hana MaibamBank.txt");
		String s = "Balance: 80000";
		String s1 = s.replaceAll("[^0-9,.,^a-z]","");
		System.out.println(s1);
		System.out.println(file.length()+"\n");
		
		String line1 = "Name: Hana Maibam";
		String line2 = "Balance: 40000";
		String line3 = "Phone no: 1234567890";
		String line4 = "Email: hana@test.com";
		
		System.out.println(line1.length());
		System.out.println(line2.length());
		System.out.println(line3.length());
		System.out.println(line4.length());
		
//		for(int i = 0; i<=file.length() ; i++) {
//			System.out.println("I am reading a file:");
//			try {
//				System.out.println("Recieved Details!");
//				Scanner fileread = new Scanner(file);
//				while (fileread.hasNextLine()) {
//					String line = fileread.nextLine();
//					System.out.println(line);
//				}
//				fileread.close();
//
//			} catch (FileNotFoundException e) {
//				System.out.println("An error has occured with Database");
//			}

		//}
		
	}
}

