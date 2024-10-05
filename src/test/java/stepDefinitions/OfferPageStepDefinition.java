package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.OfferPage;
import utils.ContextSetup;
import utils.GenericUtils;

public class OfferPageStepDefinition {
	String OfferPageProductName;
	ContextSetup contextSetup;
	LandingPage landingPage;
	OfferPage offerPage;
	
	public OfferPageStepDefinition(ContextSetup contextSetup) {
		this.contextSetup = contextSetup;
		landingPage = contextSetup.pageObjectManager.getLandingPage();
		offerPage = contextSetup.pageObjectManager.getOfferPage();
	}
	
	@Then("^User enters same shortname (.+) in offer page and see if same product exists$")
	public void user_enters_shortname_and_see_if_same_product_exists(String sName) throws InterruptedException {
		
		switchToWindow();
		
		//contextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sName);
	    //OfferPage offerPage = new OfferPage(contextSetup.driver);
		
		 offerPage.searchProduct(sName);
		
		//OfferPageProductName = contextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		
		offerPage.getProductName();
		//System.out.println("offerpage " + offerPage.getProductName());
		//System.out.println("landing Page " + contextSetup.landingPageProductName);
		assertEquals(contextSetup.landingPageProductName, offerPage.getProductName());
	}
	
	public void switchToWindow() throws InterruptedException {
		//contextSetup.driver.findElement(By.linkText("Top Deals")).click();
		
		landingPage.topDeals();
		contextSetup.genericU.switchWindow();

	}

}
