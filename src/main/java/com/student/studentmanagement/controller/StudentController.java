package com.student.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentmanagement.model.Student;
import com.student.studentmanagement.service.StudentService;

@RestController
public class StudentController {
	 
	@Autowired
	StudentService service ;
	
	
	//get add delete upadate
	@GetMapping("/getlistofstudent")
	public List<Student> getListOfStudents(){
		return service.getStudent();
		
	}
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
	}

}
