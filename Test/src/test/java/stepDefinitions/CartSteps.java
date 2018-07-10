package stepDefinitions;

import Page.CartPage;
import cucumber.api.java.en.Then;

public class CartSteps {

	@Then("^see it it in the cart$")
	public void see_it_it_in_the_cart() throws Throwable {
		new CartPage().viewProductInCart();

	}
	
}
