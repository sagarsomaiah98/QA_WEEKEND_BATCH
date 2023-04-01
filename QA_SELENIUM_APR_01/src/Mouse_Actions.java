import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		
		
		Actions act= new Actions(driver);
		
		WebElement mainmenu=driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		act.moveToElement(mainmenu).build().perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();
		

		

		
		
		
	}

}
