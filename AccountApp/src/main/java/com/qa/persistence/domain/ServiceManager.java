package com.qa.persistence.domain;

public class ServiceManager {
	
	private Service database;

	public void load() {
		database = new Service();
		database.put(1, new Account("Adonay", "Chrisson", "122112"));
		database.put(2, new Account("John", "Christoffeson", "128484"));
		database.put(3, new Account("John", "Chrison", "128483"));
		database.put(4, new Account("John", "Coffeson", "128482"));
		database.put(5, new Account("John", "Christoffen", "128481"));
	}
	
	public Service getService() {
		return database;
	}

	public int findNum(String nameToCheck) {
		int countNames = 0;
		for(Account acc: database.getMap().values()) {
			if(acc.getFirstName().equals(nameToCheck)) {
				countNames++;
			}
		}		
		return countNames;
	}

}
