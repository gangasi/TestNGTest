package com.test1;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module1 {
	
	@BeforeTest(groups="functional")
		void logIn() {
			System.out.println("Login call");
		}
	
	@AfterTest
	void logOut() {
		System.out.println("Logout call");
	}
	@Test
	void addRow() {
		System.out.println("addrow call");
	}
	@Test
	void deleteRow() {
		System.out.println("deleterow call");
	}
	@Test
	void editRow() {
		System.out.println("editrow call");
	}
	@Test
	public void isSkip() {
		throw new SkipException("Skipping forcibly this test");
	}
}
