package com.pack.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import com.pack.model.Mechanic;
import com.pack.model.User;

public class MechanicDaoImpl implements MechanicDao {

private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private static Logger log = Logger.getLogger(MechanicDaoImpl.class);
	
	
	public void addMechanic(Mechanic mechanic) {
		// TODO Auto-generated method stub
		log.info("Inside Add Customer Dao");
		sessionFactory.getCurrentSession().save(mechanic);
		
		User user=new User();
		user.setUserId(mechanic.getMechanicId());
		user.setPassword(mechanic.getPassword());
		user.setType("M");
		
		sessionFactory.getCurrentSession().save(user);
		
	}
}
