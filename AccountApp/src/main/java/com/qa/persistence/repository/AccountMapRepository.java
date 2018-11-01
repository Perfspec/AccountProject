package com.qa.persistence.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.HashMap;

import static javax.transaction.Transactional.TxType.REQUIRED;

@ApplicationScoped
@Alternative
@Transactional(SUPPORTS)
public class AccountMapRepository implements AccountRepository {
	
	private HashMap<Integer, Account> database= new HashMap<>();
	private Integer counter = 0;
		
	@Inject
	private JSONUtil util;
		
	public void loadInitialAccounts() {
		database.put(1, new Account("Adonay", "Chrisson", "122112"));
		database.put(2, new Account("John", "Christoffeson", "128484"));
		database.put(3, new Account("John", "Chrison", "128483"));
		database.put(4, new Account("John", "Coffeson", "128482"));
		database.put(5, new Account("John", "Christoffen", "128481"));
		counter=5;
	}

	@GET
	@Override
	public String getAllAccounts() {
		try {
			if(database.isEmpty()) {
				loadInitialAccounts();
			}
			return util.getJSONForObject(database.values());
		} catch(NullPointerException e) {
			e.printStackTrace();
			return "{\"message\": \"no accounts found\"}";
		}
	}

	@GET
	@Override
	public String findAnAccount(Integer id) {
		try {
			if(database.isEmpty()) {
				loadInitialAccounts();
			}
			return util.getJSONForObject(database.get(id));
		} catch(NullPointerException e) {
			e.printStackTrace();
			return "{\"message\": \"account not found\"}";
		}
	}

	@POST
	@Override
	@Transactional(REQUIRED)
	public String createAccount(String account) {
		try {
			if(database.isEmpty()) {
				loadInitialAccounts();
			}
			Account newAccount = util.getObjectForJSON(account, Account.class);
			counter++;
			database.put(counter, newAccount);
			return "{\"message\": \"account has been sucessfully added\"}";
		} catch(NullPointerException e) {
			e.printStackTrace();
			return "{\"message\": \"account has not been added, NullPointerException thrown\"}";
		}
	}

	@PUT
	@Override
	@Transactional(REQUIRED)
	public String updateAnAccount(Integer id, String account) {
		try {
			if(database.isEmpty()) {
				loadInitialAccounts();
			}
			Account newAccount = util.getObjectForJSON(account, Account.class);
			if (id <= counter) {
				database.put(id, newAccount);
			} else {
				counter++;
				database.put(counter,newAccount);
			}
			return "{\"message\": \"account sucessfully updated\"}";
		} catch(NullPointerException e) {
			e.printStackTrace();
			return "{\"message\": \"account has not been updated, NullPointerException thrown\"}";
		}
	}

	@DELETE
	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(Integer id) {
		if(database.isEmpty()) {
			loadInitialAccounts();
		}
		if(database.containsKey(id)) {
			database.remove(id);
			if(!database.containsKey(id)) {
				return "{\"message\": \"account sucessfully deleted\"}";
			}
			return "{\"message\": \"account deletion failed\"}";
		}
		return "{\"message\": \"id="+id.toString()+" is not present in the database\"}";
	}
	
}
