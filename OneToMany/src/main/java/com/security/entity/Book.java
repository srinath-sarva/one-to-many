package com.security.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	private int id;
	private String name;
	private String author;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY )
	private Student student;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Book(int id, String name, String author, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.student = student;
	}
	
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	super();
	}
	

}
