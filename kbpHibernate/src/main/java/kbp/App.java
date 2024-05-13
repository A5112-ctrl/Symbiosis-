package kbp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	mobile mb=new mobile();
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session sn=factory.getCurrentSession();
	Transaction tx=sn.beginTransaction();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr Id");
	mb.setId(sc.nextInt());
	System.out.println("Enter Name");
	mb.setName(sc.next());
	sn.save(mb);
	tx.commit();
	sn.close();
	
}
}
