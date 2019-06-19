package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.pack.model.Customer;
import com.pack.model.CustomerRequest;
import com.pack.model.Mechanic;
import com.pack.model.User;

public class CustomerDaoImpl implements CustomerDao {

private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private static Logger log = Logger.getLogger(CustomerDaoImpl.class);
	
	public int checkUser(User user) {
		Query q = sessionFactory.getCurrentSession().createQuery("from User u where u.userId=:id and u.password=:password and u.type=:type ");
		q.setParameter("id", user.getUserId());
		q.setParameter("password", user.getPassword());
		q.setParameter("type", user.getType());
		User user1 = (User) q.uniqueResult();
		if(user1!=null)
		{
			return 1;
		}
		else
		return 0;
	}
	
	public Customer getCustomerById(int customerId) {
		Query q = sessionFactory.getCurrentSession().createQuery("from Customer c where c.id=:id");
		q.setParameter("id", customerId);
		Customer customer = (Customer) q.uniqueResult();
		return customer;
	}

	
	public void addCustomer(Customer customer) {
		log.info("Inside Add Customer Dao");
		sessionFactory.getCurrentSession().save(customer);
		
		
		 //Query q = sessionFactory.getCurrentSession().createQuery("insert into User(userId,password,type) select customerId,password, from Customer");
		  // int i = q.executeUpdate();
		
		User user=new User();
		user.setUserId(customer.getCustomerId());
		user.setPassword(customer.getPassword());
		user.setType("C");
		
		sessionFactory.getCurrentSession().save(user);
		
		
	}

	public void addCustomerRequest(CustomerRequest customerRequest) {
		log.info("Inside Add Customer Dao");
		sessionFactory.getCurrentSession().save(customerRequest);
		
	}

	public List<Mechanic> listMechanics() {
		
		Query q = sessionFactory.getCurrentSession().createQuery("select m, avg(r.rating) from Mechanic m,Rating r group by m.mechanicId");
		List<Mechanic> list =q.list();
		return list;
	}

	
	

}
