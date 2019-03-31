package org.webdriver.test.features;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.PageObject;

public class Register extends PageObject {
	/*
	 * Cách 1- @Before public void navigate() { driver.navigate().to(registerURL); }
	 */
	// Cách 2
	@Before
	public void click() {
		clickOnElementByXpath(Locator.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(Locator.REGISTER_BUTTON_HOME_XPATH);
	}

	// REGISTER FAIL BLANK
	@Test
	public void testRegisterwithBlankField() {

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

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

		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageName = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);

	}

	@Test
	public void testRegisterwithBlankEmail() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageEmail = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, errormessageEmail);
	}

	@Test
	public void testRegisterwithBlankPas() {
		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

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

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageCfPassword = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);

	}

	@Test
	public void testRegisterwithBlankAddress() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageAddress = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankPhone() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessagePhone = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
	}

	// REGISTER INPUT FAIL
	@Test
	public void testRegisterwithInputFailName() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.INPUT_FAIL);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageNameCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME_CHARACTER, errormessageNameCharacter);
	}

	@Test
	public void testRegisterwithInputFailPas() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.INPUT_FAIL);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.INPUT_FAIL);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);
		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

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

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.INPUT_FAIL);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageAddressCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS_CHARACTER, errormessageAddressCharacter);

	}

	@Test
	public void testRegisterwithInputFailPhone() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.INPUT_FAIL);
		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessagePhoneCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE_CHARACTER, errormessagePhoneCharacter);

	}

	@Test
	public void testRegisterwithInputFailPasDifferentCfPas() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASSDIFFERENTPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);
		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessagePassdifferentCfPass = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, errormessagePassdifferentCfPass);

	}

	// REGISTER SUCCESS
	@Test
	public void testRegisterwithInputFull() {

		// input name
		EnterValue(Locator.NAME_FIELD, null, null, MessageInput.NAME);
		// input email
		EnterValue(Locator.EMAIL_FIELD, null, null, MessageInput.EMAIL);
		// input password
		EnterValue(Locator.PASSWORD_FIELD, null, null, MessageInput.PASSWORD);
		// input confirm password
		EnterValue(Locator.CONFIRM_PASSWORD_FIELD, null, null, MessageInput.CONFIRMPASS);
		// input address
		EnterValue(Locator.ADDRESS_FIELD, null, null, MessageInput.ADDRESS);
		// input phone number
		EnterValue(Locator.PHONE_FIELD, null, null, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(Locator.REGISTER_BUTTON_XPATH);

		// refresh browser=> back home
		driver.get(homeURL);

	}

}
