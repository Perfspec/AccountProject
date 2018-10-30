package com.lewis;
import java.util.HashMap;
import java.util.Map;

public class Service {
	private HashMap<String, Account> data;

	public Service(Map<String, Account> db) {
		data =  (HashMap<String, Account>) db;
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
	

}
