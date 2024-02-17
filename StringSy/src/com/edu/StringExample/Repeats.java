package com.edu.StringExample;

public class Repeats {
	static boolean RepeatEle(String s) {
		for(int i=0;i<s.length();i++) {	//anuja
			char ch=s.charAt(i);		//a
			for(int j=i+1;j<s.length();j++) {	//n
				if(ch==s.charAt(j)) {	
					//a==n
					return true;
				}
			}
		}
		return false;			//false
	}

public static void main(String[] args) {
	String str="anuja";
	System.out.println(RepeatEle(str));
}
}
