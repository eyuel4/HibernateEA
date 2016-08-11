package com.fenast.EA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Office {
	@Id
	@GeneratedValue
	private int officeId;
	private int roomnumber;
	private int building;
	
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Office(int roomnumber, int building) {
		super();
		this.roomnumber = roomnumber;
		this.building = building;
	}

	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public int getBuilding() {
		return building;
	}
	public void setBuilding(int building) {
		this.building = building;
	}
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	
}
