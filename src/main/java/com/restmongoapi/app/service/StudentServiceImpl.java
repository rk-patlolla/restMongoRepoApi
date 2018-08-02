package com.restmongoapi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restmongoapi.app.pojo.Student;
import com.restmongoapi.app.pojo.StudentCourse;
import com.restmongoapi.app.repository.StudentCourseRepository;
import com.restmongoapi.app.repository.StudentRespository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRespository studentRes;
	@Autowired
	StudentCourseRepository studentCourseRes;

	@Override
	public Student insertStudents(Student student) {
		try {
			studentRes.save(student);
		} catch (Exception e) {
			return null;
		}
		return student;
	}

	@Override
	public StudentCourse insertStudentCourse(StudentCourse student) {
		try {
			studentCourseRes.save(student);
		} catch (Exception e) {
			return null;
		}
		return student;
	}

	@Override
	public List<StudentCourse> getStudentCourse() {
	
		return studentCourseRes.findAll();
	}

	@Override
	public StudentCourse getStudent(StudentCourse sCourse) {
		return studentCourseRes.findOneByName(sCourse.getStudentName());
	}

}
