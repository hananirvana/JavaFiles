package com.hana.practicingjava;

public class ReversingStrings {

	public static void main(String[] args) {
		String name = "34279834iuhbuidsaghana";
		int num = 2341;
		System.out.println(myReverse(name));
		
		
		
	}
	
	public static int myReverse(String name) {
		String s = name + "";
	    String[] digits = s.split("");
	    String output = "";

	    for (String str : digits) {
	      int i = Integer.parseInt(str);
	      output +=  i * i;
	    }

	    return Integer.parseInt(output);
	}
}
