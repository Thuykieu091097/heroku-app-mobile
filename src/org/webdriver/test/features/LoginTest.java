package org.webdriver.test.features;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.PageObject;
import org.webdriver.test.steps.Home;
import org.webdriver.test.steps.Login;
import org.webdriver.test.ui.HomePage;
import org.webdriver.test.ui.LoginPage;

public class LoginTest extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2
	Login loginPg;
	Home clickHomePg;

	@Before
	public void click() {
		clickHomePg = new Home(driver);
		clickHomePg.homeClick(HomePage.LOGIN_BUTTON_HOME);
	}

	// LOGIN FAIL
	@Test
	public void testLoginwithBlank() {
		loginPg = new Login(driver);
		loginPg.login("", "");
	}

	@Test
	public void testLoginwithBlankEmail() {
		// input Password
		loginPg = new Login(driver);
		loginPg.login("", MessageInput.PASSLOGIN);
	}

	@Test
	public void testLoginwithBlankPass() {

		// input email
		loginPg = new Login(driver);
		loginPg.login(MessageInput.EMAILLOGIN,"");
	}

	@Test
	public void BackHome() {
		// click button back
		clickOnElement(LoginPage.BACK_HOME_LOGIN);

		// Back home
		driver.get(homeURL);
	}

	@Test
	public void BackRegister() {
		// click button back
		clickOnElement(LoginPage.BACK_REGISTER_LOGIN);

		// Back register
		driver.get(registerURL);
	}

	@Test
	public void LoginbyGoogle() {
		// click link login by google
		clickOnElement(LoginPage.BACK_GOOGLE_LOGIN);

		// Access account google browser
		driver.get(loginbyGG);
	}

	@Test
	public void ForgotPass() {

		// click link fogot
		clickOnElement(LoginPage.BACK_FORGOT_PASSWORD_LOGIN);

		// access...
		driver.get(resetURL);

	}

	// Login success
	@Test
	public void testLoginwithInputFull() {
		loginPg = new Login(driver);
		loginPg.login(MessageInput.EMAILLOGIN, MessageInput.PASSLOGIN);
		// Back home
		driver.get(homeURL);
	}

}
