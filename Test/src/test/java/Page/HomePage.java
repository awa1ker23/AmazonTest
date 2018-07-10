package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage  {
	
public HomePage(WebDriver driver) {
		super(driver);
	}

	public String amazonHomePage = "Amazon.co.uk";

		public void verifyAmazonHomePage() {
			
			String browser = Utilities.ChooseBrowser.selectedBrowser();
			driver = Utilities.DriverFactory.open(browser);
			driver.get("https://www.amazon.co.uk/");
			
			
			Assert.assertEquals(driver.findElement(By.linkText("Amazon.co.uk")).getText(),amazonHomePage);
		}

		public void addTextToField() throws InterruptedException {
			
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mouse mat");
			System.out.println("Mouse mat searched");

		}

		public void searchForItem() {

			
			driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
			System.out.println("Search clicked");
			
			
		}

		
	
}

