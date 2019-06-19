package com.pack.controller;

import java.util.Random;

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

import com.pack.model.Mechanic;
import com.pack.service.MechanicService;

@Controller
public class MechanicController {

	private static Logger log = Logger.getLogger(CustomerController.class);
	
	private MechanicService mechanicService;
	
	@Autowired(required=true)
	@Qualifier(value="mechanicService")
	public void setMechanicService(MechanicService mechanicService) {
		this.mechanicService = mechanicService;
	}
	
	@RequestMapping(value="/registerMechanic", method=RequestMethod.GET)
	public String registerMechanic(@ModelAttribute("mechanic") @Validated Mechanic mechanic,BindingResult bindingResult,Model model)
	{
		model.addAttribute("mechanic",new Mechanic());
		return "MechanicRegister";
	}
	
	@RequestMapping(value="/mechanic/registerMechanic", method=RequestMethod.POST)
	public String addMechanic(@ModelAttribute("mechanic") @Validated Mechanic mechanic,BindingResult bindingResult,Model model)
	{
		if(bindingResult.hasErrors())
		{
			log.info("Validation Error");
			return "MechanicRegister";
		}
		else
		{
			Random rand = new Random();
			int num = rand.nextInt(900000)+1000000;
			mechanic.setMechanicId(num);
			log.info("Inside Add Customer");
			mechanicService.addMechanic(mechanic);
		}
		return "MechanicHome";
	}
}
