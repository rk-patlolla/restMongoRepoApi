package com.restmongoapi.app.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restmongoapi.app.pojo.Student;

@Repository
public interface StudentRespository extends MongoRepository<Student, ObjectId> {

}
