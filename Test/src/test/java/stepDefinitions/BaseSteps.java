package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
	
	protected WebDriver driver;
	
	public BaseSteps(WebDriver driver) {
		this.driver = driver;
	}
	
	public BaseSteps() {
		
	}

}
