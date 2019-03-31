package org.webdriver.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObject {
	protected String loginURL = "http://mobilestore01.herokuapp.com/login";
	protected String registerURL = "http://mobilestore01.herokuapp.com/register";
	protected String homeURL = "http://mobilestore01.herokuapp.com";
	protected String loginbyGG = "https://accounts.google.com/signin/oauth/identifier?client_id=334662783555-4aj9028kjunhk3kqtsmitp567l4ohkoo.apps.googleusercontent.com&as=eDrn7wwQjHvbb1bWmAa0Ng&destination=http%3A%2F%2Fmobilestore01.herokuapp.com&approval_state=!ChR5X0dVZnJRYlE1RTVwbXJXeTJZbBIfdzhuQ1UxcGgwdGtXNEJxcmlYbTVkb2tpWXdBZW1CWQ%E2%88%99AJDr988AAAAAXI0P-FjAjooSMJiH96Q7Oj5hxnONUVpD&oauthgdpr=1&xsrfsig=ChkAeAh8Tyn6eDjYEOiyDUVD5lBwcuY4qlyXEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow";
	protected String resetURL = "http://mobilestore01.herokuapp.com/password/reset";
	protected static WebDriver driver;

	//
	@Before
	public void open() {
		// open firefox browser
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		// Access application web
		driver.get(homeURL);
	}

	@After
	public void close() {
		driver.close();
	}
	//

	// INPUT FIELDS
	/*
	 * protected void sendKeysByXpath(String myXpath, String value) {
	 * driver.findElement(By.xpath(myXpath)).sendKeys(value); }
	 * 
	 * protected void sendKeysById(String myID, String value) {
	 * driver.findElement(By.id(myID)).sendKeys(value); }
	 * 
	 * protected void sendKeysByCss(String myCss, String value) {
	 * driver.findElement(By.cssSelector(myCss)).sendKeys(value); }
	 */

	public static void EnterValue(String myID, String myXpath, String myCss, String value) {
		if (myID != null && value != null) {
			driver.findElement(By.id(myID)).sendKeys(value);
		}

		else if (myXpath != null && value != null) {
			driver.findElement(By.xpath(myXpath)).sendKeys(value);
		}

		else {
			driver.findElement(By.cssSelector(myXpath)).sendKeys(value);
		}
	}

	// CLICK
	public void clickOnElementByXpath(String myXpath) {

		driver.findElement(By.xpath(myXpath)).click();
	}

	public void clickOnElementById(String myID) {
		driver.findElement(By.id(myID)).click();
	}

	public void clickOnElementByCss(String myCss) {
		driver.findElement(By.cssSelector(myCss)).click();
	}
	//

	// GET MESSAGE ERROR
	public String getErroMessage(String myXpath) {
		WebElement errMsg = driver.findElement(By.xpath(myXpath));
		return errMsg.getText();
	}

}