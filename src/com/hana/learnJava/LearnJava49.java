package com.hana.learnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LearnJava49 {

	public static void main(String[] args) {
		// We will use this program to read objects from a file.
		// This tutorial is for Serialization
		// It is Saving objects to a file
		// the connected programs are WriteObjects.java and Person.java

		try (FileInputStream fis = new FileInputStream("people.bin")) {

			ObjectInputStream ois = new ObjectInputStream(fis);

			Person per1 = (Person) ois.readObject();
			Person per2 = (Person) ois.readObject();

			System.out.println(per1);
			System.out.println(per2);

		} catch (FileNotFoundException e) {
			System.err.println("Cannot find specified file.");
		} catch (IOException e) {
			System.err.println("Cannot read specified file.");
		} catch (ClassNotFoundException e) {
			System.err.println("Class is not found.");
		}

	}

}
