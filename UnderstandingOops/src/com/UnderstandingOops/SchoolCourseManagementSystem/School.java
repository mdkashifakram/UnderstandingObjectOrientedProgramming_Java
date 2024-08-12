package com.UnderstandingOops.SchoolCourseManagementSystem;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class School {
	private List<Course> courses;
	

	public School(List<Course> courses) {
		this.courses = courses;
	}
	public  List<Course> getCoursesByInstructor(String instructorName){
		return courses.stream()
					  .filter(course->course.getInstructor().equalsIgnoreCase(instructorName))
					  .collect(Collectors.toList());
	}


	public static void main(String[] args) {
		List<Course> courseList = Arrays.asList(
			    new Course("Java", "Kashif", 10),
			    new Course("Java Advanced", "Kashif", 15),
			    new Course("Geology", "Janisar", 10),
			    new Course("C++", "Alisha", 10),
			    new Course("Python", "Kashif", 10)
			);

		School school=new School(courseList);
		String instructorToFind="Kashif";
		List<Course> coursesByKashif=school.getCoursesByInstructor(instructorToFind);
		System.out.println("Courses taught by: "+instructorToFind+"-->");
		for(Course course:coursesByKashif) {
			System.out.println(course);
		}


	}

}
