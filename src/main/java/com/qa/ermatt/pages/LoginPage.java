package com.qa.ermatt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// 1.Declare private driver here: This private driver we can use in this class
	// only.

	private WebDriver driver;

	// 2.Create Page constructor:init driver by const:
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// 3.By Locator

	private By userName = By.xpath("//input[@placeholder='Email or username']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By loginButton = By.xpath("//input[@value='Log in']");
	private By RememberMe = By.xpath("//div[@class='remember-me uwa-checkbox-content uwa-toggle-content uwa-input-content uwa-icon']");

	// 4.Page Actions
	public String getLoginPageTitle() {
		return driver.getTitle();

	}

	
	public String getLoginPageURL() {
		return driver.getCurrentUrl();
	}

	
	public boolean isRememberMeCheckIsVisible() {
		return driver.findElement(RememberMe).isDisplayed();

	}

	// ForLogin:
	public void doLogin(String un, String pass) {
		System.out.println("logged in with: " + un + " : " + pass);
		driver.findElement(userName).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();

	}

}//ClassEnds
