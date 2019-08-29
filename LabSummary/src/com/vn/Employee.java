package com.vn;

public class Employee extends CanBo {
	String job;

	public Employee(String name, int birthday, String gender, String address, String job) {
		super(name, birthday, gender, address);
		// TODO Auto-generated constructor stub
		this.job = job;
	}

}
