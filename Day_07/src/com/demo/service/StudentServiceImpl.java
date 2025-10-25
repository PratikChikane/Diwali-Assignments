package com.demo.service;

import java.util.List;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.exception.LowAttendanceException;

public class StudentServiceImpl implements StudentService{

	 private StudentDao studentDao;

	    public StudentServiceImpl() {
	        this.studentDao = new StudentDaoImpl();
	    }

	@Override
	public void processStudents(List<Student> students) {
		// TODO Auto-generated method stub
		 for (Student s : students) {
	            try {
	                s.calculateGrade();
	            } catch (LowAttendanceException e) {
	                System.out.println(" " + e.getMessage());
	            }
	        }
		
	}

	@Override
	public void sortByAttendance(List<Student> students) {
		// TODO Auto-generated method stub
		students.sort((s1, s2) -> Double.compare(s2.getAttendance_percentage(), s1.getAttendance_percentage()));
		
	}

	@Override
	public void save(List<Student> students, String filename) {
		// TODO Auto-generated method stub
		 studentDao.saveStudents(students, filename);
	}

	@Override
	public List<Student> load(String filename) {
		// TODO Auto-generated method stub
		 return studentDao.loadStudents(filename);
	}

	
}
