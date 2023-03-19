package com.qa.saucetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddTocart {
	
	public void addtocart() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		String price=driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
		System.out.println(price);
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
	
		AddTocart addtocart= new AddTocart();
		addtocart.addtocart();

	}

}
