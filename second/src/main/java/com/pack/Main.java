package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
InjectCollection s=(InjectCollection)fact.getBean("inject");
System.out.println(s.getName1());
System.out.println(s.getName2());
System.out.println(s.getName3());
System.out.println(s.getName4());
	}

}
