package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Feautures {
   @Test
	private void username() {
		String username = "Thiyagu";
		String password = "Thiyagu";
		Assert.assertEquals(username, password);
	}
   @Test
	private void username1() {
		String expected_Username1 = "Dtn";
		String actual_Username1 = "dtn";
		Assert.assertEquals(actual_Username1, expected_Username1);
	}
}
