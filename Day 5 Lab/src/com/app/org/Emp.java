package com.app.org;

public class Emp {

		private int id;
		private String name;
		private String deptId;
		private double basic_salary;
		
		public  Emp(int id, String name, String deptId, double basic_salary) {
			
			this.id = id;
			this.name = name;
			this.deptId = deptId;
			this.basic_salary = basic_salary;
		}
		
		@Override 
		public String toString() {
			return "Employee Details : Id : "+id+", Name : "+name+", DeptId : "+deptId+", Salary : "+basic_salary;
		}
		
		public double computeNetSalary(){
			return 0;	
		}
		
		public double getBasicSalary() {
			return basic_salary;
		}
		
		
	}

