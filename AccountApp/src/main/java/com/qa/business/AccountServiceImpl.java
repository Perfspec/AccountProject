package com.qa.business;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		
		return repo.getAllAccounts();
	}

	public String findAccount(Integer id) {
		return repo.findAnAccount(id);
	}

	public String updateAccount(Integer id, String account) {
		return repo.updateAnAccount(id, account);
	}
	
	public String addAccount(String account) {
		return repo.createAccount(account);
	}

	public String deleteAccount(Integer id) {
		return repo.deleteAccount(id);
	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}

}
