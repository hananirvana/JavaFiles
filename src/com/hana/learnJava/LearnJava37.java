package com.hana.learnJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnJava37 {

	public static void main(String[] args) throws FileNotFoundException { // if can't find file, execute code
String fileName = "C:\\Users\\Hayabusa\\Desktop\\HanaJava\\Read Me!.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		in.nextLine();
		
		int count = 2;
		while(in.hasNextLine()) {
			String Line = in.nextLine();
			
			System.out.println(Line);
			count++;
		}
		
		in.close();
	}

}
