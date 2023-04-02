package Frames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iamframe");
		driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

}
