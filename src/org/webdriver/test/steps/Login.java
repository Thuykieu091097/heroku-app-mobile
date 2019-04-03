package org.webdriver.test.steps;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;
import org.webdriver.test.ui.LoginPage;

public class Login extends PageObject {
	WebDriver driver;

	public Login (WebDriver driver) {
		this.driver = driver;
	}

	public void login(String email, String password) {
		EnterValue(LoginPage.EMAIL_FIELD, email);
		EnterValue(LoginPage.PASSWORD_FIELD, password);
		clickOnElement(LoginPage.LOGIN_BUTTON);
	}

}
