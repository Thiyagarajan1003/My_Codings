package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Page_2 {
public static WebDriver driver;

@FindBy(xpath="//input[@id='cgv']")
private WebElement terms;
@FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
private WebElement proceed2;
public WebElement getProceed2() {
	return proceed2;
}

public WebElement getTerms() {
	return terms;
}

public Check_Page_2(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}

}
