package com.hana.practicingjava;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		String password = "";
		Scanner scn = new Scanner(System.in);
		int userinput = 0;
		System.out.println("Welcome to SafeGen! How may I help you today?");
		System.out.println("1. Generate Password with numbers and letters ONLY"+"\n2. Generate Password with special characters, numbers and letters");
		userinput = scn.nextInt();
		if(userinput == 1) {
			System.out.println("How long do you want your password to be? Min 4.");
			userinput = scn.nextInt();
			System.out.println(withnumlet(userinput));
		} else if(userinput == 2 ) {
			System.out.println("How long do you want your password to be? Min 4.");
			userinput = scn.nextInt();
			System.out.println(withcharnumlet(userinput));
		}
		
	}
	
	public static String withnumlet(int length) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String randpas = "";
        Random r = new Random();
        for(int i = 1; i<=length; i++) {
        	char ran1 = alphabet.charAt(r.nextInt(alphabet.length()));
            randpas = randpas + ran1;
        }
		return randpas;
	}
	public static String withcharnumlet(int length) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_.|!@#$%^a&*()~`><][";
		String randpas = "";
        Random r = new Random();
        for(int i = 1; i<=length; i++) {
        	char ran1 = alphabet.charAt(r.nextInt(alphabet.length()));
            randpas = randpas + ran1;
        }
		return randpas;
	}
}
