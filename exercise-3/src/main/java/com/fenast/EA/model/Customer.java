package com.fenast.EA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="reservationId")
	private List<Reservation> reservations;
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public Customer() {
		super();
	}

	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	
	
}
