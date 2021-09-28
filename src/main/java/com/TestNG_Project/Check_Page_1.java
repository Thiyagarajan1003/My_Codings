package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Page_1 {

	public static WebDriver driver;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed1;
	
	
	public WebElement getProceed1() {
		return proceed1;
	}
	public Check_Page_1(WebDriver driver1) {
		// TODO Auto-generated constructor stub
	this.driver = driver1;
	PageFactory.initElements(driver, this);
	}
	
}
