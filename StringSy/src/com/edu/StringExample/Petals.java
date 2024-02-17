package com.edu.StringExample;
import java.util.Scanner;
public class Petals {
	static void petals(int ch) {
		String s="I Love You";	
		if(ch%4==1) {
			System.out.println(s+" a lot");
		}else if(ch%4==2) {
			System.out.println(s+" madly");
		}else if(ch%4==3){
		System.out.println(s+" Passinatly ");
		}else {
			System.out.println(s+" more");
		}	
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Enter no. ");
	int n = sc.nextInt();
	//String str[]= {"I love U " ,"A lot ","Madely ","Passinatly ","More "};
		petals(n);
	}
}
}


//if(ch==1) {
//	System.out.println(s+" a lot");
//}else if(ch==2) {
//	System.out.println(s+" more");
//}else if(ch==3) {
//	System.out.println(s+" Passinatly ");
//}else if(ch==4) {
//	System.out.println(s+" madly");
//}