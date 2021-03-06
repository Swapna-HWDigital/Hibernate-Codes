package com.hexaware.hibernateonetomanyexample.entity;

import javax.persistence.Entity;

@Entity
public class StudentProfile {
	
	private long studentProfileId;
	private String studentAddress;
	private String studentInterest;
	private Student student;
	
	public StudentProfile() {
		// TODO Auto-generated constructor stub
	}

	public StudentProfile(long studentProfileId, String studentAddress, String studentInterest) {
		super();
		this.studentProfileId = studentProfileId;
		this.studentAddress = studentAddress;
		this.studentInterest = studentInterest;
	}

	public StudentProfile(String studentAddress, String studentInterest) {
		super();
		this.studentAddress = studentAddress;
		this.studentInterest = studentInterest;
	}

	public long getStudentProfileId() {
		return studentProfileId;
	}

	public void setStudentProfileId(long studentProfileId) {
		this.studentProfileId = studentProfileId;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentInterest() {
		return studentInterest;
	}

	public void setStudentInterest(String studentInterest) {
		this.studentInterest = studentInterest;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
