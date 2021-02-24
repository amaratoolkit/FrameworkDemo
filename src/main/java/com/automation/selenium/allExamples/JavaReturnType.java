package com.automation.selenium.allExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaReturnType {
	
	public boolean booleanTest() {
		return true;
	}
	
	public int intTest() {
		return 5;
	}
	
	public String stringTest() {
		return "STRING";
	}
	
	@Test
	public void test() {
		Assert.assertTrue(booleanTest());
		Assert.assertEquals(5, intTest());
		Assert.assertEquals("STRNG", stringTest());
	}

}
