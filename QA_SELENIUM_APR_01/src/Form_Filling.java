import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling {
	

	

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("James");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Ken");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Sydney");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("NSW");
		
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2148");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("0412345678");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("546988");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("James"+RandomChar.random());
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		

	}

}
