package com.ManyToManyBus;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class newOp {
public static void main(String[] args) {
	
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session sn=factory.getCurrentSession();
	
	Transaction t=sn.beginTransaction();
	Bus b=sn.get(Bus.class, 1);
	System.out.println(b.getBname());
	
	
	Bus bs=sn.get(Bus.class, 1);
	System.out.println(bs.getBname());
	t.commit();
	sn.close();
	
//	1)First leveel Catche
	//If we have to gain same data Again from same session then it will take it first time data from database and second time it will take it from cache memory
	
//			Hibernate: select b1_0.bid,b1_0.bname from Bus b1_0 where b1_0.bid=?
//			Satara
//			Satara
	
	//If we have to gain diff data from same session then it will take it first time and second time also  take data from database 	
//			Hibernate: select b1_0.bid,b1_0.bname from Bus b1_0 where b1_0.bid=?
//			Satara
//			Hibernate: select b1_0.bid,b1_0.bname from Bus b1_0 where b1_0.bid=?
//			Pune
	
	
		Session s=factory.openSession();
		Bus st=s.get(Bus.class, 1);
		System.out.println(st.getBname());
		s.close();
		
		Session s1=factory.openSession();
		Bus st1=s1.get(Bus.class, 1);
		System.out.println(st1.getBname());
		s1.close();
	
	//It we want to gain data from  differnt session then it will fetch database twice
//				Hibernate: select b1_0.bid,b1_0.bname from Bus b1_0 where b1_0.bid=?
//				Satara
//				Hibernate: select b1_0.bid,b1_0.bname from Bus b1_0 where b1_0.bid=?
//				Satara
		
//		1) Second leveel Catche
}
}
