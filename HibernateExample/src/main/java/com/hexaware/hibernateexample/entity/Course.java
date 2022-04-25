package com.hexaware.hibernateexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String courseName;
	private float courseFee;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(Long courseId, String courseName, float courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	
	public Course(String courseName, float courseFee) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public float getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(float courseFee) {
		this.courseFee = courseFee;
	}
	
	

}
