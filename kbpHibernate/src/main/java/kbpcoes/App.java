package kbpcoes;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	Mobiles mb=new Mobiles();
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session sn=factory.getCurrentSession();
	Transaction tx=sn.beginTransaction();
	sn.save(mb);
	tx.commit();
	sn.close();
}
}
