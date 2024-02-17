package com.edu1;

import java.util.Random;
import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	static Operations op = new Operations();
	static OperationAut op1=new OperationAut();
	static User us=new User();
	public void Start() {		
		System.out.println("Enter Username :");
		String name = sc.next();
		op.setUsername(name);

		System.out.println("Enter Password :");
		String pwd = sc.next();
		op.setPwd(pwd);
		int point=us.getPoints();
    	point = point - 150;	//1000-150=850
		
		Random rn = new Random();
		int a = rn.nextInt(1, 2);
		System.out.println("Enter any no. between 1 To 20");
		int num = sc.nextInt();
		
		if (num < 2 && num > 0) {
			if (num == a) {
				System.out.println("Hurrey You Win ");
				point = point + 300;	//850+300=1150 
				System.out.println("Points :" + point);
				op.setPoints(point);

			} else {
				System.out.println("Better luck next Time");
				System.out.println("Your Points are :" + point);  	//850
			}
		} else {
			System.out.println("Invalid Number");
		}
	}

	public void SeePoints() {
		System.out.println("Username : " + op.getUsername());
		System.out.println("Password : " + op.getPwd());
		//System.out.println("Point :"+op.getPoints());
	}

	

	

}
