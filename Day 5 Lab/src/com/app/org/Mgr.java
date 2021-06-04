package com.app.org;


public class Mgr extends Emp
{
	
	private double performance_bonus;
	private double netsalary;
	

	public Mgr(int id, String name, String deptId, double basic_salary, double performance_bonus) {
		super(id, name, deptId, basic_salary);
		this.performance_bonus = performance_bonus ;
	}
	
	@Override
	public String toString() {
	return super.toString()+"Performance Bonus : "+ performance_bonus;
	}
	
	@Override
	public double computeNetSalary() {
		netsalary = getBasicSalary() + performance_bonus ;
		return netsalary;
	}
	
	public double getPerformance_bonus() {
		return performance_bonus;
	}


}
