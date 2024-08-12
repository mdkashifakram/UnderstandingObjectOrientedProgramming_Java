package com.UnderstandingOops.StudentManagementSystem;

import java.util.Scanner;

public class Classroom {
	private String className;
	private Student[] students;
	private int numStudents;

	
	public Classroom(String className, Student[] students, int numStudents) {
		this.className = className;
		this.students = students;
		this.numStudents = numStudents;
	}

	public double getAvgGrade(){
		double totalGradeMarks=0;
		for(int i=0;i<numStudents;i++)
		{
			totalGradeMarks=totalGradeMarks+students[i].getGrade();
		}
		return totalGradeMarks/numStudents;
		
	}

	public double getMaxGrade() {
		double MaxMarks=0;
		for(int i=0;i<numStudents;i++) {
			if(students[i].getGrade()>MaxMarks) {
				MaxMarks=students[i].getGrade();
			}
		}
		return MaxMarks;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the className : ");
		String className=sc.nextLine();
		System.out.println("Enter the number of students in the class : ");
		int numStudents=sc.nextInt();
		sc.nextLine();
		Student [] students=new Student[numStudents];
		for(int i=0;i<students.length;i++) {
			System.out.println("ENter the student details id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("ENter the Student name :");
			String name=sc.nextLine();
			System.out.println("Enter the Student grade :");
			double grade=sc.nextDouble();
			sc.nextLine();
			students[i]= new Student(id,name,grade);
			
		}
		Classroom classroom=new Classroom(className, students,numStudents);
		System.out.println("The average grde of students : "+classroom.getAvgGrade());
		System.out.println("The Heighest marks : "+classroom.getMaxGrade());
		
		
	}

}
//In the main method, use a Scanner object to read the values for the classroom name, 
//the number of students, and the student details (id, name, and grade) in a loop. 
//Once all student details have been read, create a Classroom object with the appropriate parameters. 
//Finally, call the methods to get the average grade and the top student, and print the results.
