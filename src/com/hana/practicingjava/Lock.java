package com.hana.practicingjava;

import java.io.Serializable;

public class Lock implements Serializable {
	private static final long serialVersionUID = -7244565484870798524L;
	private String msg;

	private static int count;

	public Lock() {
		System.out.println("Default Constructor.");
	}

	public Lock(String msg) {
		this.msg = msg;
		System.out.println("Two-Argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Lock.count = count;
	}

	@Override
	public String toString() {
		return "Message: " + msg;
	}
}
