package com.edu.sym;

abstract class Coach {
	public abstract String getCoachname();

	public abstract String getWorkout();

	public abstract String getPractice();

	public void name() {
		System.out.println("ABCD Coaching ");
	}
}

class Cricket extends Coach {
	public String getCoachname() {
		return "Virat Kohli";
	}

	public String getWorkout() {
		return "Batting";
	}

	public String getPractice() {
		return "running";
	}
}

class football extends Coach {
	public String getCoachname() {
		return "Junior neymar";
	}

	public String getWorkout() {
		return "push ups";
	}

	public String getPractice() {
		return "stretching ";
	}

}

public class AppCoach {
	public static void main(String[] args) {
		System.out.println("Cricket");
		System.out.println("------------------------");
		Cricket c1 = new Cricket();
		System.out.println(c1.getCoachname());
		System.out.println(c1.getPractice());
		System.out.println(c1.getWorkout());
		c1.name();
		System.out.println("Foot Ball");
		System.out.println("------------------------");
		football f1 = new football();
		System.out.println(f1.getCoachname());
		System.out.println(f1.getPractice());
		System.out.println(f1.getWorkout());
		c1.name();
	}
}
