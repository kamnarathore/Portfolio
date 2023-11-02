package com.crud.Services;

import java.util.List;

import com.crud.entity.Student;

public interface StudentService {
	String addStudent(Student st);
	String updateStudent(Student st);
	List<Student> getAllStudent();
	String deleteStudent(String kodId);
	Student getStudent(String kodId);
	

}
