package com.fenast.EA.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@GeneratedValue
	private int isbn;
	private String title;
	private String author;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="Book_PublishedBy", joinColumns=@JoinColumn(name="isbn",referencedColumnName="isbn"),
										inverseJoinColumns=@JoinColumn(name="publisherId",referencedColumnName="publisherId"))
	private Publisher publisher;
	
	public Book() {
		super();
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
