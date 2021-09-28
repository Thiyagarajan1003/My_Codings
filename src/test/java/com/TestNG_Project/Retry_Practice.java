package com.TestNG_Project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Practice implements IRetryAnalyzer {

	int count = 1;
	int limit = 4;

	@Override
	public boolean retry(ITestResult result) {

		if (count <= limit) {
			count++; // count = count+1
			return true; // execute
		}
		return false;

	}
}
