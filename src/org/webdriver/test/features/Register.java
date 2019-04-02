package org.webdriver.test.features;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.PageObject;
import org.webdriver.test.ui.HomePage;
import org.webdriver.test.ui.RegisterPage;

public class Register extends PageObject {
	/*
	 * Cách 1- @Before public void navigate() { driver.navigate().to(registerURL); }
	 */
	// Cách 2
	RegisterPage registerPg;
	HomePage clickHomePg;
	@Before
	public void click() {
		clickHomePg = new HomePage(driver);
		clickHomePg.homeClick(HomePage.REGISTER_BUTTON_HOME_XPATH);
	}
	
	// REGISTER FAIL BLANK
	@Test
	public void testRegisterwithBlankField() {
		registerPg = new RegisterPage(driver);
		registerPg.register("", "", "", "", "", "");
		
		// Get error message
		String errormessageName = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);
		// Get error message
		String erromessageEmail = getErroMessage("//div/div[2]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, erromessageEmail);
		// Get error message
		String errormessagePassword = getErroMessage("//div/div[3]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASSWORD, errormessagePassword);
		// Get error message
		String errormessageCfPassword = getErroMessage("//div[4]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);
		// Get error message
		String errormessagePhone = getErroMessage("//div[5]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
		// Get error message
		String errormessageAddress = getErroMessage("//div[6]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankName() {
		registerPg = new RegisterPage(driver);
		registerPg.register("", MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.ADDRESS, MessageInput.PHONE);

		// Get error message
		String errormessageName = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);
	}

	@Test
	public void testRegisterwithBlankEmail() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, "", MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.ADDRESS, MessageInput.PHONE);
		
		// Get error message
		String errormessageEmail = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, errormessageEmail);
	}

	@Test
	public void testRegisterwithBlankPas() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, "", MessageInput.CONFIRMPASS, MessageInput.ADDRESS, MessageInput.PHONE);
		
		// Get error message
		String errormessagePassword = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASSWORD, errormessagePassword);
		// Get error message
		String errormessageCfPassword = getErroMessage("//div[2]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, errormessageCfPassword);
	}

	@Test
	public void testRegisterwithBlankCfPas() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, "", MessageInput.ADDRESS, MessageInput.PHONE);

		// Get error message
		String errormessageCfPassword = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);

	}

	@Test
	public void testRegisterwithBlankAddress() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, "", MessageInput.PHONE);

		// Get error message
		String errormessageAddress = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankPhone() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.ADDRESS, "");
		
		// Get error message
		String errormessagePhone = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
	}

	// REGISTER INPUT FAIL
	@Test
	public void testRegisterwithInputFailName() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.INPUT_FAIL, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.ADDRESS, MessageInput.PHONE);
		
		// Get error message
		String errormessageNameCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME_CHARACTER, errormessageNameCharacter);
	}

	@Test
	public void testRegisterwithInputFailPas() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.INPUT_FAIL, MessageInput.INPUT_FAIL, MessageInput.ADDRESS, MessageInput.PHONE);
		
		// Get error message
		String errormessagePasswordCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_CHARACTER, errormessagePasswordCharacter);
		// Get error message
		String errormessageCfPasswordCharacter = getErroMessage("//div[2]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CFPASS_CHARACTER, errormessageCfPasswordCharacter);

	}

	@Test
	public void testRegisterwithInputFailAddress() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.INPUT_FAIL, MessageInput.PHONE);
	
		// Get error message
		String errormessageAddressCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS_CHARACTER, errormessageAddressCharacter);

	}

	@Test
	public void testRegisterwithInputFailPhone() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.ADDRESS, MessageInput.INPUT_FAIL);
		
		// Get error message
		String errormessagePhoneCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE_CHARACTER, errormessagePhoneCharacter);

	}

	@Test
	public void testRegisterwithInputFailPasDifferentCfPas() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASSDIFFERENTPASS, MessageInput.ADDRESS, MessageInput.PHONE);
		
		// Get error message
		String errormessagePassdifferentCfPass = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, errormessagePassdifferentCfPass);

	}

	// REGISTER SUCCESS
	@Test
	public void testRegisterwithInputFull() {
		registerPg = new RegisterPage(driver);
		registerPg.register(MessageInput.NAME, MessageInput.EMAIL, MessageInput.PASSWORD, MessageInput.CONFIRMPASS, MessageInput.ADDRESS, MessageInput.PHONE);
		
		// refresh browser=> back home
		driver.get(homeURL);

	}

}
