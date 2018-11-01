package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Account {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private String firstName;
	@Column(length=50)
	private String lastName;
	@Column(length=6)
	private String accountNumber;
	
		
	public Account(String first, String last, String accNum) {
		
		this.firstName = first;
		this.lastName = last;
		this.accountNumber = accNum;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
		
	public void setFirstName(String a) {
		firstName = a;
	}
	
	public void setLastName(String a) {
		lastName = a;
	}
	
	public void setAccountNumber(String a) {
		accountNumber = a;
	}

}
