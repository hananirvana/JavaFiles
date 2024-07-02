package com.hana.practicingjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Decrypting {

	public static void main(String[] args) {
		System.out.println("Recieved Message, decrypting...");
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("message.ser"))) {

			Lock msg = (Lock) os.readObject();
			System.out.println(msg);

		} catch (FileNotFoundException e) {
			System.out.println("Can't find specified file.");
		} catch (IOException e) {
			System.out.println("An error occured.");
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot find lock.");
		}

	}

}
