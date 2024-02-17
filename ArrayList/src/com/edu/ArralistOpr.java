package com.edu;

import java.util.ArrayList;
import java.util.Collections;

public class ArralistOpr {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("Anuja");
		arr.add("Rutuja");
		arr.add("Sam");
		arr.add("Shree");
		arr.add("Anita");
		System.out.println("Array Elements :" + arr);
		System.out.println("ArrayList is empty or not :" + arr.isEmpty());
		System.out.println("Adding element atparticular position :");
		arr.add(0, "Ashok");
		System.out.println(arr);
		System.out.println("Last Index :" + arr.lastIndexOf("Sam"));
		System.out.println("Index of String :" + arr.indexOf("Anuja"));
		System.out.println("Remove array element :" +arr.remove(3));
		System.out.println(arr);
		//set()	-replace element
		System.out.println("Setting  Up element :" +arr.set(3, "Omkar"));
		Collections.sort(arr);
		System.out.println("Sorting Data: "+arr);
		System.out.println("Getting Data from Particular position :"+arr.get(1));
		
	}
}
