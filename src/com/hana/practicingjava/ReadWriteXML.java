package com.hana.practicingjava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadWriteXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		List<String> lstID = new ArrayList<>();
		List<String> lstFName = new ArrayList<>();
		List<String> lstMarks = new ArrayList<>();
		
//		HashMap<String, String> mylstID = new HashMap<>();
		
		File file = new File("NewFile.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
		NodeList nlist = doc.getElementsByTagName("student");
		System.out.println(nlist.getLength());
		
		//iterating through the node students ID 
		for(int i =0;i<nlist.getLength();i++) {
			Node node = nlist.item(i);
			System.out.println(i+"-Nodes: "+node.getNodeName());
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element elm = (Element) node;
				System.out.println("Student Id: "+elm.getElementsByTagName("id").item(0).getTextContent());
				String studentID = elm.getElementsByTagName("id").item(0).getTextContent();
				lstID.add(studentID);
				System.out.println("Student First Name: "+elm.getElementsByTagName("firstname").item(0).getTextContent());
				String studentName = elm.getElementsByTagName("firstname").item(0).getTextContent();
				lstFName.add(studentName);
				System.out.println("Student Marks: "+elm.getElementsByTagName("marks").item(0).getTextContent());
				String studentMark = elm.getElementsByTagName("marks").item(0).getTextContent();
				lstMarks.add(studentMark);
				//mylstID.put(studentID, studentName);
			}
		}
		
		//System.out.println("Students Mark: "+ mylstID.toString());
		//System.out.println(lstID);
		//System.out.println(lstFName);
		//System.out.println(lstMarks);
		
		for(int i = 0; i< lstID.size(); i++) {
			System.out.println(lstID.get(i) + " - " + lstFName.get(i) + " got " + lstMarks.get(i) + " marks");
		}
			
	}

}
