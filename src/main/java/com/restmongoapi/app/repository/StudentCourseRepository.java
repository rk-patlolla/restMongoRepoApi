package com.restmongoapi.app.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.restmongoapi.app.pojo.StudentCourse;

@Repository
public interface StudentCourseRepository extends MongoRepository<StudentCourse, ObjectId> {
	@Query("{studentName:'?0'}")
	StudentCourse findOneByName(String studentName);
}
