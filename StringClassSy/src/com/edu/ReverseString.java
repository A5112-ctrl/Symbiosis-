package com.edu;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(String str) {
		char ch[] = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("Reverse");
	}

	public static void Rev(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	public static String checkVowel(String str) {
		int vowelcount = 0;
		int ConsCount = 0;
		String s1 = str.toLowerCase();

		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if (Character.isAlphabetic(x)) {// it will check only alphabet
				if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
					vowelcount++;
				}
		/*	//else if(Character.isSpace(x)) {}
			else if(Character.isDigit(x)) {
				//is contains digit 
			}
			else if(Character.isWhitespace(x)) {
				//is contains whitespace
			}
		*/
			else {
					ConsCount++;
				}
			}
		}
		return "Vowel Count " + vowelcount + "\nConsonents Count :" + ConsCount;

	}
	public static void RemoveSpch(String s) {
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");		//(ky replace karychay ,kashan replce karaychay)
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String str = "Anuja";
		reverse(str);
		// Rev(str);
		String str2 = "Welcome To Symbiosis Training ";
		System.out.println(str);
		System.out.println(checkVowel(str2));
		String s2="Anuja@5112gmail.com";
		RemoveSpch(s2);

	}
}