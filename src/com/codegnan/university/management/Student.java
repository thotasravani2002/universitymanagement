package com.codegnan.university.management;

import java.util.ArrayList;

import java.util.List;

public class Student {
	
	String name;//name of the student.
	List<Course> enrolledCourses;//list to hold courses that student is enrolled in.
	
	public Student(String name) {
		this.name=name;
		this.enrolledCourses=new ArrayList();
	}
	//getter method to retrieve the student name's
	public String getName() {
		return name;
	}
	
	//method to enroll the student in a course.
	public void enrollInCourse(Course course) {
		if (!enrolledCourses.contains(course)) {
			enrolledCourses.add(course);
		}
	}

	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
	// override toString method to provide a string representation of the student
	public String toString() {
		return name;
		
	}

}

