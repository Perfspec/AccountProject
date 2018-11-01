package com.Lewisw.Account_app_maven_json;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.Lewisw.Domain.Account;
import com.Lewisw.Domain.ServiceManager;
import com.Lewisw.Util.JSONUtil;

public class AppTestCase {
	
	@Test
	public void testServiceManager() {
		ServiceManager servManager = new ServiceManager();
		servManager.load();
		assertEquals(4, servManager.findNum("John"));
	}
	
	@Test
	public void whenJsonGotFromJava_thenCorrect() throws IOException {
		Account acc = new Account("Adonay", "Chrisson", "122112");
	    JSONUtil jsonObj = new JSONUtil();
	    String expected = "{\"firstName\":\"Adonay\",\"lastName\":\"Chrisson\",\"accountNumber\":\"122112\"}";
	    assertEquals(expected, jsonObj.getJSONForObject(acc));
	}
	
	@Test
	public void whenJavaGotFromJson_thenCorrect() throws IOException {
		JSONUtil jsonObj = new JSONUtil();
	    Account expected = new Account("Adonay", "Chrisson", "122112");
	    String json = "{\"firstName\":\"Adonay\",\"lastName\":\"Chrisson\",\"accountNumber\":\"122112\"}";
	    Account actual = jsonObj.getObjectForJSON(json, Account.class);
	    assertEquals(expected.getFirstName(), actual.getFirstName());
	    assertEquals(expected.getLastName(), actual.getLastName());
	    assertEquals(expected.getAccountNumber(), actual.getAccountNumber());
	}
	
}
