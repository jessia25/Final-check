package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main4 {
	static final Logger logger=Logger.getLogger(Main4.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j1.xml");
		logger.debug("sample debug message");
		logger.error("sample error message");
		logger.fatal("sample fatal message");
		logger.info("sample info message");
		logger.warn("sample warn message");
	}

}
