package com.TestNG_Project;

import org.testng.annotations.Test;

public class TimeOutException {

	@Test(timeOut=5000)
	public void username() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("username");
	}

	
}
