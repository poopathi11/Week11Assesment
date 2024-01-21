package com.question02;

public class Employee {

	private int id;
	private String name,email,mobileNum;
	
	Employee(int id, String name, String email, String mobileNum) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNum = mobileNum;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	
	
	
	
}
