package com.edu1;

import java.util.Scanner;

public class MainApp {
	static Operations op = new Operations();
	static Game gm = new Game();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("---------Welcome to the Number Guessing Game --------");

		
		int points = 1000;
		int ch1;
		do {
			System.out.println("Press 1) To Start Game  2) See Details  ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				gm.Start();
				break;
			case 2:
				gm.SeePoints();
				break;
			default:
				System.out.println("Invalid Entry ");
			}
			System.out.println("Do u want to play again (0/1)");
			ch1 = sc.nextInt();
			if (ch1 == 0) {
				System.out.println("Game Over \nYour Points are :" + points);
			}
		} while (ch1 != 0);
	}

	

	
}
