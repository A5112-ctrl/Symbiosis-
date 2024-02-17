package com.edu;

import java.util.Scanner;

public class Arithmatic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two num :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try{
		int c=a/b;
		System.out.println("Div: "+c);
	}
	
/*  Here we cannot write Parent class exception 
 
	catch (Exception e) {
	System.out.println("Parent Exception");
	}				//due to this it is unreachabgle to the ArithmeticException 
	*/
		catch(ArithmeticException e) {
	
		System.out.println("Can not divide by Zero");
	}
	 catch(NullPointerException e) {
		 System.out.println("If Null Pointer exception occurs then only it run");
	 }
	//Here we can write Parent class exception 
	catch(Exception e) {
		System.out.println("Parent Class Exception");
	}
	System.out.println("Anuja");
	 
}
}
