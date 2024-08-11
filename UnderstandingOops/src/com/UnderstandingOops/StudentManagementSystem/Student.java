package com.UnderstandingOops.StudentManagementSystem;

public class Student {
	private int id;
	private String name;
	private double grade;
	
	public Student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}
	
	

}
