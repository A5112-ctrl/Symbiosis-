package com;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	Coach ch=(Coach) context.getBean("cricket");
	System.out.println(ch.GetDiet());
	System.out.println(ch.GetWorkOut());
	System.out.println(ch.getMatchTime());
	
	
	System.out.println("\n****************************\n");
	Coach ch1=(Coach) context.getBean("football");
	System.out.println(ch1.GetDiet());
	System.out.println(ch1.GetWorkOut());
	System.out.println(ch1.getMatchTime());
	
	
	System.out.println("---------------------------");
	Coach ch2=(Coach) context.getBean("football");
	System.out.println(ch2.getMatchTime());

	System.out.println("---------------------------");
	Coach ch3=(Coach) context.getBean("cricket");
	System.out.println(ch3.getMatchTime());
}
}
