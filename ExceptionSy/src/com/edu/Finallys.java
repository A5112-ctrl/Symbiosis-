package com.edu;

public class Finallys {
public static void main(String[] args) {
	int a=10;
	int b=0;
	int a1[]= {120,23,45};
	try {
	System.out.println(a/b);
	System.out.println("This line is not executed");
	System.out.println(a1[3]);
	}catch(ArithmeticException e) {
		//e.printStackTrace();  //it gives line no at which line
		System.out.println("Exception");
	}
	finally {
		System.out.println("Always be Excecuted");
	}
	
	
	
}
}
