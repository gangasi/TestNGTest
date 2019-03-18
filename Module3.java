package com.test2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Module3 {
	@Test(priority=3)
	void generateReport() {
	System.out.println("generatereport call");

	}
	//multiple dependencies(priority=2,dependsOnMethods= {"generateReport","validateTest"})
	@Test(priority=2,dependsOnMethods= "generateReport",alwaysRun=true,groups="smoke")
	void printReport() {
	System.out.println("printreport call");
			}
	@Test(priority=1,groups= {"functional","smoke"})
	public void validateTest() {
		SoftAssert softassert=new SoftAssert();
		String ExpectedTitle="Yahoo.com";
		String ActualTitle="Gmail.com";
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Title validate");
		//Assert.assertTrue(false,"Element Not Found");
		softassert.fail("Failing as button removed");
		System.out.println("Button validate");
		softassert.assertAll();
	}	
	}

