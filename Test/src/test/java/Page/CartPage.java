package Page;

import org.testng.Assert;

public class CartPage {

	String mouseMat = "Titanwolf XXL Speed Gaming Mouse pad (with Titanwolf logo";
	
	public void viewProductInCart() {

		
		Assert.assertEquals(mouseMat, "Titanwolf XXL Speed Gaming Mouse pad (with Titanwolf logo");
		System.out.println("product in cart");
		
	}

}
