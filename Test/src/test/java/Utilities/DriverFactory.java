package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\antho\\Automation\\WebAutomation\\geckodriver.exe");
			System.out.println("FireFox Browser used");
			return new FirefoxDriver();
			
		} else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\antho\\Automation\\WebAutomation\\MicrosoftWebDriver.exe");
			System.out.print("edge browser used");
			return new InternetExplorerDriver();
			
		} else {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\antho\\Automation\\WebAutomation\\chromedriver.exe");
			System.out.print("Chrome browser used");
			return new ChromeDriver();
		}
	}
}
