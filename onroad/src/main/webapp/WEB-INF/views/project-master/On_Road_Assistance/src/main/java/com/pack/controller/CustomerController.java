package com.pack.controller;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Customer;
import com.pack.model.CustomerRequest;
import com.pack.model.User;
import com.pack.service.CustomerService;


@Controller
public class CustomerController {

	private static Logger log = Logger.getLogger(CustomerController.class);
	
private CustomerService customerService;
	
	@Autowired(required=true)
	@Qualifier(value="customerService")
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping(value="/login")
	public String checkUser(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		
		
		HttpSession session = request.getSession();
		
		User user = new User();
		user.setUserId(Integer.parseInt(request.getParameter("userid")));
		user.setPassword(request.getParameter("password"));
		user.setType(request.getParameter("type"));
		int i = customerService.checkUser(user);
		
		if(i==1 && user.getType().equals("C"))
		{
			session.setAttribute("customerId",user.getUserId());
			//request.setAttribute("customerId", user.getUserId());
			return "CustomerHome";
		}
		else if(i==1 && user.getType().equals("M"))
		{
			request.setAttribute("mechanicId", user.getUserId());
			return "MechanicHome";
		}
		else if(i==0)
		{
		
			
		}
		
		return "Login";
	}
	

	
	@RequestMapping(value="/registerCustomer", method=RequestMethod.GET)
	public String registerCustomer(@ModelAttribute("customer") @Validated Customer customer,BindingResult bindingResult,Model model)
	{
		model.addAttribute("customer",new Customer());
		return "CustomerRegister";
	}
	
	
	
	@RequestMapping(value="/customerLogin", method=RequestMethod.GET)
	public String loginCustomer()
	{
		return "CustomerLogin";
	}
	
	@RequestMapping(value="/customer/registerCustomer", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") @Validated Customer customer,BindingResult bindingResult,Model model)
	{
		if(bindingResult.hasErrors())
		{
			log.info("Validation Error");
			return "CustomerRegister";
		}
		else
		{
			Random rand = new Random();
			int num = rand.nextInt(900000)+1000000;
			customer.setCustomerId(num);
			log.info("Inside Add Customer");
			customerService.addCustomer(customer);
		}
		
		return "CustomerHome";
	}
	
	
	
	
	
	@RequestMapping(value="/customer/request", method=RequestMethod.GET)
	public String requestMechanic(Map<String,Object>map,HttpServletRequest request,HttpServletResponse response,Model model)
	{
		HttpSession session = request.getSession();
		int customerId =(int) session.getAttribute("customerId");
		Customer customer = customerService.getCustomerById(customerId);
		
		CustomerRequest customerRequest = new CustomerRequest();
		customerRequest.setCustomerId(customer.getCustomerId());
		customerRequest.setContactNumber(customer.getContactNumber());
		customerRequest.setCustomerName(customer.getCustomerName());
		customerRequest.setEmail(customer.getEmail());
		log.info("Getting details for Customer Id "+customerId);
		
		map.put("customerRequest",  customerRequest);
		return "CustomerRequest";
	}
	
	@RequestMapping(value="/customer/search", method=RequestMethod.POST)
	public String searchMechanic(@ModelAttribute("customerRequest") @Validated CustomerRequest customerRequest,BindingResult bindingResult,Model model)
	{
		customerService.addCustomerRequest(customerRequest);
		
		model.addAttribute("mechanicList", customerService.listMechanics());
		
		return "MechanicList";
	}
}
