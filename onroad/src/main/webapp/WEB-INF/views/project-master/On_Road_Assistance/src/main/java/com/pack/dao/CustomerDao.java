package com.pack.dao;

import java.util.List;

import com.pack.model.Customer;
import com.pack.model.CustomerRequest;
import com.pack.model.Mechanic;
import com.pack.model.User;

public interface CustomerDao {

	public Customer getCustomerById(int customerId);
	
	public int checkUser(User user);
	
	public void addCustomer(Customer customer);
	
	

	public void addCustomerRequest(CustomerRequest customerRequest);

	public List<Mechanic> listMechanics();
}
