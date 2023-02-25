package Loops;

public class Switch_browsers {

	public static void main(String[] args) {
	String browser="CHROME";
		
		switch(browser) 
		{
		case "CHROME":
			System.out.println("LAUNCH CHROME BROWSER");
			break;
		case "FIREFOX":
			System.out.println("LAUNCH FIREFOX BROWSER");
			break;
		case "EDGE":
			System.out.println("LAUNCH EDGE BROWSER");
			break;
		case "SAFARI":
			System.out.println("LAUNCH SAFARI BROWSER");
			break;
		default:
			System.out.println("INVALID BROWSER");
		
		}

	}

}
