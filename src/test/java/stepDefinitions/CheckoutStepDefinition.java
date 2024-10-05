package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Then;
import pageObject.CheckoutPage;
import utils.ContextSetup;

public class CheckoutStepDefinition {
	ContextSetup contextSetup;
	//LandingPage landingPage;
	CheckoutPage checkoutPage;
	//PageObjectManager pageObjectManager;
	
	public CheckoutStepDefinition(ContextSetup contextSetup) {
		this.contextSetup = contextSetup;
		//landingPage = contextSetup.pageObjectManager.getLandingPage();
		checkoutPage = contextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("Verify same product exists in cart page")
	public void verify_same_product_exists_in_cart_page() {
		//System.out.println(contextSetup.baseClass.webDriverManager().getTitle());
		
		checkoutPage.getProductName().split("-")[0].trim();
		assertEquals(contextSetup.landingPageProductName, checkoutPage.getProductName().split("-")[0].trim());
		
		assertEquals(checkoutPage.validatePromoButton(), true);
		assertEquals(checkoutPage.validatePlaceOrderButton(), true);
	}
	
	@Then("Validate order place succesfully")
	public void validate_order_place_succesfully() throws IOException {
		checkoutPage.placeOrder();
		System.out.println(contextSetup.baseClass.webDriverManager().getCurrentUrl());
	}
}
