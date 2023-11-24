package com.qa.ermatt.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.ermatt.factory.DriverFactory;
import com.qa.ermatt.pages.LoginPage;

public class BaseTest {

	DriverFactory df;
	Properties prop;
	WebDriver driver;
	LoginPage loginpage;
	

	@BeforeTest

	public void setUp() throws InterruptedException {

		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		loginpage = new LoginPage(driver);
	}

	@AfterTest

	public void tearDown() {
		driver.quit();

	}

}
