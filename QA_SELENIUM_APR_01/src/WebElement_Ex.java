import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Ex {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));//webelement
		
		username.sendKeys("Admin");
	   WebElement password=	driver.findElement(By.xpath("//input[@id='txtPassword']"));
	        password.sendKeys("admin123");
	
	WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	
	login.click();
	
	driver.close();
		
		
	}

}
