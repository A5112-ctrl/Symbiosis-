package com.edu;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String with character ::");
		String str = sc.nextLine();
		char ch=sc.next().charAt(0);
		int cnt = CountChar(str, ch);
		System.out.println( ch+" comes "+cnt+"  times in "+str+" " );
	}

private static int CountChar(String str,char ch) {
	int count=0; 
	for(int i=0;i<str.length();i++) {
	if(str.charAt(i)==ch){
		count++;
	}
	}
	return count;

}
}