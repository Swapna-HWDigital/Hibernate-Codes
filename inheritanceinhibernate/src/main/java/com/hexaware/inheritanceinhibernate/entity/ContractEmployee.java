package com.hexaware.inheritanceinhibernate.entity;

public class ContractEmployee extends Employee {
	private double hourlyCost;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}




	public ContractEmployee(double hourlyCost) {
		super();
		this.hourlyCost = hourlyCost;
	}




	public double getHourlyCost() {
		return hourlyCost;
	}

	public void setHourlyCost(double hourlyCost) {
		this.hourlyCost = hourlyCost;
	}

	
	
	
	
	
}
