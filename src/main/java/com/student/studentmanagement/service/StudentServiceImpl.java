package com.student.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.model.Student;
import com.student.studentmanagement.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentrepo;
	
	@Override
	public void addStudent(Student student) {
		System.out.println(student);
		studentrepo.save(student);
		
	}
	@Override
	public List<Student> getStudent() {
		return studentrepo.findAll();
	}

	
	

}
