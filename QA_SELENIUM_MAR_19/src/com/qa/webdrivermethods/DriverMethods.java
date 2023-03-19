package com.qa.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverMethods {

	public static void main(String[] args) {
		//shortcut to import- ctrl+shift+O
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
	//	System.out.println("**************"+ title);
		String pagesource=driver.getPageSource();
	//	System.out.println(pagesource);
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//driver.close();
		
		driver.quit();

	}

}
