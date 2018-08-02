package com.restmongoapi.app.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.restmongoapi.app.pojo.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
	@Query("{courseName:'?0'}")
	Course delete(String courseName);

	@Query("{courseName:'?0'}")
	Course findOneByName(String courseName);

	@DeleteQuery("{courseName:'?0'}")
	Course deleteBycourseName(String courseName);
}
