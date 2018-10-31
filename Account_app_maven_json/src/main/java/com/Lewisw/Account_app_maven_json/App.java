package com.Lewisw.Account_app_maven_json;

public class App 
{
	
	private App() {}
	
    public static void main( String[] args )
    {
    	ServiceManager servManager = new ServiceManager();
		
		servManager.load();
		
    	System.out.println(servManager.findNum("John"));
    }
}

