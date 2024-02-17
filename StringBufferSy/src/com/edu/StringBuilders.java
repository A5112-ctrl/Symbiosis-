package com.edu;

public class StringBuilders {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	sb.append(" Anuja");
	sb.append(" Rutuja");
	sb.append(false);
	sb.append( 20);
	sb.append(" Shree ");
	System.out.println(sb);
	sb.insert(6," Sam ");
	System.out.println(sb);
	sb.delete(17,20);
	System.out.println(sb);
	
}
}
