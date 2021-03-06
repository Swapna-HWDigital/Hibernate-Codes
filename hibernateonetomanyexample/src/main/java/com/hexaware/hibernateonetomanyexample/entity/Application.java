package com.hexaware.hibernateonetomanyexample.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Application {
	
	private long applicationId;
	private String applicationStatus;
	private String applicationRemarks;
	private Set<Student> students;
	
	public Application() {
		// TODO Auto-generated constructor stub
	}

	public Application(long applicationId, String applicationStatus, String applicationRemarks) {
		super();
		this.applicationId = applicationId;
		this.applicationStatus = applicationStatus;
		this.applicationRemarks = applicationRemarks;
	}

	public Application(String applicationStatus, String applicationRemarks) {
		super();
		this.applicationStatus = applicationStatus;
		this.applicationRemarks = applicationRemarks;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getApplicationRemarks() {
		return applicationRemarks;
	}

	public void setApplicationRemarks(String applicationRemarks) {
		this.applicationRemarks = applicationRemarks;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	

}
