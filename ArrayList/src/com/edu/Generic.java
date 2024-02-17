package com.edu;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(48);
		arr.add(92);
		arr.add(12);
		// arr.add("Anuja");
		// The method add(Integer) in the type ArrayList<Integer> is not applicable for
		// the arguments (String)
		System.out.println("Integer Array :"+arr);

		ArrayList<Integer> arr1 = new ArrayList();
		arr1.add(18);
		arr1.add(20);
		arr1.add(45);
		arr1.add(12);
		System.out.println("Integer Array :"+arr1);

		ArrayList<String> arr2 = new ArrayList();
		arr2.add("Anuja");
		arr2.add("Shree");
		arr2.add("Sam");
		System.out.println("String Array :"+arr2);
		arr.addAll(arr1);
		System.out.println("Combination :"+arr);//printed in list format ie.in []
		for(int p:arr) {
			System.out.print(p+" ");
			}
	}
}
