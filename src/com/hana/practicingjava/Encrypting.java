package com.hana.practicingjava;

import java.security.Signature;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/*import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.hana.learnJava.Person2;*/

public class Encrypting {

	public static void main(String[] args) {
		/*
		 * System.out.println("Typing and encrypting message...");
		 * 
		 * try(ObjectOutputStream os = new ObjectOutputStream(new
		 * FileOutputStream("message.ser"))) { Lock lock1 = new
		 * Lock("Let's have a coffee at 7 PM"); Person2.setCount(100);
		 * os.writeObject(lock1); } catch (FileNotFoundException e) {
		 * System.out.println("Sorry, Your file is not found."); } catch (IOException e)
		 * { System.out.println("Cannot read from specified File."); }
		 * 
		 * System.out.println("Message Sent! Key:message.ser");
		 */
		try {
			KeyGenerator kg = KeyGenerator.getInstance("DES");
			SecretKey mdk = kg.generateKey();
			System.out.println(mdk + ": Key \n");// creates the key used to encrypt and decrypt
			Cipher desCipher = Cipher.getInstance("DES");
			byte[] text = "Hello. You deciphered this!".getBytes("UTF8");
			desCipher.init(Cipher.ENCRYPT_MODE, mdk);//initiate encrypting mode
			byte[] textEncry = desCipher.doFinal(text);//encrypting and storing in a array of bytes
			String s = new String(textEncry);
			System.out.println(s);
			desCipher.init(Cipher.DECRYPT_MODE, mdk);
			byte[] textDecry = desCipher.doFinal(textEncry);
			s = new String(textDecry);
			System.out.println(s);
			
		} catch (Exception ex) {
			System.out.println("We ran into an excecption");
		}
	}

}
