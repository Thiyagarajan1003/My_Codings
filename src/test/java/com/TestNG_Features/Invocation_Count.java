package com.TestNG_Features;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test (priority=-1)
	public void username() {
		System.out.println("username");
	}
	
	@Test (priority=0,invocationCount=5)
	public void password() {
		System.out.println("password");
	}

	@Test (priority=1)
	public void login() {
		System.out.println("login");
	}
	
}
