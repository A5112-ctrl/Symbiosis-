package com.edu;

import java.util.Scanner;

public class NumFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		String a = sc.next();

		try {
			int b = Integer.parseInt(a);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("You entered String");
		}

	}
}
