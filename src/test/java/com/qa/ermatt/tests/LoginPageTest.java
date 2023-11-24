package com.qa.ermatt.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ermatt.utils.Constants;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageTitleTest() {

		String actTitle = loginpage.getLoginPageTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);

	}

	@Test(priority = 2)
	public void loginPageURLtest() {
		String actURL = loginpage.getLoginPageURL();
		System.out.println(actURL);
		Assert.assertEquals(actURL, Constants.LOGIN_PAGE_URL);
	}

	@Test(priority = 3)

	public void RememberMeCheckBoxTest() {
		boolean b = loginpage.isRememberMeCheckIsVisible();
		Assert.assertTrue(b);
	}

	@Test(priority = 4)
	public void doLoginTest() {
		loginpage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

}
