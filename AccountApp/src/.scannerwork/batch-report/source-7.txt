package com.qa.persistence.domain;
import java.util.Map;
import java.util.TreeMap;

public class Service {
	private Map<String, Account> data;
	
	public Service() {
		data = new TreeMap<>();
	}

	public Service(Map<String, Account> db) {
		data = db;
	}
	
	public void add(String id, Account acc) {
		data.put(id, acc);
	}
	
	public void rm(String id) {
		data.remove(id);
	}
	
	public Account get(String id) {
		return data.get(id);
	}
	
	public Map<String,Account> getMap() {
		return data;
	}
	

}
