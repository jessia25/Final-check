package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Employee e1=new Employee();
		e1.setName("Ram");
		Regular_Employee e2=new Regular_Employee();
		e2.setName("sam");
		e2.setSalary(20000);
		e2.setBonus(1000);
		Contract_Employee e3=new Contract_Employee();
		e3.setName("raj");
		e3.setPay_hour(10);
		e3.setContract_duration("2 hr");
		s.persist(e1);
		s.persist(e2);
		s.persist(e3);
		t.commit();
		System.out.println("inserted  successfully");
		s.close();
	}

}
