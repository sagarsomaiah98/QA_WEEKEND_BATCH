package com.qa.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		/*
		 * driver.get("https://www.google.com"); driver.get("https://www.bing.com");
		 * driver.get("https://www.saucedemo.com");
		 */
		
		
		driver.navigate().to("https://www.bing.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		

	}

}
