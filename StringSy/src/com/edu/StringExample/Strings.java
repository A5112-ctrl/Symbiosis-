package com.edu.StringExample;

public class Strings {
public static void main(String[] args) {
	String s="hii";
	String s1="hii";
	System.out.println("s ="+s.hashCode());
	System.out.println("s1 ="+s1.hashCode());
	if(s==s1) {//check memory adress
		System.out.println("Both String are equal");
	}
	String s2=new String ("Hello");//heap
	String s3=new String ("Hello");
	if(s2==s3) {
		System.out.println("Both Addrees are same");
	}
	System.out.println("s2 "+s2.hashCode());
	System.out.println("s3 "+s3.hashCode());
	
	if(s2.equals(s3)) {
		System.out.println("Contents are same");
	}
}
}



//String is cSequence of character 
