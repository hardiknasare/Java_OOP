package com.app.tester;

import java.util.Scanner;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of organization :");
		Emp[] employee = new Emp[input.nextInt()];
		
		int counter=0;
		boolean flag=true;
		while(flag != false) {
			System.out.println("1. Hire Manager 2. Hire Worker 3.Display iinformation of all employee 10.Exit ");
			System.out.println("Enter Choice form above : ");
			int choice = input.nextInt();
			
			switch(choice) {
			
			case 1 :
				System.out.println();
				if(counter>=0 && counter<employee.length) {
					
					System.out.println("Enter Manager Details : Mgr_id, Name,dept_id, basic_salary, Bonus ");
					employee[counter++] = new Mgr(input.nextInt(),input.next(), input.next(), input.nextDouble(), input.nextDouble());					
				}
				else 
					System.out.println("Oragization is full.");
				break;
				
			case 2 :
				System.out.println();
				if(counter>=0 && counter<employee.length) {
					
					System.out.println("Enter Worker Details : Id, Name, DeptId, Basic_salary,HoursWorked,HourlyRate ");
					employee[counter++] = new Worker(input.nextInt(),input.next(), input.next(),input.nextInt(), input.nextInt(), input.nextDouble());					
				}
				else 
					System.out.println("Oragization is full.");
				break;
				
			case 3 :
				System.out.println();
				for(Emp e1:employee)
				{
					if(e1!=null)
					{
						System.out.println(e1.toString()+"  "+e1.computeNetSalary());
					}
					if(e1 instanceof Mgr)
					{
						System.out.println("Bonus: " +((Mgr) e1).getPerformance_bonus());
					}
					if(e1 instanceof Worker)
					{
						System.out.println("Hourly Rate: " +((Worker) e1).getHourlyRate());
					}
				}
			default :
					System.out.println();
					System.out.println("Enter a valid choice.");
					break;
			
			case 10:
					System.out.println();
					flag=false;
					break;
			}
		}
		input.close();
	}
}