package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session sn=factory.getCurrentSession();
		Transaction t=sn.beginTransaction();

		Persons p=new Persons();
		p.setPid(10);
		p.setContactnum(54654646);

		Contacts con1=new Contacts();
		con1.setCid(1);
		con1.setCname("Anuja");
		con1.setPerson(p);
		
		Contacts con2=new Contacts();
		con2.setCid(2);
		con2.setCname("Sneha");
		con2.setPerson(p);
		
		Contacts con3 =new Contacts();
		con3.setCid(3);
		con3.setCname("Sam");
		con3.setPerson(p);
		
		List <Contacts> c=new ArrayList<Contacts>();
		c.add(con1);
		c.add(con2);
		c.add(con3);
		p.setC(c);
		
		sn.save(p);
		sn.save(con3);
		sn.save(con2);
		sn.save(con1);
		t.commit();
		System.out.println("Done");
		sn.close();
		factory.close();
		
		
	
		
		
	}
}
