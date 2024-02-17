package com.edu;

public class StringBuffers {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println("Initial capacity :"+sb.capacity());
	sb.append("Anuja");
	sb.append("-Rutuja");
	sb.append("-Sam");
	System.out.println(sb);
	String s=sb.toString();
	s.concat("Shree");
	sb.append(false);
	System.out.println(s);
	sb.insert(8, " Ashok ");
	sb.delete(10,15);
	System.out.println(sb);
	sb.insert(8, " Ashok ");
	System.out.println(sb);
	
//	System.out.println("Reverce-----------");
	//sb.reverse();
	Appliances ap=new Appliances ();
	 ap.setGst(100);
	 ap.setProductId(31);
	 ap.setProductName("Santoor");
	 ap.setPrice(4500);
	sb.append(ap);
	System.out.println(sb);
	
	
}
}
