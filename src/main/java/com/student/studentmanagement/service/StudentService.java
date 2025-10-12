package com.student.studentmanagement.service;

import java.util.List;

import com.student.studentmanagement.model.Student;

public interface StudentService {

	public void addStudent(Student student);

	public List<Student> getStudent();
}
