package org.webdriver.test.features;

public class MessageXpath {
	
	public static String REGISTER_BUTTON_XPATH = "//input[@value='Register']";
	public static String LOGIN_BUTTON_XPATH = "//input[@value='Login']";
	public static String MEMBER_BUTTON_HOME_XPATH ="//a[contains(text(),'Member')]" ;
	public static String REGISTER_BUTTON_HOME_XPATH = "//a[contains(text(),'Register')]";
	public static String LOGIN_BUTTON_HOME_XPATH ="//a[contains(text(),'Login')]" ;
	public static String BACK_HOME_LOGIN = "//a[contains(text(),'Back')]";
    public static String BACK_REGISTER_LOGIN = "//a[contains(text(),'Register')]";
    public static String BACK_GOOGLE_LOGIN= "//div[@id='login-form']/div/div/div/div[2]/form/div[3]/div/div/a";
    public static String BACK_FORGOT_PASSWORD_LOGIN = "//a[contains(text(),'Forgot Your Password?')]";
    
    //xpath fields at register screen
	public static String NAME_FIELD_REGISTER = "//*[@id=\"name\"]";
	public static String EMAIL_FIELD_REGISTER = "//input[@id='email']";
	public static String PASSWORD_FIELD_REGISTER = "//input[@id='password']";
	public static String CONFIRM_PASSWORD_FIELD_REGISTER ="//input[@id='password_confirm']" ;
	public static String ADDRESS_FIELD_REGISTER = "//input[@id='address']";
	public static String PHONE_FIELD_REGISTER = "//input[@id='phone']";
	
	//xpath fields at login screen
	public static String EMAIL_FIELD_LOGIN = "//input[@id='email']";
	public static String PASSWORD_FIELD_LOGIN = "//input[@id='password']";
}


