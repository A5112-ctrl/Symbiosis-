package com.edu;

public class NullPointer {
	public static void main(String[] args) {
		try {
			String l = null;
			System.out.println(l.length());
		} catch (NullPointerException e) {
			System.out.println("String Does not contain any value ");
		}
	}
}
