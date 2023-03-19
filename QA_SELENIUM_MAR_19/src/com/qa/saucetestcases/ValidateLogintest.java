package com.qa.saucetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateLogintest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		try {
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Successful");
		}
		catch(Exception e) {
			System.out.println("Login Failed");
			String error=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
			System.out.println(error);
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
