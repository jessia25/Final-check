package com.pack;

public class HelloWorld {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public void init() {
	System.out.println("inside init method");
}
public void destroy() {
	System.out.println("inside destroy method");
}
}
