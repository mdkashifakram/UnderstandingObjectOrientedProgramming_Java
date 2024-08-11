/*
 Question: Create a Student class with attributes id, name, and grade. Implement a constructor to initialize these attributes and provide methods to get the values of each attribute. Create a few Student objects in the main method and print their details.
Objective: Understand how to create classes, define attributes, write constructors, and access methods.
 */

package com.UnderstandingOops;

public class Student {
	private int id;
	private String name;
	private String grade;

	public Student(int id, String name, String grade) {
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

	public String getGrade() {
		return grade;
	}

	public static void main(String[] args) {
		Student student1=new Student(1,"Kashif","A");
		Student student2=new Student(2,"Alice","A");
		Student student3=new Student(3,"Jhon","B");
		
		System.out.println("Student 1 details : "+student1.getId()+" "+student1.getName()+"--"+student1.getGrade());
		System.out.println("Student 2 details : "+student2.getId()+" "+student2.getName()+"--"+student2.getGrade());
		System.out.println("Student 3 details : "+student3.getId()+" "+student3.getName()+"--"+student3.getGrade());
	}

}
