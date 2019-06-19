package com.pack;

import java.util.Random;
import java.util.Scanner;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("#########Banking app##########");
System.out.println("1.Add customer");
System.out.println("2.update Customer");
System.out.println("3.delete Customer");
System.out.println("4.fetch Customer");
System.out.println("5.exit");
int ch=0,age,num;
float salary;
String name,address;
do {
	System.out.println("Enter ur choice");
	ch=Integer.parseInt(s.nextLine());
	switch(ch) {
	case 1:
		System.out.println("Enter name");
		name=s.nextLine();
		System.out.println("Enter address");
		address=s.nextLine();
		System.out.println("Enter age");
		age=Integer.parseInt(s.nextLine());
		System.out.println("Enter salary");
		salary=Float.parseFloat(s.nextLine());
		Random r=new Random();
		num=r.nextInt(900000)+100000;
		Customer c=new Customer(num,name,address,age,salary);
		new CustomerServiceImpl().insertCustomer(c);
			System.out.println("inserted successfully");
		break;
	case 2:
		System.out.println("Enter id");
		num=Integer.parseInt(s.nextLine());
		System.out.println("enter address");
		address=s.nextLine();
		System.out.println("enter age");
		age=Integer.parseInt(s.nextLine());
		System.out.println("enter salary");
		salary=Float.parseFloat(s.nextLine());
		Customer c1=new Customer(num,address,age,salary);
		new CustomerServiceImpl().updateCustomer(c1);
		System.out.println("customer updated successfully");
		break;
	case 3:
		System.out.println("enter id");
		num=Integer.parseInt(s.nextLine());
		new CustomerServiceImpl().deleteCustomer(num);
		System.out.println("customer deleted successfully");
		break;
	case 4:
		System.out.println("enter id");
		num=Integer.parseInt(s.nextLine());
		Customer c2=new CustomerServiceImpl().fetchCustomerById(num);
		System.out.format("%-15s %-20s %-20s %-5s %-10s\n", "CustomerId","Name","Address","Age","salary");
		System.out.format("%-15s %-20s %-20s %-5s %-10s\n",c2.getCustid(),c2.getName(),c2.getAddress(),c2.getAge(),c2.getSalary());
		break;
	case 5:System.exit(0);
	}
}while(ch<6);
	}

}
