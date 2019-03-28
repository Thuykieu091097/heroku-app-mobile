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
		clickOnElementByXpath(MessageXpath.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_HOME_XPATH);
	}

	//REGISTER FAIL BLANK
	@Test
	public void testRegisterwithBlankField() {

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		
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
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageName = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);

	}

	@Test
	public void testRegisterwithBlankEmail() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageEmail = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, errormessageEmail);
	}

	@Test
	public void testRegisterwithBlankPas() {
		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

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
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);		
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageCfPassword = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);

	}

	@Test
	public void testRegisterwithBlankAddress() {
		
		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);		
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageAddress = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankPhone() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);		
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessagePhone = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
	}
	
	//REGISTER INPUT FAIL
	@Test
	public void testRegisterwithInputFailName() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		
		// Get error message
		String errormessageNameCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME_CHARACTER, errormessageNameCharacter);
	}

	@Test
	public void testRegisterwithInputFailPas() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);
		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		
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
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
	
		// Get error message
		String errormessageAddressCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS_CHARACTER, errormessageAddressCharacter);

	}

	@Test
	public void testRegisterwithInputFailPhone() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.INPUT_FAIL);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		
		// Get error message
		String errormessagePhoneCharacter = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE_CHARACTER, errormessagePhoneCharacter);

	}

	@Test
	public void testRegisterwithInputFailPasDifferentCfPas() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASSDIFFERENTPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.INPUT_FAIL);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		
		// Get error message
		String errormessagePassdifferentCfPass = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, errormessagePassdifferentCfPass);

	}
	
	//REGISTER SUCCESS
	@Test
	public void testRegisterwithInputFull() {

		// input name
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// refresh browser=> back home
		driver.get(homeURL);

	}

}

