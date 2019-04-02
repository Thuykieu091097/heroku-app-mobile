package org.webdriver.test.ui;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;


public class HomePage extends PageObject {
	WebDriver driver;
	public static String MEMBER_BUTTON_HOME_XPATH ="//a[contains(text(),'Member')]" ;
	public static String REGISTER_BUTTON_HOME_XPATH = "//a[contains(text(),'Register')]";
	public static String LOGIN_BUTTON_HOME_XPATH ="//a[contains(text(),'Login')]" ;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void homeClick(String myXpath) {
		clickOnElementByXpath(MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(myXpath);
	}
}
