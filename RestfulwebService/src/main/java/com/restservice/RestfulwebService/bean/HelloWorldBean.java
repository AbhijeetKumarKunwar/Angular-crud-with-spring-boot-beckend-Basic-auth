package com.restservice.RestfulwebService.bean;

public class HelloWorldBean {
	public String message;
	public HelloWorldBean(String message)
	{
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Hello world beans [message=%s]",message);
	}

}
