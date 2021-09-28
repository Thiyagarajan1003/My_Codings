package com.TestNG_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium_prj\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty(null, null);
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void getURL(String url) {
		driver.get(url);
	}

	public static void browserClose() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void alert(String type, String keys) {
		if (type.equalsIgnoreCase("simple")) {
			Alert simple = driver.switchTo().alert();
			simple.accept();
		} else if (type.equalsIgnoreCase("confirmAccept")) {
			Alert confirm = driver.switchTo().alert();
			confirm.accept();
		} else if (type.equalsIgnoreCase("confirmDismiss")) {
			Alert confirm = driver.switchTo().alert();
			confirm.dismiss();
		} else if (type.equalsIgnoreCase("promptAccept")) {
			Alert prompt = driver.switchTo().alert();
			prompt.sendKeys(keys);
			prompt.accept();
		} else if (type.equalsIgnoreCase("promptDismiss")) {
			Alert prompt = driver.switchTo().alert();
			prompt.dismiss();
		}
	}

	public static void singleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).build().perform();
	}

	public static void doubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void rightClick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	public static void dragNdrop(WebElement elementsrc, WebElement elementdest) {
		Actions act = new Actions(driver);
		act.dragAndDrop(elementsrc, elementdest).build().perform();
	}

	public static void moveToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void switchframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void exitAllframe() {
		driver.switchTo().defaultContent();
	}

	public static void parentframe(WebElement element) {
		driver.switchTo().parentFrame();
	}

	public static void selectBy(WebElement element, String type, int index, String value) {
		if (type.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visibletext")) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}
	}

	public static void deselectBy(WebElement element, String type, int index, String value) {
		if (type.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.deselectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			s.deselectByIndex(index);
		} else if (type.equalsIgnoreCase("visibletext")) {
			Select s = new Select(element);
			s.deselectByVisibleText(value);
		}
	}

	public static void selectMultiple(WebElement element, String type) {
		if (type.equalsIgnoreCase("getOptions")) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement str : options) {
				String allOptions = str.getText();
				System.out.println(allOptions);
			}
		} else if (type.equalsIgnoreCase("allselectedOptions")) {
			Select s = new Select(element);
			List<WebElement> allSelected = s.getAllSelectedOptions();
			for (WebElement allSelect : allSelected) {
				System.out.println(allSelect.getText());
			}
		} else if (type.equalsIgnoreCase("firstselectedOptions")) {
			Select s = new Select(element);
			WebElement firstSelected = s.getFirstSelectedOption();
			System.out.println(firstSelected.getText());
		}
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean isMultiple1 = s.isMultiple();
		System.out.println(isMultiple1);
	}

	public static void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public static void booleanMethods(WebElement element, String type) {
		if (type.equalsIgnoreCase("isSelected")) {
			boolean select = element.isSelected();
			System.out.println(select);
		} else if (type.equalsIgnoreCase("isEnable")) {
			boolean enable = element.isEnabled();
			System.out.println(enable);
		} else if (type.equalsIgnoreCase("isDisplayed")) {
			boolean display = element.isDisplayed();
			System.out.println(display);
		}
	}

	public static void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void fluentWait(int seconds) {
		Wait wait = new FluentWait(driver).withTimeout(seconds, TimeUnit.SECONDS)
				.pollingEvery(seconds, TimeUnit.SECONDS).ignoring(Exception.class);
	}

	public static void getAttribute(WebElement element, String name) {
		String value = element.getAttribute(name);
		System.out.println(value);
	}

	public static void inputValues(WebElement element, String values) {
		element.sendKeys(values);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void screenshot(String filepath) throws Throwable {

		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File(filepath);
		FileUtils.copyFile(src, dest);
	}

	public static void scrollBy(String args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(args);
	}

	public static void windowmaximize() {
		driver.manage().window().maximize();
	}

	public static String value;

	public static String Read_Data(String path, int row_Index, int cell_Index) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
			// System.out.println(value);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int numericCellValue1 = (int) numericCellValue;
			value = Integer.toString(numericCellValue1);
			// value = Double.toString(numericCellValue);
			// System.out.println(value);
		}
		w.close();
		return value;
	}

}
