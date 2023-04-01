import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://login.salesforce.com/?locale=in");

Thread.sleep(3000);

driver.findElement(By.linkText("Privacy")).click();

	}

}
