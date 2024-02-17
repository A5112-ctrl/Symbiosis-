package com.edu;

import java.util.Vector;

public class VectorOp {
public static void main(String[] args) {
	Vector<Integer> v1=new Vector<Integer>();
	System.out.println("Before Capacity :"+v1.capacity());	//initial capacity is 10
	v1.addElement(10);
	v1.addElement(20);
	v1.addElement(30);
	v1.addElement(40);
	System.out.println("After adding elements: "+v1);
	//v1.remove(40);// (we can pass index as parameter)
	v1.removeElement(40);
	System.out.println("After removing a elements: "+v1);
	System.out.println("Check Vector Empty or not : "+v1.isEmpty());
	System.out.println("Size of vector"+v1.size());
	//System.out.println(v1.capacity());
	for (int i=1;i<=20;i++) {
		v1.add(i);
	}
	System.out.println(v1);
	v1.addElement(21);
	Integer i1=v1.elementAt(1);
	System.out.println("Element present at 1 loc: "+i1);
	System.out.println("After Capacity :"+v1.capacity());	//capacity is doubled
}
}
