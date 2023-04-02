package Frames;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		//Finding all iframe tags on a web page
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println(numberOfTags);
		
		WebElement frameElement = driver.findElement(By.id("frame1"));
	    driver.switchTo().frame(frameElement);
		WebElement frameElement1 = driver.findElement(By.id("frame3"));
	    driver.switchTo().frame(frameElement1);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	System.out.println("done");
	}

}
