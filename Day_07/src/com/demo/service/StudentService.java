package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {
	 void processStudents(List<Student> students);
	    void sortByAttendance(List<Student> students);
	    void save(List<Student> students, String filename);
	    List<Student> load(String filename);
}
