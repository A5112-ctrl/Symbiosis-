package com.edu;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetlistadd {
public static void main(String[] args) {
ArrayList <Integer> ar=new ArrayList<Integer>();
ar.add(10);
ar.add(20);
ar.add(30);
System.out.println(ar);



HashSet <Integer>h=new HashSet();
h.add(40);
h.add(60);
h.add(50);
h.add(30);
h.add(70);
System.out.println(h);
//System.out.println("addAll :"+h.addAll(ar));
System.out.println("contains :"+h.contains(ar));
//System.out.println("removeAll :" +h.removeAll(ar));
System.out.println(h);
//h.retainAll(ar);
System.out.println(" retainAll :"+h.retainAll(ar));//dupilcate entry is present then print that values
System.out.println(h);
}
}
