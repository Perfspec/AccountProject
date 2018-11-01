package com.Lewisw.Business;

import javax.inject.Inject;

import com.Lewisw.Persistence.Repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public String findAccount(Long id) {
		return repo.findAnAccount(id);
	}

	public String updateAccount(Long id, String account) {
		return repo.updateAnAccount(id, account);
	}
	
	public String addAccount(String account) {
		return repo.createAccount(account);
	}

	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}

}
