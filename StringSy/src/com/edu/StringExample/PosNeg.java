package com.edu.StringExample;

import java.util.Scanner;

public class PosNeg {
	static void PosiNeg(int a[]){
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>0) {
				a[i]=0-a[i];	//0-10=-10
				System.out.println(a[i]);
			}
			else {
				a[i]=0-a[i];
				System.out.println(a[i]);
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int a[]= {10,-20,30,-40};
	PosiNeg(a);
	
	
}
}
