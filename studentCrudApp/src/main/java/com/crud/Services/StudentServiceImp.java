package com.crud.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	StudentRepository srepo;
	public StudentServiceImp(StudentRepository srepo) {
		super();
		this.srepo = srepo;
	}

	@Override
	public String addStudent(Student st) {
          srepo.save(st);
		
		return "student added";
	}
	@Override
	public Student getStudent(String kodId) {
		// TODO Auto-generated method stub
		Student st= srepo.findById(kodId).get();
		return st;
	}

	@Override
	public String updateStudent(Student st) {
		// TODO Auto-generated method stub
		srepo.save(st);
		
		return "student updated";
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> slist=srepo.findAll();
		return slist;
	}

	@Override
	public String deleteStudent(String kodId) {
		// TODO Auto-generated method stub
		srepo.deleteById(kodId);
		return "student deleted successfully";
	}

	

}
