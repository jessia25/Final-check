package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	private static Logger log=Logger.getLogger(CustomerDaoImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
   log.info("inside dao's add customer");
   sessionFactory.getCurrentSession().save(c);
	}

	@Override
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		log.info("inside dao's update method");
		sessionFactory.getCurrentSession().update(c);
	}

	@Override
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from Customer");
		List l=q.list();
		return l;
	}

	@Override
	public Customer getCustomerById(Integer cid) {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from Customer c where c.id=:id");
		q.setParameter("id", cid);
		Customer c=(Customer)q.uniqueResult();
		return c;
	}

	@Override
	public void removeCustomer(Integer cid) {
		// TODO Auto-generated method stub
		log.info("inside dao's delete method");
		Customer c=(Customer)sessionFactory.getCurrentSession().get(Customer.class,cid);
		if(c!=null)
			sessionFactory.getCurrentSession().delete(c);
	}

}
