package com.hana.apps;

import java.util.Scanner;

public class StringPlayAround {

	public static void main(String[] args) {
		//To print a string
				
			
				String str= "Hana Maibam";
				
				//Assigning string to another variable
				String str1 = str;
				System.out.println(str1 + "\n");

				//To find the length of the String using LENGTH
				int strLength = str.length();
				System.out.println("Length of the given string is=====>" + strLength + "\n");
				
				//To Change String to Upper Case using TOUPPERCASE
				String strUpCase = str.toUpperCase();
				System.out.println("Given string in Upper Case is =======>" + strUpCase + "\n");
				
				//To Change String to Lower Case using TOLOWERCASE
				String strLowCase = str.toLowerCase();
				System.out.println("Given string in Lower Case is =======>" + strLowCase + "\n");
				
				//To remove Digits from a given String using REPLACEALL
				String strRmvDigits = str.replaceAll("[0-9]", "");
				System.out.println("After Removing Digits from given string is ========>" + strRmvDigits + "\n");
				
				//To Replace a specific Letter into another letter e.g. a to Z using REPLACE
				String strReplaceLetter =  str.replace("a", "Z");
				System.out.println("After Replacing 'a' with 'Z' in the given string is=======>" + strReplaceLetter + "\n");
				
				//To get only a few portion of string from given string using SUBSTRING with only Starting index
				String strCutString = str.substring(1);
				System.out.println("After cutting The Letters from 21 is =====>" + strCutString + "\n");
				
				//To get only a few portion of string from given string using SUBSTRING with only Starting and Ending indexes
				String strCutString2 = str.substring(0, 2);
				System.out.println("Substring of given string is =========>" + strCutString2 + "\n");
				
				//To split a given string
				String[] strSpliter = str.split(" ");
				System.out.println("Length of the String list is =======>" + strSpliter.length);
				System.out.println("The first part of the String list is =======>" + strSpliter[0]);
				System.out.println("The Second part of the String list is =======>" + strSpliter[1].trim() + "\n");
				
				//To convert String into Integer
				String strVal = "123";
				int intVal = Integer.parseInt(strVal);
				System.out.println("The interger value is ======>" + intVal);
				int b = 10;
				int sum = intVal + b;
				System.out.println("Sum is ======>" + sum + "\n");
				
				//To get Age from given String and add 10 to it.
				String str3= "Hana Maibam 11 years old Bengaluru";
				String strAge = str3.replaceAll("[a-z A-Z ,]", "");
				System.out.println("After Replacing all characters except digits is =======>" + strAge);
				int intAge = Integer.parseInt(strAge); //Converting strAge from String to Integer data type
				int c = 10;
				int totalAge = intAge + c;
				System.out.println("After Adding 10 years to given age is =======>" + totalAge + "\n");
				
				//Convert the age to String and replace the original Age in given string
				String srtNewAge = String.valueOf(totalAge); //Converting totalAge from Integer to String data type
				String str2 = str3.replace("11", srtNewAge);
				System.out.println("New String is =========>" + str2);
				System.out.println("Final String is =======>" + str2.replace("Bengaluru", "America"));
				

	}

}
