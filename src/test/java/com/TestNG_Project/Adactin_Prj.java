package com.TestNG_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Adactin_Prj extends Base_Class {

	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Obj_Manager pom = new Page_Obj_Manager(driver);
	ExtentReports reports;
	ExtentTest test;
	ExtentSparkReporter sparkReporter;

	@BeforeTest
	private void config() {
		sparkReporter = new ExtentSparkReporter(".//Report//Extent-1.html");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		test = reports.createTest("config");
		
	}
@BeforeTest

	@Test(priority = 0)
	public void url() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
		getURL(url);
		clickOnElement(pom.getHp().getSignin());
		implicitWait(10);
		test = reports.createTest("home");
	}

	@Test(priority = 1)
	public void login() throws Throwable {
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
//		String username = Read_Data(
//				"C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium_prj\\src\\com\\pom\\org\\Test_Case_Registration.XLSX",
//				3, 5);
		inputValues(pom.getSp().getEmail(), username);
		String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
//		String password = Read_Data(
//				"C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium_prj\\src\\com\\pom\\org\\Test_Case_Registration.XLSX",
//				8, 5);
		inputValues(pom.getSp().getPassword(), password);
		clickOnElement(pom.getSp().getLogin());
		implicitWait(10);
		windowmaximize();
		test = reports.createTest("login");
	}

	@Test(priority = 2)
	public void dress() {
		moveToElement(pom.getSsp().getDresses());
		implicitWait(10);
		clickOnElement(pom.getSsp().getEvedressses());
		implicitWait(10);
		moveToElement(pom.getDp().getPrinteddress());
		implicitWait(10);
		clickOnElement(pom.getDp().getDressselection());
		implicitWait(10);
		test = reports.createTest("dress");
	}

	@Test(priority = 3)
	public void addCart() {
		switchframe(pom.getFp().getFrame());
		for (int i = 0; i < 9; i++) {
			clickOnElement(pom.getFp().getQty());
		}
		selectBy(pom.getFp().getSize(), "visibletext", 0, "L");
		clickOnElement(pom.getFp().getColor());
		clickOnElement(pom.getFp().getCart());
		implicitWait(10);
		exitAllframe();
		test = reports.createTest("cart");
	}

	@Test(priority = 4)
	public void checkOut() throws Throwable {
		clickOnElement(pom.getCp().getCheckout());
		scrollBy("window.scrollBy(0,250)");
		screenshot("Screenshot\\pic_1.png");
		clickOnElement(pom.getCp().getProceed());
		implicitWait(10);
		clickOnElement(pom.getCp1().getProceed1());
		implicitWait(10);
		clickOnElement(pom.getCp2().getTerms());
		clickOnElement(pom.getCp2().getProceed2());
		implicitWait(10);
		scrollBy("window.scrollBy(0,350)");
		screenshot("C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium_prj\\Screenshot\\pic_2.png");
		clickOnElement(pom.getPp().getWirepayment());
		implicitWait(10);
		clickOnElement(pom.getCon().getConfirm());
		implicitWait(10);
		scrollBy("window.scrollBy(0,250)");
		screenshot("C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium_prj\\Screenshot\\pic_3.png");
		test = reports.createTest("checkout"); 
	}
	@AfterTest
	private void reportFlush(){
		reports.flush();
	}

}
