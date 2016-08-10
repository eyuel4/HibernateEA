package com.fenast.EA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Publisher {
	@Id
	@GeneratedValue
	private int publisherId;
	private String name;
	
	
	public Publisher(String name) {
		super();
		this.name = name;
	}
	
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
