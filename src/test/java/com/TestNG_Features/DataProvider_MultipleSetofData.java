package com.TestNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_MultipleSetofData {

	@Test(dataProvider = "bio_details")
	private void data(double height,int age) {
		System.out.println(height);
		System.out.println(age);
		
	}
	@Test(dataProvider = "bio_data")
	private void data1(String name,int weight) {
		System.out.println(name);
		System.out.println(weight);
		
	}
	
	@DataProvider
	private Object[] bio_details() {
		return new Object[][] {
			{6.1d,29}
			
		};
	}
	    @DataProvider
		private Object[] bio_data() {
			return new Object[][] {
				{"Thiyagu",80}
				
			};

		}
	
}
