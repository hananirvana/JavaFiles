package com.hana.learnJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class LearnJava50 {
	//In this LearnJava program, we are showing how to serialize arrays. The code is similar to LearnJava49.
	//Person1 and ReadObjects is connected.
	public static void main(String[] args) {
		System.out.println("Writing Objects...");
		
		Person1[] people = {new Person1(1, "Sue"), new Person1(2, "Bob"), new Person1(3, "Mike")};
		
		ArrayList<Person1> peopleList = new ArrayList<Person1>(Arrays.asList(people));
		
		try(FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
			
			os.writeObject(people);
			
			os.writeObject(peopleList);
			
			os.writeInt(peopleList.size());
			
			for(Person1 person: peopleList) {
				os.writeObject(person);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
