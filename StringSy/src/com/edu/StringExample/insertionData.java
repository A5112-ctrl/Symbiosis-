package com.edu.StringExample;

import java.util.Scanner;

public class insertionData {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of elements to store");
	int n=sc.nextInt();
	System.out.println("Enter "+n+" Data :");
	int a[]=new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}
