package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps extends BaseSteps {

	public HomeSteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public HomeSteps() {
	
	}

	@Given("^I am on the Amazon homepage$")
	public void i_am_on_the_Amazon_homepage() throws Throwable {
		new HomePage(driver).verifyAmazonHomePage();
	}

	@When("^I add text to the search field$")
	public void i_add_text_to_the_search_field() throws Throwable {
		new HomePage(driver).addTextToField();

	}

	@Then("^I can search for the item$")
	public void i_can_search_for_the_item() throws Throwable {
		new HomePage(driver).searchForItem();

	}
	
}
