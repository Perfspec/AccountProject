package com.Lewisw.Persistence.Repository;

public interface AccountRepository {

	String getAllAccounts();
	String findAnAccount(Long id);
	String createAccount(String accout);
	String updateAnAccount(Long id, String account);
	String deleteAccount(Long id);

}
