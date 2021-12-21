package com.dell.webservice.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPageTest {
	
	String driverPath = "C:\\Users\\pandaa7\\BrowserDriver\\chromedriver.exe";
	ChromeDriver driver;
	String baseUrl = "http://foodbox-capstone.s3-website.us-east-2.amazonaws.com/";
	
	@Test
	void testProductsUrl() {
		String siteUrl = baseUrl+"products";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
		assertEquals(siteUrl, driver.getCurrentUrl());
	}
	
	@Test
	void AddCart_success() {
		String siteUrl = baseUrl+"products";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
		WebElement explore = driver.findElementByXPath("/html/body/app-root/app-products/div[3]/table/tbody/tr/td[7]/div/div[1]/a");
		explore.click();
//		siteUrl = baseUrl + "products?category=Mughlai";
//		assertEquals(siteUrl,driver.getCurrentUrl());
	}

}
