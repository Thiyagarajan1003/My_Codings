package com.TestNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void setProperty() {
		System.out.println("set property");
	}

	@BeforeClass
	public void browserLaunch() {
		System.out.println("Browser Launch");
	}

	

	@Test (priority=0)
	public void username() {
		System.out.println("username");
	}
	@Ignore
	@Test
	public void password() {
		System.out.println("password");
	}

	@Test (priority=1)
	public void login() {
		System.out.println("login");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void close() {
		System.out.println("close");
	}
	
	@AfterSuite
	public void quit() {
		System.out.println("quit");
	}
	
	@BeforeMethod
	public void openUrl() {
		System.out.println("open url");
	}
	
}
