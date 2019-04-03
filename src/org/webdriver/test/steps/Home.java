package org.webdriver.test.steps;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;
import org.webdriver.test.ui.HomePage;

public class Home extends PageObject {
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	public void homeClick(String myXpath) {
		clickOnElement(HomePage.MEMBER_BUTTON_HOME);
		clickOnElement(myXpath);
	}

}
