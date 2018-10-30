package com.Lewisw.Account_app_maven_json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
	
	private App() {}
	
    public static void main( String[] args )
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	Account car = new Account("Yellow", "Mellow", "12292");
    	try {
			objectMapper.writeValue(new File("target/car.json"), car);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
