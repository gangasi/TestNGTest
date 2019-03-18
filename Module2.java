package com.test1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module2 {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Initialising");
	}
	
	@Test
	void createEmployeeRecord() {
		System.out.println("createEmplyoeerecord call");
	}
	@Test
	void editEmployeeRecord() {
		System.out.println("editEmplyoeerecord call");

	}
	@Test
	void deleteEmployeeRecord() {
		System.out.println("deleteEmplyoeerecord call");
	}
	
	@AfterSuite
	public void teardown() {
		System.out.println("Quitting");
	}

}
