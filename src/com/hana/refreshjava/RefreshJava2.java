package com.hana.refreshjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RefreshJava2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// Read various things from anywhere!
		System.out.println("In Java, we can read many things and share, like you can read user input, xml files, .txt files etc.");
		
		//read user input
		System.out.println("\n--------This is reading user Input--------");
		
		Scanner scn = new Scanner(System.in);// to import, do ctrl + shift + o;
		
		System.out.println("Hi there, what do you want to echo back to your self?");
		String lineecho = scn.nextLine();
		
		System.out.println("Echo: "+lineecho);
		
		System.out.println("What is a number you want to echo?");
		int numecho = scn.nextInt();
		
		System.out.println("Echo: "+numecho);
		
		//read files using scanner
		System.out.println("\n--------This is reading text files--------");
		
		String fileName = "C:\\Users\\Hayabusa\\Desktop\\HanaJava\\RyanWorkSpace\\HanaJavaLearn\\src\\com\\hana\\refreshjava\\RefreshJava2TextFile";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		in.nextLine();
		
		int count = 2;
		while(in.hasNextLine()) {
			String Line = in.nextLine();
			
			System.out.println(Line);
			count++;
		}
		
		in.close();
		
		//read xml files
		
		List<String> lstname = new ArrayList<>();
		List<String> lstbrand = new ArrayList<>();
		List<String> lstcolor = new ArrayList<>();
		
		System.out.println("\n--------This is reading XML Files--------");
		
		File file = new File("C:\\Users\\Hayabusa\\Desktop\\HanaJava\\RyanWorkSpace\\HanaJavaLearn\\src\\com\\hana\\refreshjava\\RefreshJava2XML.xml");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		
		System.out.println("Root element: "+doc.getDocumentElement().getNodeName()+"\n");
		NodeList nlist = doc.getElementsByTagName("item");
		
		//iterating through the node items 
		for(int i =0;i<nlist.getLength();i++) {
			Node node = nlist.item(i);
			System.out.println(i+"-items: "+node.getNodeName());
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element elm = (Element) node;
				System.out.println("Name :"+elm.getElementsByTagName("name").item(0).getTextContent());
				String name = elm.getElementsByTagName("name").item(0).getTextContent();
				lstname.add(name);
				System.out.println("Brand :"+elm.getElementsByTagName("brand").item(0).getTextContent());
				String brand = elm.getElementsByTagName("brand").item(0).getTextContent();
				lstbrand.add(brand);
				System.out.println("Color :"+elm.getElementsByTagName("color").item(0).getTextContent()+"\n");
				String color = elm.getElementsByTagName("color").item(0).getTextContent();
				lstcolor.add(color);
				
			}
		}
		
		
		for(int i = 0;i<nlist.getLength();i++) {
			System.out.println("Name: "+lstname.get(i));
			System.out.println("Brand: "+lstbrand.get(i));
			System.out.println("Color: "+lstcolor.get(i)+"\n");
		}
	}

}
