package com.edu;

import java.util.HashSet;

public class HashsetOp {
public static void main(String[] args) {
	HashSet <Integer>hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(20);
	hs.add(50);
	hs.add(null);//duplication is not allowed
	hs.add(null);
	hs.add(10);
	System.out.println("Add " +hs);//insertion order is not maintained 
	hs.remove(10);	//remove data
	System.out.println("After remove" +hs);
	System.out.println("Size :"+hs.size());
	System.out.println("Contains :"+hs.contains(50));
 System.out.println("Is Empty :"+hs.isEmpty());
 //hs.clear();
 System.out.println("After Clear :"+hs);
 System.out.println("Is Empty :"+hs.isEmpty());
 System.out.println();
 Object ob[]=hs.toArray();
 for(Object o:ob) {
	 System.out.println(o);
 }
 
 System.out.println();
}
}
