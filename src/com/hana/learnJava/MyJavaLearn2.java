package com.hana.learnJava;

public class MyJavaLearn2 {

	public static void main(String[] args) {

		String myName = "Hana Maibam 5";
		String fName = myName.substring(0, 4);
		System.out.println(fName);
		String lName = myName.substring(5, 11);

		System.out.println(lName);
		String num = myName.substring(12);
		System.out.println(num);

		int e = 3;
		System.out.println(((Object) e).getClass().getName());
		int sum;
		//int ee =  2;

		sum = e + Integer.parseInt(num);
		System.out.println(sum);

		String e1 = String.valueOf(e);
		System.out.println(e1.concat(num));
		//System.out.println(e+ee);
		System.out.println(e1.getClass());

		// int add;
		String add = "";
		String m = "25";
		int n = 10;
		System.out.println(add);

	}

}
