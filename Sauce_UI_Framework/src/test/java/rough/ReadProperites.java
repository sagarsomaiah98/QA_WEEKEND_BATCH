package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperites {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		prop.load(fis);
		String value=prop.getProperty("BROWSER");
		System.out.println(value);
		
	// System.out.println(System.getProperty("user.dir"));

	}

}
