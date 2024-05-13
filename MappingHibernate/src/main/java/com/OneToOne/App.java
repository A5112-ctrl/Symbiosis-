package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session sn=factory.getCurrentSession();
		
		Person p=new Person();
		p.setId(4);
		p.setName("Anuj");
		p.setCity("Pune");
		
		
		Adhar a=new Adhar();
		a.setAdharId(104);
		a.setAdharNo(1234546);
		p.setAdhar(a);
		a.setPerson(p);
		
		Transaction t=sn.beginTransaction();
		sn.save(p);
		sn.save(a);
		t.commit();
		System.out.println("Done");
		sn.close();
		factory.close();
	}
}
