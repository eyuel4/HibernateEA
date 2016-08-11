package com.fenast.EA.model;



import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Reservation {
	@Id
	@GeneratedValue
	private int reservationId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Book book;
	
	public Reservation(Date date) {
		super();
		this.date = date;
	}
	public Reservation() {
		super();
	}
	
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
