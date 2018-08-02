package com.restmongoapi.app.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="studentcourse")
public class StudentCourse {

	@Id
	private String sId;
	@Indexed(unique = true)
	private String studentName;
	private String studentType;
	@Indexed(unique = true)
	private String mobileNo;
	private String studentPassword;

	@Indexed(unique = true)
	private String emailId;
	@DBRef
	private Course course;
	private int Status = 0;

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "StudentCourse [sId=" + sId + ", studentName=" + studentName + ", studentType=" + studentType
				+ ", mobileNo=" + mobileNo + ", studentPassword=" + studentPassword + ", emailId=" + emailId
				+ ", course=" + course + ", Status=" + Status + "]";
	}

}
