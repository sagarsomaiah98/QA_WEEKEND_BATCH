import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Select sel= new Select(driver.findElement(By.xpath("//select[@id='first']")));
		
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("Microsoft");
		Thread.sleep(1000);
		sel.selectByVisibleText("Yahoo");
		  
		 //driver.quit();

	}

}
