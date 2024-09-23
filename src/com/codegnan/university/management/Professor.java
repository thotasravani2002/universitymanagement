package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String name;// name of the professor
	private List<Course> assignedCourses;// list to hold courses assigned to the professor

	public Professor(String name) {
		this.name = name;
		this.assignedCourses = new ArrayList();
	}

   // getter method to retrieve the professor name
	public static String getName() {
		return name;
		 }

    // method to assign a course to the professor.
	public void assignCourse(Course course) {
		// check if the course is not already in the list of assigned courses
				if (!assignedCourses.contains(course)) {
					assignedCourses.add(course);// add course to the list of not already presented
				}
			}
			// getter method to retrive the list of courses assigned to the professsor

			public List<Course> getAssignedCourses() {
				return assignedCourses;// return to list of assigned courses.
			}
			// override to string method to prvide a string representation of the profeesor

			public String toString() {
				return name;
			}

		}
