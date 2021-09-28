package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Page {
	public static WebDriver driver;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
	private WebElement checkout;
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public Check_Page(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	
}
