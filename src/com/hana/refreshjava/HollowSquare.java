package com.hana.refreshjava;

public class HollowSquare {

	public static void main(String[] args) {
		int s = 3;
		
		for(int i = 1; i<=s;i++) {
			if(i==1 || i==s) {
				for(int j = 1;j<=s;j++) {
					System.out.print("* ");
				}
			}else {
				System.out.print("* ");
				for(int j = 1; j<=s-2;j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
