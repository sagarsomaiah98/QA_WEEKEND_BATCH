package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddTocartPage;
import pages.LoginPage;
import util.TestUtil;
import base.TestBase;

public class AddtocartTest extends TestBase {
	
	LoginPage l;
	
	@BeforeMethod
	public void intialization() throws IOException {
	
		intialize();
		l= new LoginPage();
		l.Login("standard_user", "secret_sauce");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void addtocartest() throws IOException {
		AddTocartPage addtocart= new AddTocartPage();
		
		addtocart.addtocart();
		TestUtil.Screenshot();
		
		
	}
}
