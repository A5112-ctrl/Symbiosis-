package com.edu;

import java.util.TreeSet;

public class TreeOp {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet();
	t.add(10);
	//t.add(null);//we can  not add null values
	t.add(20);
	t.add(30);
	t.add(30);
	System.out.println("t :"+t);
	TreeSet <String> t1=new TreeSet();
	t1.add("Anuja");
	t1.add("Rutuja");
	t1.add("Shree");
	t1.add("Sam");
	System.out.println(t1);//output in ascending oreder
	t1.remove("Sam");
	System.out.println("Remove : "+t1);
	t1.add("Anita");
	//t1.contains(t);
	System.out.println("First :"+t1.first());
	System.out.println("Is Empty :"+t1.isEmpty());
	System.out.println("Last :"+t1.last());
	System.out.println("Size :"+t1.size());
	System.out.println("t1 :"+t1);
	Object ob[]=t1.toArray();
	for(Object o:ob) {
		System.out.println(o);
		
	}
  }
}
