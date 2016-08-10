package com.fenast.EA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	@Column(name="Student_ID")
	private int id;
	private String firstName;
	private String lastName;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Course", 
    joinColumns= @JoinColumn(name="studentId"),inverseJoinColumns= @JoinColumn(name="courseId"))
	private List<Course> courses;
	
	
	public Student() {
		super();
	}
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
