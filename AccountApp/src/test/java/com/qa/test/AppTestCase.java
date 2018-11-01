package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AppTestCase {
	
		
	@Test
	public void whenJsonGotFromJavaThenCorrect() throws IOException {
		Account acc = new Account("Adonay", "Chrisson", "122112");
	    JSONUtil jsonObj = new JSONUtil();
	    String expected = "{\"firstName\":\"Adonay\",\"lastName\":\"Chrisson\",\"accountNumber\":\"122112\"}";
	    assertEquals(expected, jsonObj.getJSONForObject(acc));
	}
	
	@Test
	public void whenJavaGotFromJsonThenCorrect() throws IOException {
		JSONUtil jsonObj = new JSONUtil();
	    Account expected = new Account("Adonay", "Chrisson", "122112");
	    String json = "{\"firstName\":\"Adonay\",\"lastName\":\"Chrisson\",\"accountNumber\":\"122112\"}";
	    Account actual = jsonObj.getObjectForJSON(json, Account.class);
	    assertEquals(expected.getFirstName(), actual.getFirstName());
	    assertEquals(expected.getLastName(), actual.getLastName());
	    assertEquals(expected.getAccountNumber(), actual.getAccountNumber());
	}
	
	@Test
	public void testwhwhwh() {
		List<String> mockList = mock(List.class);
	    mockList.add("First");
	    when(mockList.get(0)).thenReturn("Mockito");
	    when(mockList.get(1)).thenReturn("JCG");
	    assertEquals("Mockito", mockList.get(0));
	    assertEquals("JCG", mockList.get(1));
	  }

	
}
