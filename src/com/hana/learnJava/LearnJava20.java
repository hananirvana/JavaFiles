package com.hana.learnJava;

import java.util.Scanner;

class Robt {
	String sad;
	
	public void sad(String Belle)  {
		System.out.println(Belle);
	}
	public void happy(String Mack)  {
		System.out.println(Mack);
	}
	public void fltr(String wer)  {
		
		if(wer.equalsIgnoreCase("a")) {
		    System.out.println("You love apples!");
		}else if(wer.equalsIgnoreCase("b")) {
			System.out.println("You love basketball!");
		}else if(wer.equalsIgnoreCase("c")) {
			System.out.println("You love cats!");
		}else if(wer.equalsIgnoreCase("d")) {
			System.out.println("You love dos!");
		}	
	}
}

public class LearnJava20 {

	public static void main(String[] args) {

		System.out.println("Type the exact choice that one you want...\n" + "1. \"Sad\"\n" + "2. \"Fav letter\"\n"
				+ "3. \"Happy\" ");
		String answ = new Scanner(System.in).nextLine();

		Robt robot = new Robt();
		if (answ.equalsIgnoreCase("Sad")) {
			robot.sad("Belle: Weep weep");

		} else if (answ.equalsIgnoreCase ("Happy")) {
			robot.happy("Mack: Cuz im happy come along if you feel like a room without a roof oh!");

		} else if (answ.equalsIgnoreCase("Fav letter")) {
			System.out.println("It shows whether you likes Soccer etc.");
			System.out.println("What is your fav letter??? Enter Only 1 character between A to D.");
			String ss = new Scanner(System.in).nextLine();
			if (ss.equalsIgnoreCase("a") || ss.equalsIgnoreCase("b") || ss.equalsIgnoreCase("c")
					|| ss.equalsIgnoreCase("d")) {
				
				robot.fltr(ss);
			} else {
				System.out.println("You have entered a character which out of expected range. Please try again!");
			}

		} else {

			System.out.println("You have entered a wrong choice! Please try again!");

		}

	}
}	



