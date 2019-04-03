package org.webdriver.test.steps;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;
import org.webdriver.test.ui.RegisterPage;

public class Register extends PageObject {
	WebDriver driver;

	public Register(WebDriver driver) {
		this.driver = driver;
	}

	public void register(String name, String email, String password, String confirm_password, String address,
			String phone) {
		EnterValue(RegisterPage.NAME_FIELD, name);
		EnterValue(RegisterPage.EMAIL_FIELD, email);
		EnterValue(RegisterPage.PASSWORD_FIELD, password);
		EnterValue(RegisterPage.CONFIRM_PASSWORD_FIELD, confirm_password);
		EnterValue(RegisterPage.ADDRESS_FIELD, address);
		EnterValue(RegisterPage.PHONE_FIELD, phone);
		clickOnElement(RegisterPage.REGISTER_BUTTON);
	}

}
