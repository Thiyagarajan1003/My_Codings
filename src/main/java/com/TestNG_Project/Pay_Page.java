package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay_Page {
public static WebDriver driver;

@FindBy(xpath="//a[@title='Pay by bank wire']")
private WebElement wirepayment;

public WebElement getWirepayment() {
	return wirepayment;
}

public Pay_Page(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}


}
