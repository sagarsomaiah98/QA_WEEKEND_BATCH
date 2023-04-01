import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.size());
		
		Iterator<String> it= wins.iterator();
	    String parent=it.next();
	    String child=it.next();
		
	    driver.switchTo().window(child);
		
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
		System.out.println("************************");
		Set<String> wins1=driver.getWindowHandles();
		System.out.println(wins1.size());
		driver.quit();
		
	    

	}

}
