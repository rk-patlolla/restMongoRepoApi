package com.restmongoapi.app.pojo;

import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="student")
public class Student {

	@Id
	private ObjectId sId;
	@Indexed(unique = true)
	private String studentName;
	private String studentType;
	@Indexed(unique = true)
	private String mobileNo;
	private String studentPassword;
	@Indexed(unique = true)
	private String emailId;
	private Map<String, String> course = new HashMap<>();
	private int Status = 0;

	public ObjectId getsId() {
		return sId;
	}

	public void setsId(ObjectId sId) {
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


	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studentName=" + studentName + ", studentType=" + studentType + ", mobileNo="
				+ mobileNo + ", studentPassword=" + studentPassword + ", emailId=" + emailId + ", course=" + course
				+ ", Status=" + Status + ", getsId()=" + getsId() + ", getStudentName()=" + getStudentName()
				+ ", getStudentType()=" + getStudentType() + ", getMobileNo()=" + getMobileNo()
				+ ", getStudentPassword()=" + getStudentPassword() + ", getEmailId()=" + getEmailId() + ", getStatus()="
				+ getStatus() + ", getCourse()=" + getCourse() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}
