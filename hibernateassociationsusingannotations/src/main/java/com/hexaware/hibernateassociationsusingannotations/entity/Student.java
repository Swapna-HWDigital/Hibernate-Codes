package com.hexaware.hibernateassociationsusingannotations.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;

//import java.util.List;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name="student_email")
	private String studentEmail;
	
	@Column(name="student_dob")
	private Date studentDate;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	//@Cascade(CascadeType.ALL)
	@Fetch(FetchMode.SELECT)
	private Set<Course> courses;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentprofile_id")
	private StudentProfile studentProfile;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "student_applications",
				joinColumns = {@JoinColumn(name ="student_id")},
				inverseJoinColumns = {@JoinColumn(name="applicationId")})	
	private Set<Application> applications = new HashSet<>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student (String studentName, String studentEmail) {
		super();
		
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public Student(Long studentId, String studentName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}


	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

	
	

}
