package com.TestNG_Project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	
	@Test
	@Parameters({"name","pass"})
	public void parameterized(@Optional("Dtn")String name1, @Optional("abcd1")String password ) {
		System.out.println(name1);
		System.out.println(password);
	}
	
}
