package com.Lewisw.Domain;

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

