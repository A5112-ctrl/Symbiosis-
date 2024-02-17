package com.edu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class GretestNumEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList();
		System.out.println("Enter 5 Numbers :");
		for (int i = 0; i < 5; i++) {
			int ar1 = sc.nextInt();
			ar.add(ar1);
		}
		System.out.println(ar);
		int max = 0;
		for (int a : ar) {
			if (a > max) {
				max = a;
			}

		}
		System.out.println(max);

//------------------using treeset--------------------
//		TreeSet<Integer> t = new TreeSet();
//		System.out.println("Enter 5 Numbers :");
//		for (int i = 0; i < 5; i++) {
//			int ar1 = sc.nextInt();
//			t.add(ar1);
//		}
//		System.out.println(t);
//		int max = 0;
//		for (int a : t) {
//
//			if (a > max) {
//				max = a;
//			}
//
//		}
//		System.out.println(max);
//
	}
}
