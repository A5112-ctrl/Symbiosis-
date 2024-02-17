package com.edu;

public class BoxingUnboxing {

	public static void main(String[] args) {
		
	//Boxing --primitive to object 
		int a=10;
		Integer b=Integer.valueOf(a);		//static and contain parameter
		System.out.println(b);
		
		
	//Unboxing ---object to primitive
		Integer p=10;
		int q=p.intValue();			//nonstatic and doesn't contain parameter
		System.out.println(q);
	
	//primitive to string
		int x=30;
		String s1=Integer.toString(x);	//static and contain parameter
		System.out.println(s1);

		//String to primitive
		String s2="1000";
		int a1=Integer.parseInt(s2);		//static and contain parameter
		System.out.println(a1);
		
		Integer ab=150;
		String st=ab.toString();			//nonstatic ,no parameter
		
		String st1="120";
		Integer i1=Integer.parseInt(st1);		//Static ,with parameter
	}
}
