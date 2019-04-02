package org.webdriver.test.ui;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;

public class RegisterPage extends PageObject {
	WebDriver driver;
	public static String REGISTER_BUTTON_XPATH = "//input[@value='Register']";
	public static String NAME_FIELD = "name";
	public static String EMAIL_FIELD = "email";
	public static String PASSWORD_FIELD = "password";
	public static String CONFIRM_PASSWORD_FIELD ="password_confirm" ;
	public static String ADDRESS_FIELD = "address";
	public static String PHONE_FIELD = "phone";

	public  RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void register(String name, String email, String password, String confirm_password, String address,
			String phone) {
		EnterValue(NAME_FIELD, null, null, name);
		EnterValue(EMAIL_FIELD, null, null, email);
		EnterValue(PASSWORD_FIELD, null, null, password);
		EnterValue(CONFIRM_PASSWORD_FIELD, null, null, confirm_password);
		EnterValue(ADDRESS_FIELD, null, null, address);
		EnterValue(PHONE_FIELD, null, null, phone);
		clickOnElementByXpath(REGISTER_BUTTON_XPATH);
	}

}
