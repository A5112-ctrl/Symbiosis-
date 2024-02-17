package com.edu;

import java.util.LinkedHashSet;

public class LinkedHashSetOp {
	public static void main(String[] args) {
		LinkedHashSet <String> ls =new LinkedHashSet();
		ls.add("Anuja");
		ls.add("Shree");
		ls.add("Rutuja");
		ls.add("Sam");
		ls.add("Shree");
		ls.add("Anuja");
		ls.add(null);
		ls.add(new String("Shree"));
		System.out.println(ls);
	}
}
