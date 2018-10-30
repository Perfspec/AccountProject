package com.Lewisw.Account_app_maven_json;

public class Account {
	protected String firstName;
	protected String lastName;
	protected String accountNumber;
	
	public Account(String first, String last, String accNum) {
		firstName = first;
		lastName = last;
		accountNumber = accNum;
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
