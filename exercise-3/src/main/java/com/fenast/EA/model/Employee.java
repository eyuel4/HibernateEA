package com.fenast.EA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue
	private int employeeNumber;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
