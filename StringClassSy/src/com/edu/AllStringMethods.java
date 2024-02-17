package com.edu;

public class AllStringMethods {
	public static void main(String[] args) {
		String s1 = "Anuja";
		String s2 = "Hol ";
		s1.concat(s2);
		System.out.println("Immutable :" + s1);
		System.out.println("Comparing String :" + s1.compareTo(s2));
		System.out.println("CharAt :" + s1.charAt(3));
		System.out.println("Concat String :" + s1.concat(s2));// it will concat tostrings
		System.out.println("contains :" + s1.contains(s2));
		System.out.println("endsWith :" + s1.endsWith("uj"));
		System.out.println("indexOf :" + s1.indexOf("A"));
		String p = "lets try try try  to find the index of given no ";
		System.out.println(p.indexOf("r"));
		String a2=new String ("Anuja");
		String a3="Anuja";
		String a4=a2.intern();
		System.out.println("intern :");
		System.out.println(a2==a3);//false
		System.out.println(a3==a4);//true   -->reference variables a4 and a3 pointing to same instance
	}
}
