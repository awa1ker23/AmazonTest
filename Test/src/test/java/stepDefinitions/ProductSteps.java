package stepDefinitions;

import Page.ProductPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductSteps {
	
	@Given("^The item is displayed on a new page$")
	public void the_item_is_displayed_on_a_new_page() throws Throwable {
		new ProductPage().verifyProductInProductPage();

	}

	@Then("^I can add it to the cart$")
	public void i_can_add_it_to_the_cart() throws Throwable {

	}
	
}
