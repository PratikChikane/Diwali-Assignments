package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {
		 StudentService service = new StudentServiceImpl();
	        List<Student> students = new ArrayList<>();

	        
	        students.add(new Student(1, "Ravi", "CS", 85, 92));
	        students.add(new Student(2,"Meena", "IT", 58, 75));
	        students.add(new Student(3, "Arjun", "CS", 90, 88));
	        students.add(new Student(4, "Kavita", "ECE", 65, 45));
	        students.add(new Student(5, "Sahil", "CS", 72, 60));
	        students.add(new Student(6, "Neha", "IT", 95, 98));
	        students.add(new Student(7, "Amit", "CS", 40, 55));
	        students.add(new Student(8, "Priya", "ECE", 88, 78));
	        students.add(new Student(9, "Vikas", "ME", 68, 82));
	        students.add(new Student(10, "Ritu", "IT", 99, 91));


	        service.processStudents(students);
	        service.sortByAttendance(students);
	        service.save(students, "students.txt");

	     
	        List<Student> loadedStudents = service.load("students.txt");
	        for (Student s : loadedStudents) {
	            System.out.println(s);
	        
	        }

	}

}
