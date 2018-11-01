package com.qa.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.domain.ServiceManager;
import com.qa.util.JSONUtil;

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
