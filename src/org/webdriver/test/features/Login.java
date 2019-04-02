package org.webdriver.test.features;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.PageObject;
import org.webdriver.test.ui.HomePage;
import org.webdriver.test.ui.LoginPage;

public class Login extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2
	LoginPage loginPg;
	HomePage clickHomePg;

	@Before
	public void click() {
		clickHomePg = new HomePage(driver);
		clickHomePg.homeClick(HomePage.LOGIN_BUTTON_HOME_XPATH);
	}

	// LOGIN FAIL
	@Test
	public void testLoginwithBlank() {
		loginPg = new LoginPage(driver);
		loginPg.login("", "");
	}

	@Test
	public void testLoginwithBlankEmail() {
		// input Password
		loginPg = new LoginPage(driver);
		loginPg.login("", MessageInput.PASSLOGIN);
	}

	@Test
	public void testLoginwithBlankPass() {

		// input email
		loginPg = new LoginPage(driver);
		loginPg.login(MessageInput.EMAILLOGIN,"");
	}

	@Test
	public void BackHome() {
		// click button back
		clickOnElementByXpath(LoginPage.BACK_HOME_LOGIN);

		// Back home
		driver.get(homeURL);
	}

	@Test
	public void BackRegister() {
		// click button back
		clickOnElementByXpath(LoginPage.BACK_REGISTER_LOGIN);

		// Back register
		driver.get(registerURL);
	}

	@Test
	public void LoginbyGoogle() {
		// click link login by google
		clickOnElementByXpath(LoginPage.BACK_GOOGLE_LOGIN);

		// Access account google browser
		driver.get(loginbyGG);
	}

	@Test
	public void ForgotPass() {

		// click link fogot
		clickOnElementByXpath(LoginPage.BACK_FORGOT_PASSWORD_LOGIN);

		// access...
		driver.get(resetURL);

	}

	// Login success
	@Test
	public void testLoginwithInputFull() {
		loginPg = new LoginPage(driver);
		loginPg.login(MessageInput.EMAILLOGIN, MessageInput.PASSLOGIN);
		// Back home
		driver.get(homeURL);
	}

}
