package com.hana.apps;

public class SwitchAround {
	public static void main (String[] arg){
		String hana = "Nirvana Maibam";
		String modifyHana = hana.replaceAll("Nirvana Maibam", "Boom Boom Boom Boom");
		System.out.println("Original Hana's name is =====>" + hana);
		System.out.println("Modified Hana's name is now======>" + modifyHana);
	
	}
}
