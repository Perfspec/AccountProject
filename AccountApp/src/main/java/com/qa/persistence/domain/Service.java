package com.qa.persistence.domain;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Account> data;
	
	public Service(Map<Integer, Account> db) {
		data = db;
	}
	
	public Service() {
		data = new HashMap<Integer, Account>(); 
	}
	
	public void put(Integer id, Account acc) {
		data.put(id, acc);
	}
	
	public void rm(Integer id) {
		data.remove(id);
	}
	
	public Account get(Integer id) {
		return data.get(id);
	}
	
	public Map<Integer,Account> getMap() {
		return data;
	}
}
