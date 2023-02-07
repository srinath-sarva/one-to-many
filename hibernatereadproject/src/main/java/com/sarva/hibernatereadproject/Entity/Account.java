package com.sarva.hibernatereadproject.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myaccount")
public class Account {

	@Id
	@Column(name="ano")
	private int accno;
	@Column(name="nm")
	private String name;
	@Column(name="bal")
	private double balance;
	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public Account() {
		super();
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
