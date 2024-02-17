package com.edu;

public class Alternate {
	public static void Toggle(String str) {
		System.out.print("Capital letters :");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i%2==0) {		//i-->index
				System.out.print(Character.toUpperCase(ch));
				}
		}System.out.println();
		System.out.print("Small letters :");
		for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(i%2!=0) {
				System.out.print(Character.toLowerCase(ch));
			}
		}System.out.println();
		
	}
public static void main(String[] args) {
	String str="Anuja";
	System.out.println(str.toLowerCase());
	System.out.print("Even position is Capital  :");
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(i%2==0) {		//i-->index
			System.out.print(Character.toUpperCase(ch));
	
			}
		else {
			System.out.print(Character.toLowerCase(ch));
		}
	}System.out.println();
	Toggle(str);
	
}
}
