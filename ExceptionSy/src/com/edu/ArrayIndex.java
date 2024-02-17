package com.edu;

public class ArrayIndex {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Data Not Available");
		}
	}
}