package com.hana.bankingsystem;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class TestOnLogic {

	public static void main(String[] args) {
		
		Scanner scn1 = new Scanner(System.in);
		
		System.out.println("Please Type in name of the file: ");
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
		
		scn1.close();
	}

}
