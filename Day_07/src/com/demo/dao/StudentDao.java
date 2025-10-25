package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {
	
	    void saveStudents(List<Student> students, String filename);
	    List<Student> loadStudents(String filename);
	

}
