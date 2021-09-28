package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	public static WebDriver driver;
	@FindBy(xpath = "//span[normalize-space()='I confirm my order']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}

	public Confirm(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
