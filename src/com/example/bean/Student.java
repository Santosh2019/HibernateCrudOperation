package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	String studentName;
	@Id
	String studentRollNumber;
	String studentMobileNumber;
	String studentAddress;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentName, String studentRollNumber, String studentMobileNumber, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.studentMobileNumber = studentMobileNumber;
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNumber=" + studentRollNumber
				+ ", studentMobileNumber=" + studentMobileNumber + ", studentAddress=" + studentAddress + "]";
	}
	
	
	
	

}
