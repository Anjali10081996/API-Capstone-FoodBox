package com.dell.webservice.ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
	
	
	String driverPath = "C:\\Users\\pandaa7\\BrowserDriver\\chromedriver.exe";
	ChromeDriver driver;

	@Test
	void testHomepageSoruceUrl() {
		String siteUrl = "http://foodbox-capstone.s3-website.us-east-2.amazonaws.com/home";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
		assertEquals(siteUrl, driver.getCurrentUrl());
	}

}
