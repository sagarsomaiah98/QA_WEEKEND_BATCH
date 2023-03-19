package com.qa.saucetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	
	public void logintest(String uname, String pwd) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		LoginTest login= new LoginTest();
		login.logintest("standard_user","secret_sauce");
		login.logintest("locked_out_user","secret_sauce");
		login.logintest("problem_user","secret_sauce");
		
		login.logintest("performance_glitch_user","secret_sauce");
		
	}

}
