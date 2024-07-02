package com.hana.learnJava;

class OuterC {
	int x = 10;
	class InnerC {
		int y = 5;
	}
}

public class LearnJava46 {

	public static void main(String[] args) {
		OuterC oc = new OuterC();
		OuterC.InnerC ic = oc.new InnerC();
		System.out.println(ic.y + oc.x);

	}

}
