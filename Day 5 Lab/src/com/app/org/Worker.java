package com.app.org;

public class Worker extends Emp{

	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(int id, String name, String deptId, double basic_salary, int hoursWorked,double hourlyRate) {
	super(id, name, deptId, basic_salary);
	this.hoursWorked = hoursWorked;
	this.hourlyRate = hourlyRate;
	
	}
	@Override
	public String toString() {
		return " Worker Details : Hours Worked :"+hoursWorked+"Hourly Rate : "+ hourlyRate; 
	}

	@Override
	public  double computeNetSalary() {
		return (getBasicSalary() + hoursWorked*hourlyRate);
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
}