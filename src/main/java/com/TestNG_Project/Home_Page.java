package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	private WebElement signin;

	public Home_Page(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}
}
