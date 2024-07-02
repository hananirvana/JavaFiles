package com.hana.apps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HauntedHouse {

	public static void main(String[] args) throws InterruptedException {
		// ------Declare and assign variables------
		int hp, bsbcond, swrdcond, hunger, days, xp;
		String userinput, level;
		HashMap<Integer, String> inventory = new HashMap<Integer, String>();
		inventory.put(1, "Flashlight");
		inventory.put(2, "Baseball Bat");
		bsbcond = 100;
		hunger = 100;
		days = 1;
		hp = 150;
		xp = 0;
		level = "Level 1";

		// Day 1 -- Exploring
		Scanner scn = new Scanner(System.in);
		System.out.println("You: *thuds* Where am I?\n");
		TimeUnit.SECONDS.sleep(2l);
		System.out.println(
				"Soul: You are in a Haunted House. You have 2 things in your inventory. \nYou have to survive the 5 days of the haunted house.\n");
		TimeUnit.SECONDS.sleep(6l);
		System.out.println(
				"Soul: You have 2 options now. inventory 'i' and explore 'e'. Type the first letter of your option.\n");
		userinput = scn.nextLine();
		if (userinput.equalsIgnoreCase("i")) {
			System.out.println(inventory);
			System.out.println("You: I'll go and explore now.\n");
		}
		System.out.println("Soul: You walk past haunted rooms and you find a unlocked room. \n");
		TimeUnit.SECONDS.sleep(4l);
		System.out.println("You: What should I do? Walk away 'w' or go in 'i'? \n");
		userinput = scn.nextLine();
		if (userinput.equalsIgnoreCase("i")) {
			TimeUnit.SECONDS.sleep(1l);
			System.out.println("Soul: You enter the room. You-\n");
			TimeUnit.MILLISECONDS.sleep(1000l);
			System.out.println("*floor creaks*\n");
			TimeUnit.SECONDS.sleep(2l);
			System.out.println("You: What's that sound?\n");
			TimeUnit.SECONDS.sleep(5l);
			System.out.println("Zombie: GRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\n");
			TimeUnit.SECONDS.sleep(1l);
			System.out.println("Soul: What do you do now? Attack 'a' or run 'r'???\n");
			userinput = scn.nextLine();
			if (userinput.equalsIgnoreCase("a")) {
				System.out.println("You: I'D RATHER ATTACK THAN BE A COWARD!!! yaaa-\n");
				System.out.println("Zombie: *baseball bat hits head* grr... *thud*\n");
				TimeUnit.SECONDS.sleep(4l);
				System.out.println("Soul: Enemy defeated. xp gained: " + 3 + " ,baseball bat condition -" + 10
						+ ", hunger -" + 2 + ". \n");
				bsbcond = bsbcond - 10;
				xp = +3;
				hunger = hunger - 2;
				TimeUnit.SECONDS.sleep(6l);
				System.out.println("You: Phew. I better watch out for enemies.\n");
				TimeUnit.SECONDS.sleep(5l);
				System.out.println(
						"Soul: You take out flashlight and you explore. You find food and a medkit. Keep it 'k'?\n");
				userinput = scn.nextLine();
				if (userinput.equalsIgnoreCase("k")) {
					System.out.println("You: I'll keep both. I might need them.\n");
				}

			} else if (userinput.equalsIgnoreCase("r")) {
				System.out.println("You: RUN!!!");
				TimeUnit.SECONDS.sleep(4l);
				System.out.println(
						"Soul: The zombie bites you. You frantically slam the door, and the zombie's head is cut off.\n");
				TimeUnit.SECONDS.sleep(5l);
				System.out.println("Soul: Enemy dead. hp -" + 5 + ". The zombie bite stings.\n");
				hp = -5;
				TimeUnit.SECONDS.sleep(2l);
				System.out.println("You: Oww that hurts. Better move on.\n");
			}

			
		}
		TimeUnit.SECONDS.sleep(4l);
		System.out.println("Soul: You exit the room. Options: Check Stats 's' or move on?\n");
		userinput = scn.nextLine();
		if (userinput.equalsIgnoreCase("s")) {
			System.out.println("You: Check Stats.\n");
			TimeUnit.SECONDS.sleep(5l);
			System.out.println("Soul: You have hp: " + hp + "| \nbaseball bat condition: " + bsbcond
					+ "| \nhunger: " + hunger + "| \nlevel: " + level + "| \nday: " + days + "| \nxp: " + xp + "|\n");
		}
		System.out.println("Soul: ");
	}

}
