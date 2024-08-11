package com.UnderstandingOops.EmployeeManagementSystem;

import java.util.Scanner;

public class Company {
	private String companyName;
	private Employee[] employees;
	private int numEmployee;
	
	public Company(String companyName, Employee[] employees, int numEmployee) {
		this.companyName = companyName;
		this.employees = employees;
		this.numEmployee = numEmployee;
		}
			
		public double getAverageSalary() {
			double totalSalary=0;
			for(Employee employee:employees) {
				totalSalary+=employee.getSalary();
			}
			return totalSalary/numEmployee;
		}
		
		public double getMaxSalary() {
			double maxSalary=Double.MIN_VALUE;
			for(Employee employee:employees) {
				if(employee.getSalary()>maxSalary) {
					maxSalary=employee.getSalary();
				}
			}
			return maxSalary;
		}
		
		public Employee[] getEmployeesByDesignation(String designation) {
			designation=designation.toLowerCase();
			Employee[] filteredEmployees=new Employee[numEmployee];
			int count=0;
			for(Employee employee:employees) {
				if(employee.getDesgination().toLowerCase().equals(designation)) {
					filteredEmployees[count++]=employee;
				}
			}
			Employee[] result=new Employee[count];
			System.arraycopy(filteredEmployees, 0, result, 0, count);
			return result;
			
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente rthe company name : \n");
		String companyName=sc.nextLine();
		System.out.println("\nEnter the number of employees : \n");
		int numEmployee=sc.nextInt();
		sc.nextLine();
		Employee[] employees=new Employee[numEmployee];
		
		
		for(int i=0;i<numEmployee;i++) {
			System.out.println("Employee "+(i+1)+" : ");
			System.out.println("Enter the EMployee id :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Employee Name :");
			String name=sc.nextLine();
			System.out.println("Enter the designation :");
			String designation=sc.nextLine();
			System.out.println("Enter the salary :");
			Double salary=sc.nextDouble();
			sc.nextLine();
			
			employees[i]=new Employee(id,name,designation,salary);		
		}
		
		Company company=new Company(companyName,employees,numEmployee);
		System.out.println("Average Salary : "+company.getAverageSalary());
		System.out.println("Max Salary : "+company.getMaxSalary());
		
		System.out.println("Enter the designation to search : ");
		String designation=sc.nextLine();
		Employee[] filteredEmployee=company.getEmployeesByDesignation(designation);
		System.out.println("Employees with Designation : "+designation);
		for(Employee employee:filteredEmployee) {
			System.out.println(employee);
		}
		
		
		
	}

}
