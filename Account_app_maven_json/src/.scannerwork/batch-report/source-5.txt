package com.Lewisw.Account_app_maven_json;
import java.util.Map;

public class Service {
	private Map<String, Account> data;

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
	

}
