package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import util.TestUtil;

public class LoginTest extends TestBase {
	LoginPage l ;
	
	
	@BeforeMethod
	public void intialization() throws IOException {
	
		intialize();
		l= new LoginPage();
	}
	
	@Test(priority=1)
	public void validLoginTest() throws IOException {
		try {
		l.Login("standard_user", "secret_sauce");
		driver.findElement(By.xpath("//span[@class='title']"));
		}
		catch(Exception e) {
		TestUtil.Screenshot();
		}
		
	}
	
	@Test(priority=2)
	public void InvalidLoginTest() throws IOException {
		try {
		l.Login("username1", "secret_sauce");
		//driver.findElement(By.xpath("//span[@class='title']"));
		}
		catch(Exception e) {
		TestUtil.Screenshot();
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
