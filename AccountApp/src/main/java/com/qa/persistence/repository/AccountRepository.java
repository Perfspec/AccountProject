package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllAccounts();
	String findAnAccount(Integer id);
	String createAccount(String account);
	String updateAnAccount(Integer id, String account);
	String deleteAccount(Integer id);

}
