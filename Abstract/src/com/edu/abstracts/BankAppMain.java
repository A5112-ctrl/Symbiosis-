package com.edu.abstracts;

abstract class Bank{
	float rateOfInterest() {
		return 8.5f;
	}
}
class ICICI extends Bank{
	float rateOfInterest() {
		return 9f;
	}
	
}
class IDBI extends Bank{
	float rateOfInterest() {
		return 7.6f;
	}
	
}

class SBI extends Bank{
	float rateOfInterest() {
		return 12.6f;
	}
	
}
public class BankAppMain {
public static void main(String[] args) {
	IDBI idbi=new IDBI();
	System.out.println("RAte of Intersert :"+idbi.rateOfInterest());
	
	ICICI icici=new ICICI();
	System.out.println("RAte of Intersert :"+icici.rateOfInterest());
	
	SBI sbi=new SBI();
	System.out.println("RAte of Intersert :"+sbi.rateOfInterest());
	
}
}
