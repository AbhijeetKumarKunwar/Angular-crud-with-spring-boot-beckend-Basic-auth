package com.restservice.RestfulwebService.bean;

import java.util.Date;

public class Todos {

	public Todos(long id, String userName, String description, Date targateDate, boolean isDone) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targateDate = targateDate;
		this.isDone = isDone;
	}
	public Todos()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargateDate() {
		return targateDate;
	}

	public void setTargateDate(Date targateDate) {
		this.targateDate = targateDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	private long id;
	private String userName;
	private String description;
	private Date targateDate;
	private boolean isDone;
}
