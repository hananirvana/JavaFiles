package com.hana.learnJava;

import java.io.FileReader;
import java.io.IOException;

public class LearnJava42 {

	public static void main(String[] args) throws IOException {
		// You can read a file using FileReader or Scanner.
		FileReader fr = new FileReader("C:\\Users\\Hayabusa\\Desktop/textfile.txt");
		int i;
		// Holds true till there is nothing to read
		while ((i = fr.read()) != -1)
			// Print all the content of a file
			System.out.print((char) i);

	}

}
