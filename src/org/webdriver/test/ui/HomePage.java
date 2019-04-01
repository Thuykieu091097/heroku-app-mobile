package org.webdriver.test.ui;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;

public class HomePage extends PageObject {
	protected WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		driver.get(homeURL);
	}

}
