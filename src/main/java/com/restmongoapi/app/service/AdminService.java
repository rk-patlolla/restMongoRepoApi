package com.restmongoapi.app.service;

import java.util.List;

import com.restmongoapi.app.pojo.Course;

public interface AdminService {
	
	public Course addCourse(Course course);
	
	public List<Course> getCourse();
	
	public Course deleteByCourseName(Course course);

	public Course deleteById(Course course);
	
	public Course updateById(Course course);
   
	public Course findCourseByName(Course course);
}
