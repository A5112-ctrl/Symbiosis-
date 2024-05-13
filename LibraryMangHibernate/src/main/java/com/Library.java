package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Library {
	static Scanner sc=new Scanner(System.in);
	static Students st=new Students();
	
	public static void add() {
		
//		Book b=new Book();
//		System.out.println("Enter book id:");
//		b.setBid(sc.nextInt());
		
		System.out.println("Enter student id:");
		st.setSid(sc.nextInt());
		System.out.println("Enter student name:");
		st.setSname(sc.next());
		System.out.println("Enter quantity :");
		st.setQuantity(sc.nextInt());

		System.out.println("Enter book 	name:");
		st.setBname(sc.next());
		System.out.println("Enter book author name:");
		st.setBauthor(sc.next());
		
		
		//st.setBooks(b);
		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=fact.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.save(st);
		
		t.commit();
		s.close();
		fact.close();
		}
	
	public static void display() {
		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=fact.openSession();
		Transaction t=s.beginTransaction();
//		Read
		List<Students> l=s.createQuery("from Students",Students.class).list();
		for(Students st:l) {
			System.out.println(st.getSid()+" "+st.getSname()+"  "+st.getBname()+" "+st.getBauthor()+" "+st.getQuantity());
		}
		t.commit();
		s.close();
		fact.close();
		
	}
	public static void Update() {
		
		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=fact.openSession();
		Transaction t=s.beginTransaction();
		System.out.println("Enter Student id for update :");
		st=s.get(Students.class, sc.next());
		
		System.out.println("press for update \n1)student name \n2)quantity  \n3)book name   \n4)book author name  ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter new name :");
			String name=sc.next();
			st.setSname(name);
			t.commit();
			System.out.println("name Update succesfully");
			break;
		case 2:
			System.out.println("Enter quantity :");
			st.setQuantity(sc.nextInt());
			t.commit();
			System.out.println("quantity Update succesfully");
			break;
		case 3:
			System.out.println("Enter new book name :");
			st.setBname(sc.next());
			t.commit();
			System.out.println("book name Update succesfully");
			break;
		case 4:
			System.out.println("Enter new book authorname :");
			st.setBauthor(sc.next());
			t.commit();
			System.out.println("book authorname Update succesfully");
		}
		s.close();
		fact.close();
	}
	private static void Delete() {
		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=fact.openSession();
		Transaction t=s.beginTransaction();
		System.out.println("Enter Student id for delete :");
		st=s.get(Students.class, sc.next());
		s.delete(st);
		t.commit();
		System.out.println("Delete succefully");
		System.out.println(st.getSname());
		
		s.close();
	}

	public static void main(String[] args) {
		do{
			System.out.println("press  \n1)Add \n2)Update  \n3)Delete   \n4)All data  ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:	
			add();
			break;
		case 2:
			Update();
			break;
		case 3:
			Delete();
			break;
		case 4:
			display();
	}
		}while(true);

	
}
}
	