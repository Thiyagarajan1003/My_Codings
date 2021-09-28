package com.TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	@FindBy(id = "SubmitLogin")
	private WebElement Login;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public Sign_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

}