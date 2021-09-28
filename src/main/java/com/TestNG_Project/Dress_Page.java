package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@class='quick-view']")//a[@class='quick-view']
	private WebElement dressselection;
	@FindBy(css = "img[title='Printed Dress']")
	private WebElement printeddress;
	public WebElement getPrinteddress() {
		return printeddress;
	}
	public WebElement getDressselection() {
		return dressselection;
	}
	public Dress_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
}
