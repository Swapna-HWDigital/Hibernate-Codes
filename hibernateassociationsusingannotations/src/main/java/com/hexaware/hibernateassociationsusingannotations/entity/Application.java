package com.hexaware.hibernateassociationsusingannotations.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="applications")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long applicationId;
	private String applicationStatus;
	private String applicationRemarks;
	

	@ManyToMany(mappedBy = "applications",cascade = CascadeType.ALL)
	private Set<Student> students = new HashSet<>();
	
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

	
	  public Set<Student> getStudents() { return students; }
	  
	  public void setStudents(Set<Student> students) { this.students = students; }
	 
	
	

}
