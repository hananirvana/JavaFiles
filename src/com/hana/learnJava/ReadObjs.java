package com.hana.learnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjs {

	public static void main(String[] args) {
		System.out.println("Reading Objects...");
		//Connected to LearnJava51 and Person2
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("test1.ser"))) {
			
			Person2 person = (Person2)os.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
