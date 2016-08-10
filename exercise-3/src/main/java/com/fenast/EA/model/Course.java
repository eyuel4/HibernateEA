package com.fenast.EA.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private int coursenumber;
	private String name;
	@ManyToMany(mappedBy="courses")
	private List<Student> students;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int coursenumber, String name) {
		super();
		this.coursenumber = coursenumber;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCoursenumber() {
		return coursenumber;
	}
	public void setCoursenumber(int coursenumber) {
		this.coursenumber = coursenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
