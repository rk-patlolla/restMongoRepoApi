package com.restmongoapi.app.pojo;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String cId;
	@Indexed(unique=true)
	private String courseName;
	private String courseType;
	private String courseDescription;
	private int cStatus = 0;



	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getcStatus() {
		return cStatus;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", courseType=" + courseType
				+ ", courseDescription=" + courseDescription + ", cStatus=" + cStatus + "]";
	}

	public void setcStatus(int cStatus) {
		this.cStatus = cStatus;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}




}
