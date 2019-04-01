package org.webdriver.test.ui;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;
import org.webdriver.test.features.Locator;

public class RegisterPage extends PageObject {
	protected WebDriver driver;

	public void Register(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage register(String name, String email, String password, String confirm_password, String address,
			String phone) {
		// input name
		EnterValue(Locator.NAME_FIELD, null, null, name);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, email);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, password);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, confirm_password);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, address);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, phone);
		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);
		// back home
		return new HomePage(driver);
	}

}
