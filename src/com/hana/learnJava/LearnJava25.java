package com.hana.learnJava;

class Learning {
	
	private int meetingCode;
	private String accountName;
	
	public Learning(int meetingCode, String accountName ) {
		this.meetingCode = meetingCode;
		this.accountName = accountName;
	}
	
	public String toString() {
		return String.format("%4d: %s", meetingCode, accountName);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(meetingCode).append(": ").append(accountName);
		return sb.toString();
		*/
		
		
	}
	
	
}

public class LearnJava25 {

	public static void main(String[] args) {
		Learning lr = new Learning(5723879, "John Williams");
		Learning lr1 = new Learning(3243232, "Tyler Breswood");
		System.out.println(lr);
		System.out.println(lr1);

	}

}
