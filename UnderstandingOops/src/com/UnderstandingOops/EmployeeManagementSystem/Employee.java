package com.UnderstandingOops.EmployeeManagementSystem;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesgination() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	


	
}
