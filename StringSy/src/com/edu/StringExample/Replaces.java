package com.edu.StringExample;

import java.util.Scanner;

public class Replaces {
	static void Replace4(int n,int a[]) {
		for(int i=0;i<n;i++) {
			if(a[i]==4) {
				a[i]=11;
				System.out.println(a[i]);
			}else {
				System.out.println(a[i]);
			}
		}
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
		Replace4(n,a);
	
	}
	
}
