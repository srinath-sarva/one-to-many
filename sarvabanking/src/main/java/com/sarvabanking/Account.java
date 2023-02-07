package com.sarvabanking;

import com.sarvabanking.Loan;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int accno;
	String acctype;
	String fullname;
	String password;
	double balance;
	String address;
	String phone;
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "accno")
	List<Loan> loans;
	public Account(int accno, String acctype, String fullname, String password, double balance, String address,
			String phone) {
		super();
		this.accno = accno;
		this.acctype = acctype;
		this.fullname = fullname;
		this.password = password;
		this.balance = balance;
		this.address = address;
		this.phone = phone;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	
	
	

}
