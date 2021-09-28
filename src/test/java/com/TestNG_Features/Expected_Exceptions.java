package com.TestNG_Features;

import org.testng.annotations.Test;

public class Expected_Exceptions {

	@Test(timeOut=5000,expectedExceptions = ArithmeticException.class)
	public void username() {
		int a =0;
		System.out.println(a/0);
	}
	
		
}
