

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		
		act.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='rightClickBtn']")).click();


	}

}
