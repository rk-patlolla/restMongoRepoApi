package com.restmongoapi.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restmongoapi.app.pojo.Course;
import com.restmongoapi.app.repository.CourseRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	CourseRepository courseRes;

	@Override
	public Course addCourse(Course course) {
		return courseRes.save(course);
	}

	@Override
	public List<Course> getCourse() {
		return courseRes.findAll();
	}

	@Override
	public Course deleteByCourseName(Course course) {
		
		return 
				courseRes.deleteBycourseName(course.getCourseName());
	}

	@Override
	public Course deleteById(Course course) {
		try {
			courseRes.deleteById(course.getcId());
		} catch (Exception e) {
			return null;
		}
		return course;
	}

	@Override
	public Course updateById(Course course) {
	      try {
			courseRes.save(course);
		} catch (Exception e) {
		return null;
		}
		return course;
	}

	@Override
	public Course findCourseByName(Course course) {
		return courseRes.findOneByName(course.getCourseName());
	}

}
