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
Student st=new Student();
st.setStudentId(100);
st.setStudentName("ram");
st.setGroup("maths");
Address ad=new Address();
ad.setAddressId(101);
ad.setPlace("chennai");
ad.setStudent(st);
s.persist(ad);
t.commit();
System.out.println("inserted successfully");
s.close();
	}

}
