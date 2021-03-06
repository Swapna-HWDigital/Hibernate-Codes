package com.hexaware.hibernateassociationsusingannotations.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StudentProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentProfileId;
	private String studentAddress;
	private String studentInterest;
	

	
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


	
	

}
