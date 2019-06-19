package com.pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String args[]) {
	AbstractApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
	HelloWorld s=(HelloWorld)fact.getBean("hello");
	System.out.println(s.getMessage());
	fact.registerShutdownHook();
}
}
