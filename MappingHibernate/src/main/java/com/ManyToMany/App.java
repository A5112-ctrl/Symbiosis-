package com.ManyToMany;

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
		
		
		Student s1=new Student();
		s1.setSid(111);
		s1.setName("Anuja");
		s1.setMarks(95);
		
		Student s2=new Student();
		s2.setSid(151);
		s2.setName("Sneha");
		s2.setMarks(85);
	
		
		Student s3=new Student();
		s3.setSid(161);
		s3.setName("Sam");
		s3.setMarks(78);
		
		
		
		List <Student> l1=new ArrayList<Student>();
		l1.add(s2);
		l1.add(s1);
		l1.add(s3);
		
		Cources c1=new Cources();
		
		c1.setCid(41);
		c1.setCname("Java");
		c1.setCduration(4);
		c1.setStudent(l1);
		

		Cources c2=new Cources();
		
		c2.setCid(51);
		c2.setCname("Python");
		c2.setCduration(2);
		c2.setStudent(l1);
		

		Cources c3=new Cources();
		
		c3.setCid(61);
		c3.setCname("C");
		c3.setCduration(5);
		c3.setStudent(l1);
		
		List <Cources> l2=new ArrayList<Cources>();
		l2.add(c2);
		l2.add(c1);
		l2.add(c3);
		
		s2.setCource(l2);
		s1.setCource(l2);
		s3.setCource(l2);
		
		Transaction t= sn.beginTransaction();
		sn.save(s1);
		sn.save(s2);
		sn.save(s3);
		sn.save(c1);
		sn.save(c2);
		sn.save(c3);
		t.commit();
		System.out.println("Done");
		sn.close();
		factory.close();
	}
}
