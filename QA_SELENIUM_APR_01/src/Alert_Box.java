import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		
		
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		System.out.println(msg);
	//	al.accept();//ok
		al.dismiss();//cancel or dismissing the pop up

       // driver.quit();
		
	}

}
