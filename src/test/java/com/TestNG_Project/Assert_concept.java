package com.TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_concept {
	@Test
	private void ValidATIon() {
		String expected_username = "thiyagu";
		String actual_username = "thiyagu12";
		Assert.assertEquals(actual_username, expected_username);

	}
    @Test
	private void VerificATIon() {
		String expected_username1 = "thiyagu1234";
		String actual_username2 = "thiyagu12";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual_username2, expected_username1);
	}
}
