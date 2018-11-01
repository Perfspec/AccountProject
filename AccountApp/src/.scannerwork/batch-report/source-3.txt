package com.qa.business;

public interface AccountService {

	String getAllAccounts();
	
	String findAccount(Integer id);

	String addAccount(String account);
	
	String updateAccount(Integer id, String account);
	
	String deleteAccount(Integer id);
}
