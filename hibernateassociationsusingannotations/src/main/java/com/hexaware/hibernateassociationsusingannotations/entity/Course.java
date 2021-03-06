package com.hexaware.hibernateassociationsusingannotations.entity;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_info")
public class Course{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private long courseId;
	@Column(name = "course_name" ,nullable = false,length = 60,unique = true)
	private String courseName;
	@Column(name = "course_fee")
	private float courseFee;
	
//	@ManyToOne
//	@JoinColumn(name="course_id")
//	private Student student;
	
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

//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	
	

}
