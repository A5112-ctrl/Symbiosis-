package com.edu;

import java.util.Scanner;

public class Palindrome {

	public static boolean Palindrome(String s1) {
		char s[] = s1.toCharArray();
		String temp=s1;
		String rev="";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev=rev+temp.charAt(i);
		}
		if(temp.equals(rev)) {
			return true;
		}else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		System.out.println(Palindrome(str));
		if(true) {
			System.out.println("Palindrome ");
		}else {
			System.out.println("NOt Palindrome");
		}
	}
}
