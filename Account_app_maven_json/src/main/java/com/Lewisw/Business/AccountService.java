package com.Lewisw.Business;

public interface AccountService {

	String getAllAccounts();
	
	String findAccount(Long id);

	String addAccount(String account);
	
	String updateAccount(Long id, String account);
	
	String deleteAccount(Long id);
}
