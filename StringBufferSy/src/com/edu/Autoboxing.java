package com.edu;

public class Autoboxing {
public static void main(String[] args) {
	StringBuffer ab=new StringBuffer();
	ab.append(" Anuja");
	ab.append(" Sujit ");
	System.out.println(ab);
	ab.append( 10);//Autoboxing convert primitive date into obj
	System.out.println(ab);
	StringBuffer sb=new StringBuffer();
	sb.append(" Shree");
	sb.append(" Rutuja");
	sb.append(ab);
	System.out.println(sb);
}
}
