package org.webdriver.test.ui;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.features.Locator;
import org.webdriver.test.PageObject;

public class LoginPage extends PageObject {

	protected WebDriver driver;

	public void Login(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage login(String email, String password) {
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, email);
		// input Password
		EnterValue(Locator.PASSWORD_FIELD, null, null, password);
		// click button login
		clickOnElementByXpath(Locator.LOGIN_BUTTON_XPATH);
		// return homepage
		return new HomePage(driver);

	}

}
