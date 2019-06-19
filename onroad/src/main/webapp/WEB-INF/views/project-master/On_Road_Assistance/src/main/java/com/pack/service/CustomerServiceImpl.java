package com.pack.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.CustomerDao;
import com.pack.model.Customer;
import com.pack.model.CustomerRequest;
import com.pack.model.Mechanic;
import com.pack.model.User;

@Service
public class CustomerServiceImpl implements CustomerService {

private static Logger log = Logger.getLogger(CustomerServiceImpl.class);
	
	private CustomerDao customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Transactional
	public Customer getCustomerById(int customerId) {
		Customer customer = customerDao.getCustomerById(customerId);
		return customer;
	}

	@Transactional
	public int checkUser(User user) {
		int i = customerDao.checkUser(user);
		return i;
	}

	@Transactional
	public void addCustomer(Customer customer) {
		log.info("Inside Service Add Customer");
		customerDao.addCustomer(customer);
		
	}

	

	@Transactional
	public void addCustomerRequest(CustomerRequest customerRequest) {
		log.info("Inside Service Add Customer Request");
		customerDao.addCustomerRequest(customerRequest);
		
	}

	@Transactional
	public List<Mechanic> listMechanics() {
		List<Mechanic> list = customerDao.listMechanics();
		return list;
	}

}
