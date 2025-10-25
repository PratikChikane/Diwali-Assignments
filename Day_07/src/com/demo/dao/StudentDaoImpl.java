package com.demo.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void saveStudents(List<Student> students, String filename) {
		// TODO Auto-generated method stub
		 try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(students);
	            System.out.println("Students saved to file: " + filename);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public List<Student> loadStudents(String filename) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Students loaded successfully from file.\n");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
	}
	
	


