package org.webdriver.test.ui;

import org.openqa.selenium.WebDriver;
import org.webdriver.test.PageObject;

public class LoginPage extends PageObject  {

	WebDriver driver;
	public static String LOGIN_BUTTON_XPATH = "//input[@value='Login']";
	public static String BACK_HOME_LOGIN = "//a[contains(text(),'Back')]";
    public static String BACK_REGISTER_LOGIN = "//a[contains(text(),'Register')]";
    public static String BACK_GOOGLE_LOGIN= "//div[@id='login-form']/div/div/div/div[2]/form/div[3]/div/div/a";
    public static String BACK_FORGOT_PASSWORD_LOGIN = "//a[contains(text(),'Forgot Your Password?')]";
    public static String EMAIL_FIELD = "email";
	public static String PASSWORD_FIELD = "password";

	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	public void login(String email, String password) {
		EnterValue(EMAIL_FIELD, null, null, email);
		EnterValue(PASSWORD_FIELD, null, password, password);
		clickOnElementByXpath(LOGIN_BUTTON_XPATH);
	}

	

}
