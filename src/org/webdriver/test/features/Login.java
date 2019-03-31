package org.webdriver.test.features;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.PageObject;

public class Login extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2

	@Before
	public void click() {
		clickOnElementByXpath(Locator.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(Locator.LOGIN_BUTTON_HOME_XPATH);

	}

	// LOGIN FAIL
	@Test
	public void testLoginwithBlank() {
		// click button login
		clickOnElementByXpath(Locator.LOGIN_BUTTON_XPATH);

	}

	@Test
	public void testLoginwithBlankEmail() {
		// input Password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSLOGIN);

		// click button login
		clickOnElementByXpath(Locator.LOGIN_BUTTON_XPATH);
	}

	@Test
	public void testLoginwithBlankPass() {

		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAILLOGIN);

		// click button login
		clickOnElementByXpath(Locator.LOGIN_BUTTON_XPATH);
	}

	@Test
	public void BackHome() {
		// click button back
		clickOnElementByXpath(Locator.BACK_HOME_LOGIN);

		// Back home
		driver.get(homeURL);
	}

	@Test
	public void BackRegister() {
		// click button back
		clickOnElementByXpath(Locator.BACK_REGISTER_LOGIN);

		// Back register
		driver.get(registerURL);
	}

	@Test
	public void LoginbyGoogle() {
		// click link login by google
		clickOnElementByXpath(Locator.BACK_GOOGLE_LOGIN);

		// Access account google browser
		driver.get(loginbyGG);
	}

	@Test
	public void ForgotPass() {

		// click link fogot
		clickOnElementByXpath(Locator.BACK_FORGOT_PASSWORD_LOGIN);

		// access...
		driver.get(resetURL);

	}

	// Login success
	@Test
	public void testLoginwithInputFull() {

		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAILLOGIN);
		// input Password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSLOGIN);

		// click button login
		clickOnElementByXpath(Locator.LOGIN_BUTTON_XPATH);

		// Back home
		driver.get(homeURL);
	}

}
