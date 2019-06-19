package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	public  void insertCustomer(Customer c) {
	new CustomerDaoImpl().insertCustomer(c);
		//return i;
	}

	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		int i=new CustomerDaoImpl().updateCustomer(c);
		return i;
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public List<Customer> fetchCustomerById() {
		// TODO Auto-generated method stub
		List<Customer> c=new CustomerDaoImpl().fetchCustomerById();
		return c;
	}
}
