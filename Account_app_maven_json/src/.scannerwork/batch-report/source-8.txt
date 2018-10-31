package com.Lewisw.Account_app_maven_json;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTestCase {

	@Test
	public void test() {
		ServiceManager servManager = new ServiceManager();
		
		servManager.load();
				
		assertEquals(4, servManager.findNum("John"));
	}

}
