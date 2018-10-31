package com.Lewisw.Account_app_maven_json;


public class ServiceManager {
	
	private Service database;

	public void load() {
		database = new Service();
		database.add("1", new Account("Adonay", "Chrisson", "122112"));
		database.add("2", new Account("John", "Christoffeson", "128484"));
		database.add("3", new Account("John", "Chrison", "128483"));
		database.add("4", new Account("John", "Coffeson", "128482"));
		database.add("5", new Account("John", "Christoffen", "128481"));
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
