package com.restmongoapi.app.service;

import java.util.List;

import com.restmongoapi.app.pojo.Student;
import com.restmongoapi.app.pojo.StudentCourse;

public interface StudentService {

	public Student insertStudents(Student student);
	
	public StudentCourse insertStudentCourse(StudentCourse student);
	
	public List<StudentCourse> getStudentCourse();
	
	public StudentCourse getStudent(StudentCourse sCourse);
}
