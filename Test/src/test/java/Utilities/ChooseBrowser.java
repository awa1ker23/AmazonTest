package Utilities;

import org.openqa.selenium.WebDriver;



public class ChooseBrowser {
	
	
	WebDriver driver;
//	static String browserType = "edge";
//	static String browserType = "chrome";
	static String browserType = "firefox";
	
	
	public static String selectedBrowser() {
		return browserType;
	}

}
