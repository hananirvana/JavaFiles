package com.hana.practicingjava;

import java.util.Scanner;

public class StudentMarks {

	/*
	 * Requirements: A+ has to be 90 and above
	 * A has to be 80 and above but lesser than 90
	 * B has to be 70 and above but lesser than 80
	 * C has to be 60 and above but lesser than 70
	 * F has to be lesser 60
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name;
		int id;
		int grade;
		System.out.println("Student Name?");
		name = scn.nextLine();
		System.out.println("Student ID?");
		id = scn.nextInt();
		System.out.println("Student Grade?");
		grade = scn.nextInt();
		
		System.out.println("ID: "+id+" | Name: "+name+" | Grade: "+grade);
		
		if(grade >=90) {
			System.out.println("Student "+name+" recieved A+");
		}else if(grade >=80 && grade <90) {
			System.out.println("Student "+name+" recieved A");
		}else if(grade >=70 && grade <80) {
			System.out.println("Student "+name+" recieved B");
		}else if(grade >=60 && grade <70) {
			System.out.println("Student "+name+" recieved C");
		}else {
			System.out.println("Student "+name+" recieved F");
		}
	}

}
