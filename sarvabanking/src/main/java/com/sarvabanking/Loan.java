package com.sarvabanking;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Date getStDt() {
		return stDt;
	}
	public void setStDt(Date stDt) {
		this.stDt = stDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getPrinicipalAmount() {
		return prinicipalAmount;
	}
	public void setPrinicipalAmount(double prinicipalAmount) {
		this.prinicipalAmount = prinicipalAmount;
	}
	int accno;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String loanType;
	Date  stDt;
	Date endDt;
	double balance;
	double interest;  
	double prinicipalAmount;
	
	

}
