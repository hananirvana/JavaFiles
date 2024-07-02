package com.hana.learnJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LearnJava51 {

	public static void main(String[] args) {
		System.out.println("Writing Objects...");
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test1.ser"))) {	
			Person2 person = new Person2(12, "Hana");
			Person2.setCount(88);
			os.writeObject(person);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, Your file is not found.");
		} catch (IOException e) {
			System.out.println("Cannot read from specified File.");
		}

	}

}
