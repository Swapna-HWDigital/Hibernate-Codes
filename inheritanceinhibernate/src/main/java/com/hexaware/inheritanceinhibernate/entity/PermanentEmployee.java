package com.hexaware.inheritanceinhibernate.entity;

public class PermanentEmployee extends Employee {
	
	private double salary;
	
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(double salary) {
		super();
		setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
