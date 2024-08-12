package com.UnderstandingOops.SchoolCourseManagementSystem;

public class Course {
	private String courseName;
	private String instructor;
	private int duration;

	public Course(String courseName, String instructor, int duration) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.duration = duration;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public int getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", instructor=" + instructor + ", duration=" + duration + "]";
	}

}
