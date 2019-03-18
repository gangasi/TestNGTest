package com.test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {
	@Test
	public void LoginTest() {
		Assert.fail("Failing test");
	
		System.out.println("Capture screenshot if failed");
		
	
	}

}
