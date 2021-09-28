package com.TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame_Page {
public static WebDriver driver;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
private WebElement frame;
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/p[1]/a[2]")
private WebElement qty;
@FindBy(xpath="//select[@id='group_1']")
private WebElement size;
@FindBy(xpath="//a[@id='color_24']")
private WebElement color;
@FindBy(xpath="//span[normalize-space()='Add to cart']")
private WebElement cart;

public WebElement getCart() {
	return cart;
}

public WebElement getColor() {
	return color;
}

public WebElement getSize() {
	return size;
}

public WebElement getQty() {
	return qty;
}

public Frame_Page(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
}

public WebElement getFrame() {
	return frame;
}


}
