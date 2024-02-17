package com.edu.StringExample;

import java.util.Scanner;

public class EvenOdd {
	static void EvenOdds(int n, int a[]) {
		int count = 0;
		System.out.println("Even no. :");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("Count :" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements to store");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " Data :");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		EvenOdds(n, a);
	}
}
