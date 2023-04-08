package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop ;
	
	public static void intialize() throws IOException {
		
		prop= new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		prop.load(fis);
		String browser=prop.getProperty("BROWSER");
		
		switch(browser) {
		case "CHROME":
			driver= new ChromeDriver();
			break;
		case "FIREFOX":
			driver= new FirefoxDriver();
			break;
		case "EDGE":
		    driver=new EdgeDriver();
		    break;
		default:
		System.out.println("INVALID BROWSER");
		
		}
		
		int timeout=Integer.parseInt(prop.getProperty("TIMEOUT"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		String url=prop.getProperty("URL");
		driver.get(url);
		driver.getTitle();
		
	}

}
