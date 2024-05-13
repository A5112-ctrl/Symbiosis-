package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {
		Emp e=new Emp();
//		FileInputStream fs=new FileInputStream("src/main/java/Anuja.jpg");
//		byte image[]=new byte[fs.available()];
//		fs.read(image);
//		e.setImage(image);
		e.setEid(2);
		e.setEname("Anuj");
		e.setAddress("Pune");
		e.setSalary(1000000);
		e.setJoiningdate(new Date());
		
		Certification c1=new Certification();
		c1.setCertName("ELat");
		c1.setTech("Java");
		e.setCert(c1);
	
		
//		***********Save the data from database********		
		
//		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session sn=factory.getCurrentSession();
//		Transaction tx=sn.beginTransaction();
//		sn.save(e);
//		tx.commit();
//		System.out.println("Done");
//		sn.close();
//		factory.close();
		
		
//		***********Get the data from database********
		
//		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session sn=factory.openSession();
//		Emp em=sn.get(Emp.class, 1);
//		System.out.println(em.getEname());
//		sn.close();
//		factory.close();
		
		
//		***********Delete the data from database********
		
//		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session sn=factory.openSession();
//		Transaction t=sn.beginTransaction();
//		Emp e1=sn.get(Emp.class, 152);
//		sn.delete(e1);
//		t.commit();
//		sn.close();
//		factory.close();
//		System.out.println("deleted");
		
//		***********Update the data from database********	
		
		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=fact.openSession();
		Transaction t1=s.beginTransaction();
		Emp e2=s.get(Emp.class, 1);
		e2.setEname("Suresh");
		t1.commit();
		System.out.println(e2.getEname());
		s.close();
		fact.close();
	    System.out.println("Updated");
	    
	    
	}
}
