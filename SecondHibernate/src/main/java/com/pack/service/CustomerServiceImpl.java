package com.pack.service;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	public  void insertCustomer(Customer c) {
	new CustomerDaoImpl().insertCustomer(c);
		//return i;
	}

	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().updateCustomer(c);
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public Customer fetchCustomerById(int num) {
		// TODO Auto-generated method stub
		Customer c=new CustomerDaoImpl().fetchCustomerById(num);
		return c;
	}
}
