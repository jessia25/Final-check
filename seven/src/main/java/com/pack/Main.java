package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	User u=(User)context.getBean("user");
	System.out.println(u.getName());
	System.out.println(u.getAge());
}
}
