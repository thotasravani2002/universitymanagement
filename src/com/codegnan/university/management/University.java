package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//manage the university's students,professor,courses
public class University {// class
	private List<Student> students; // list to hold students
	private List<Professor> professors;
	private List<Course> courses;

	// constructor to initialize empty lists for students ,professors,courses
	public University() {
		students = new ArrayList<>();
		professors = new ArrayList<>();
		courses = new ArrayList<>();
	}

	// method to add a student
	public void addStudent(String name) {
		students.add(new Student(name));
	}

	// method to add professor
	public void addProfessor(String name) {
		professors.add(new Professor(name));
	}

	// method to add a course
		public void addCourse(String title) {
			courses.add(new Course(title));
		}

		// method to enroll a student in course
		public void enrollStudentInCourse(String studentName, String courseTitle) {
			Student student = findStudentByName(studentName);// finding the student by name
			Course course = findCourseByTitle(courseTitle);// find the course by title
			if (student != null && course != null) {
				student.enrollInCourse(course); // enroll the student in course
			} else {
				System.out.println("student or course Not Found!"); // error message if not found
			}
		}

		// method to assign course in the professor
		public void assignCourseToProfessor(String professorName, String courseTitle) {
			Course course = findCourseByTitle(courseTitle); // find the course by title
			Professor professor = findProfessorByName(professorName); // find professor by name
			if (professor != null && course != null) {
				professor.assignCourse(course); // assign the course to the professor
			} else {
				System.out.println("Professor or course not found!");// error messgae
			}
		}

		// method to list all students
		public void listStudents() {
			System.out.println("list of students in university: ");
			for (Student student : students) { // collection framework everything is object
				System.out.println(student); // print each students name
			}
		}

		// method to add professors
		public void listProfessors() {
			System.out.println("list of professors in university: ");
			for (Professor professor : professors) {
				System.out.println(professor);
			}
		}

		// method to list all courses
		public void listCourses() {
			System.out.println("list of courses in university: ");
			for (Course course : courses) {
				System.out.println(course);
			}
		}

		// method to display the courses a student is enrolled in
		public void displayStudentCourses(String studentName) {
			Student student = findStudentByName(studentName); // find the student by name
			if (student != null) {
				System.out.println("course for student " + studentName + ": ");
				for (Course course : student.getEnrolledCourses()) {
					System.out.println(course); // print each enrolled course
				}
			} else {
				System.out.println("student not found : "); // error msg if student not found
			}
		}

		// method to display the course assigned to a professor
		public void displayProfessorCourses(String professorName) {
			Professor professor = findProfessorByName(professorName);// find professor by name
			if (professor != null) {
				System.out.println("course assigned to a professor: " + professorName + " : ");
				for (Course course : professor.getAssignedCourses()) {
					System.out.println(course);// print each assigned course
				}
			} else {
				System.out.println("professor not found");
			}
		}

		// helper method to find a student by name
		private Student findStudentByName(String name) {
			for (Student student : students) {
				if (student.getName().equals(name)) {
					return student; // if found
				}
			}
			return null; // if student not found return null
		}

		// helper method to find professor name
		private Professor findProfessorByName(String name) {
			for (Professor professor : professors) {
				if (professor.getName().equals(name)) {
					return professor; // if found
				}
			}
			return null; // if professor not found return null
		}

		// helper method to find a course by title
		private Course findCourseByTitle(String title) {
			for (Course course : courses) {
				if (course.getTitle().equals(title)) {
					return course; // return course if found
				}
			}
			return null; // if course not found return null
		}

		public static void main(String[] args) { // method
			University university=new University();
			Scanner scanner=new Scanner(System.in);
			boolean running=true; //flag to control while loop
			while(running) {
				System.out.println("\nUniversityManagement");
				System.out.println("1. add student");
				System.out.println("2. add professor");
				System.out.println("3. add course");
				System.out.println("4. enroll student in course");
				System.out.println("5. assign course to professor");
				System.out.println("6. list of students");
				System.out.println("7. list of professors");
				System.out.println("8. list of courses");
				System.out.println("9. display student courses");
				System.out.println("10. display professor courses");
				System.out.println("11. exit");
				System.out.print("enter your option: ");
				int option=scanner.nextInt();
				scanner.nextLine();//consume the new line character
				//switch case to handle user choice
				switch(option) {
				case 1:
					System.out.print("enter student name");
					String studentName=scanner.nextLine();
					university.addStudent(studentName);//add the student
					break;
				case 2:
					System.out.print("enter professor name");
					String professorName=scanner.nextLine();
					university.addProfessor(professorName);
				
				case 3:
					System.out.print("enter the course title: ");
					String courseTitle=scanner.nextLine();
					university.addStudent(courseTitle);
				case 4:
					System.out.print("enter the student name: ");
					String enrollStudent=scanner.nextLine();
					System.out.print("enter course title: ");
					String enrollCourse=scanner.nextLine();
					university.enrollStudentInCourse(enrollStudent,enrollCourse);
					break;
				case 5:
					System.out.print("enter professor name: ");
					String assignProfessor=scanner.nextLine();
					System.out.print("enter course title: ");
					String assignCourse=scanner.nextLine();
					university.assignCourseToProfessor(assignProfessor, assignCourse);
				case 6:
					university.listStudents();
					break;
				case 7:
					university.listProfessors();
					break;
				case 8:
					university.listCourses();
					break;
				case 9:
					System.out.print("enter student name: ");
					String displayStudent=scanner.nextLine();
					university.displayStudentCourses(displayStudent);
					break;
				case 10:
					System.out.print("enter professor name: ");
					String displayProfessor=scanner.nextLine();
					university.displayProfessorCourses(displayProfessor);
					break;
				case 11:
					running=false; //exit the loop
					System.out.println("exiting...");
					break;
					default:
						System.out.println("invalid choice.please enter a number between 1 to 11");
						break;
				}
				
			}
			scanner.close();

		}

	}
