package com.ManyToManyBus;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Depo {

	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session sn=factory.getCurrentSession();
		Transaction t=sn.beginTransaction();
		
		Bus bus1=new Bus();
		bus1.setBid(1);
		bus1.setBname("Satara");
		
		Bus bus2=new Bus();
		bus2.setBid(2);
		bus2.setBname("Pune");
		
		BusDriver driver1=new BusDriver();
		driver1.setDid(101);
		driver1.setDname("Akash");
		
		BusDriver driver2=new BusDriver();
		driver2.setDid(102);
		driver2.setDname("Prakash");
		
		List<Bus>buses=new ArrayList<Bus>();
		buses.add(bus1);
		buses.add(bus2);
		
		List<BusDriver> drivers=new ArrayList<BusDriver>();
		drivers.add(driver1);
		drivers.add(driver2);
		
		bus1.setBusdriver(drivers);
		bus2.setBusdriver(drivers);
		
		sn.save(bus1);
		sn.save(bus2);
		sn.save(driver1);
		sn.save(driver2);

		System.out.println("Done");

		Query q=sn.createQuery("from Bus",Bus.class);
		List <Bus>list=q.list();
		
		for(Bus b:list) {
			System.out.println(b.getBid()+" "+b.getBname());
			List<BusDriver> l=b.getBusdriver();
			for(BusDriver bd:l) {
				System.out.println(b.getBname()+" "+bd.getDname());
			}
		}
		
		Query q1=sn.createQuery("from BusDriver",BusDriver.class);
		List <BusDriver>list1=q1.list();
		
		for(BusDriver b1:list1) {
			System.out.println(b1.getDid()+" "+b1.getDname());
		}
	
//		*********Fetch data********
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bus id :");
		Query q2=sn.createQuery("from Bus where bid=:ch");
		q2.setParameter("ch", sc.next());
		List<Bus> lis=q2.list();
		for(Bus ps: lis) {
			System.out.println(ps.getBname());
		}
		

		t.commit();
		
//		**********Delete Dataa*************
		
//		System.out.println("Enter bus id :");
//		int ch=sc.nextInt();
//		Query q3=sn.createQuery("delete from Bus where bid=:ch");
//		q3.setParameter("ch", ch);
//		q3.executeUpdate();
//		System.out.println("Delete");
//		t.commit();
		
		
		
		//*********Update Data*****************
		
//		System.out.println("Enter bus id and bus name :");
//		int ch=sc.nextInt();
//		String n=sc.next();
//		Query q3=sn.createQuery("update Bus set bname=:name where bid=:ch");
//		
//		q3.setParameter("name",n);
//		q3.setParameter("ch", ch);
//		q3.executeUpdate();
//		System.out.println("Update");
//		t.commit();
		sn.close();
		factory.close();
	}

}
