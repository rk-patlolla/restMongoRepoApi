package com.restmongoapi.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restmongoapi.app.pojo.Student;
import com.restmongoapi.app.pojo.StudentCourse;
import com.restmongoapi.app.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping(value = "/addStudent")
	public ResponseEntity<?> addStudents(@RequestBody Student student) {
		if (studentService.insertStudents(student) != null) {
			return new ResponseEntity<>("Sucessfully Added", HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<>("ERROR PLEASE TRY AGAIN", HttpStatus.BAD_REQUEST);
	}
	@PostMapping(value = "/addStudentCourse")
	public ResponseEntity<?> addStudents(@RequestBody StudentCourse student) {
		if (studentService.insertStudentCourse(student) != null) {
			return new ResponseEntity<>("Sucessfully Added", HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<>("ERROR PLEASE TRY AGAIN", HttpStatus.BAD_REQUEST);
	} 
	
	  @GetMapping("/getStudent")
      public List<StudentCourse> getStudentsCourse(){
		return studentService.getStudentCourse();
    	  
      }
	  @GetMapping("getStudents/{s_name}")
	  public StudentCourse getStudentCourse(@PathVariable String s_name,StudentCourse studentCourse) {
		studentCourse.setStudentName(s_name);
		  
		return studentService.getStudent(studentCourse);
		  
		  
		  
	  }
	
	
	
}
