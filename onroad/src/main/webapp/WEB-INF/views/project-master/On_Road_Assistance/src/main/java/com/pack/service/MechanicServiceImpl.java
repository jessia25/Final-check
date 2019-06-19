package com.pack.service;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;


import com.pack.dao.MechanicDao;
import com.pack.model.Mechanic;

public class MechanicServiceImpl implements MechanicService {

private static Logger log = Logger.getLogger(MechanicServiceImpl.class);
	
	private MechanicDao mechanicDao;
	
	public void setMechanicDao(MechanicDao mechanicDao) {
		this.mechanicDao = mechanicDao;
	}

	@Transactional
	public void addMechanic(Mechanic mechanic) {
		log.info("Inside Service Add Customer");
		mechanicDao.addMechanic(mechanic);
		
		
	}
}
