package com.edu.StringExample;

import java.util.Scanner;

public class SecondElementsFound {
	static boolean SecondEle(int a[],int n) {
		boolean flag=false;
		for(int i=0;i<9;i++) {
			if(n==a[i]) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		if(flag==true) {
			return true;
		}else {
			return false;
		}
	
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1[]= {12,20,3,4,45,56,67,78,89};
		System.out.println("Enter no. ");
		int n=sc.nextInt();
		System.out.println(SecondEle(a1,n));
	
	}
	
}
