package com.hana.learnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	//LearnJava50 and Person1 is connected.
	public static void main(String[] args) {
		System.out.println("Reading Objects...");

		try (FileInputStream fi = new FileInputStream("test.ser")) {
			ObjectInputStream os = new ObjectInputStream(fi);
			Person1[] people = (Person1[]) os.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Person1> peopleList = (ArrayList<Person1>) os.readObject();

			for (Person1 person : people) {
				System.out.println(person);
			}
			for (Person1 person : peopleList) {
				System.out.println(person);
			}

			int num = os.readInt();

			for (int i = 0; i < num; i++) {
				Person1 person = (Person1) os.readObject();
				System.out.println(person);
			}
			os.close();
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
