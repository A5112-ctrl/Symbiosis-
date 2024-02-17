package com.edu;

import java.util.Scanner;

public class CamelCase {
public static boolean camel(String str) {
	//String str="Anuja";
	//char ch[]=str.toCharArray();
	//System.out.println(ch);
	for(int i=0;i<=str.length();i++) {
		char ch=str.charAt(i);
		if(i%2==0) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				return true;
			}else {
				return false ;
			}
		}
	}
	return false;
	
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter name :");
	
	 String p=sc.next();
	System.out.println(CamelCase.camel(p));
}}}

//alternate letters if vowels then return true 	--banana --> a a a are vowels hence return true
//kiti vela hash ala ahe tevdhya vela te remove krnar    abnv#asdf##dfgg  	-->  abnasdfgg