package com.restmongoapi.app.controller;

import java.util.List;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restmongoapi.app.pojo.Course;
import com.restmongoapi.app.service.AdminService;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	AdminService adminService;

	private static final Logger log = LoggerFactory.getLogger(AdminController.class);

	@GetMapping("/hello")
	public String hello() {
		return "hello";

	}

	@PostMapping(value = "/addCourse", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> insertCourse(@RequestBody Course course) {
		if (adminService.addCourse(course) != null) {
			return new ResponseEntity<>("Sucessfully Submitted", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Error Try Again", HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/getCourse")
	public List<Course> getCourse() {
		return adminService.getCourse();

	}

	@GetMapping("/getCourse/{c_name}")
	public Course getCourseByName(@PathVariable String c_name, Course course) {
		course.setCourseName(c_name);
		return adminService.findCourseByName(course);

	}

	@DeleteMapping(value = "/delete/{c_name}")
	public ResponseEntity<?> deleteCourseByName(@PathVariable String c_name, Course course) {
		course.setCourseName(c_name);
		if (adminService.deleteByCourseName(course) != null) {
			return new ResponseEntity<>("Sucessfully Submitted", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Error Try Again", HttpStatus.BAD_REQUEST);

	}

	@DeleteMapping(value = "/deleteById/{cId}")
	public ResponseEntity<?> deleteCourseById(@PathVariable ObjectId cId, Course course) {
		course.setcId(cId);
		if (adminService.deleteById(course) != null) {
			return new ResponseEntity<>("Deleted Sucessfully", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Error Try Again", HttpStatus.BAD_REQUEST);

	}

	@PutMapping(value = "/updateCourseById/{cId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateCourseById(@PathVariable ObjectId cId, @RequestBody Course course) {
		course.setcId(cId);
		if (adminService.updateById(course) != null) {
			return new ResponseEntity<>("Updated Sucessfully", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Error Try Again", HttpStatus.BAD_REQUEST);

	}

}
