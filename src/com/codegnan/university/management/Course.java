package com.codegnan.university.management;

public class Course {

	private String title;

	// constructor to intialize the course with title
		public Course(String title) {
			this.title = title;
		}

	//getter method to retrieve the course title.
		public  String getTittle() {
			return title;
		}

	// override to string method to provide the string representation of the course
		public String tostring() {
			return title;
		}

		public static Object getTitle() {
			// TODO Auto-generated method stub
			return null;
		}
	}