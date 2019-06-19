package com.pack.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;
import com.pack.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			s.save(c);
			t.commit();
		}catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}

	}
	public int updateCustomer(Customer c) {
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		int i=0;
		//System.out.println("hello");
		try {
			t=s.beginTransaction();
			/*Customer c1=(Customer)s.get(Customer.class,c.getCustid());
			if(c1!=null) {
				c1.setAddress(c.getAddress());
				c1.setAge(c.getAge());
				c1.setSalary(c.getSalary());
				s.update(c1);
			}*/
			String query="Update Customer c set c.address=:add,c.salary=:sal,c.age=:age where c.custid=:cid";
			Query q=s.createQuery(query);
			q.setParameter("cid", c.getCustid());
			q.setParameter("add", c.getAddress());
			q.setParameter("sal", c.getSalary());
			q.setParameter("age", c.getAge());
			//System.out.println(q);
			i=q.executeUpdate();
			System.out.println(i);
			t.commit();
		}catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		return i;
	}
	public void deleteCustomer(int num) {
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=s.beginTransaction();
			Customer c1=(Customer)s.get(Customer.class,num);
			if(c1!=null) {
				s.delete(c1);
			}
			t.commit();
		}catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
	}
	public List<Customer> fetchCustomerById() {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		List<Customer> list=null;
		//Customer c1=null;
		try {
			t=s.beginTransaction();
			 //c1=(Customer)s.get(Customer.class,num);
			String hql="from Customer";
			Query query=s.createQuery(hql);
			list=query.list();
			t.commit();
		}catch(HibernateException e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		return list;
	}

}
