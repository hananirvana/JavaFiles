package com.hana.practicingjava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLtest1 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		
		int cartsize = 1;
		Scanner scInt = new Scanner(System.in);// for int input
		Scanner scStr = new Scanner(System.in);// for String input

		System.out.println("----- Welcome to the ONLStore!-----");
		System.out.println("\nWhat would item would you like to buy today?" + "\n Type 1 to view \"Pen\""
				+ "\n Type 2 to view \"Paper\"" + "\n Type 3 to view \"Pencil\"");
		String ans = scStr.nextLine();

		switch (ans) {
		case "debug":
			Debug();
			break;
		case "1":
			ItemFind(0);
			break;
		case "2":
			ItemFind(1);
			break;
		case "3":
			ItemFind(2);
			break;
		default:
			System.out.println("I don't understand your option.");
		}

		System.out.println("Would you like to add this item to your cart? Y or N?");
		String addcart = scStr.nextLine();

		if (addcart.equalsIgnoreCase("Y")) {
			cartsize = +1;
			System.out.println(
					"Sucessfully added to your FastCart! How many more items are you planning to add to your cart? ");
			int items = scInt.nextInt();
				System.out.println("\nWhat would item would you like to buy today?" + "\n Type 1 to view \"Pen\""
						+ "\n Type 2 to view \"Paper\"" + "\n Type 3 to view \"Pencil\"");
				String ans1 = scStr.nextLine();

				switch (ans1) {
				case "debug":
					Debug();
					break;
				case "1":
					ItemFind(0);
					break;
				case "2":
					ItemFind(1);
					break;
				case "3":
					ItemFind(2);
					break;
				default:
					System.out.println("I don't understand your option.");
				}

				System.out.println("Would you like to add this item to your cart? Y or N?");
				String addcart2 = scStr.nextLine();
				if (addcart.equalsIgnoreCase("Y")) {
					cartsize = +1;
					System.out.println(cartsize);
					
				}

			}
			System.out.println("Here is the list of items you are going to buy: ");
		} {

		}


	public static void Debug() throws ParserConfigurationException, SAXException, IOException {

		File file = new File("XMLtest1.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		NodeList nlist = doc.getElementsByTagName("item");
		System.out.println("Length of <item> " + nlist.getLength());
		
		
		    
	
		  
		

		for (int temp = 0; temp < nlist.getLength(); temp++) {

			Node node = nlist.item(temp);

			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element element = (Element) node;

				// get text
				String na = element.getElementsByTagName("name").item(0).getTextContent();
				String pr = element.getElementsByTagName("price").item(0).getTextContent();
				String qu = element.getElementsByTagName("quantity").item(0).getTextContent();

				System.out.println("\nname: " + na);
				System.out.println("price:  " + pr);
				System.out.println("quantity: " + qu);

			}
			
		}
		
	}
	public static ArrayList ItemFind(int num) throws ParserConfigurationException, SAXException, IOException {
		ArrayList<String> lst = new ArrayList<String>();
		File file = new File("XMLtest1.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		NodeList nlist = doc.getElementsByTagName("item");
		Node node = nlist.item(num);

		
		if (node.getNodeType() == Node.ELEMENT_NODE) {

			Element element = (Element) node;

			// get text
			String na = element.getElementsByTagName("name").item(0).getTextContent();
			String pr = element.getElementsByTagName("price").item(0).getTextContent();
			String qu = element.getElementsByTagName("quantity").item(0).getTextContent();
			lst.add(na);
			lst.add(pr);
			lst.add(qu);
			
			System.out.println(lst);
		
			
		}
		
			return lst;
		
		
	}
}
