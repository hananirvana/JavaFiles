package com.hana.learnJava;

import java.util.ArrayList;
import java.util.List;

public class Array_ArrayList {

	public static void main(String[] args) {
		
		//String Array
		String[] teacherName = {"Rajender","Deepa","Soumya","Vinutha","Deepika"};
		
		//ListArray of String
		List<String> strName = new ArrayList<>();
		 
		System.out.println(teacherName.length);
		
		
		for(String n: teacherName) {
			//System.out.println(n);
			strName.add(n);
		}
		
		//System.out.println(strName.toString());
		
		for(String s: strName) {
			System.out.println(s);
		}

	}

}
