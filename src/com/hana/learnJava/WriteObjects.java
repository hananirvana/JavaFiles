package com.hana.learnJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		// connected to LearnJava49 and Person
		Person hana = new Person(23, "Hana");
		Person ryan = new Person(34, "Ryan");
		
		System.out.println(hana.toString());
		System.out.println(ryan.toString());
	
		try(FileOutputStream fos = new FileOutputStream("people.bin")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hana);
			oos.writeObject(ryan);
			System.out.println("Successfully wrote to file.");
			
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file specified.");
		} catch (IOException e) {
			System.err.println("Cannot write to the file.");
		}
		
	}

}
