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

public class OfferPageStepDefinition {
	String OfferPageProductName;
	ContextSetup contextSetup;
	
	public OfferPageStepDefinition(ContextSetup contextSetup) {
		this.contextSetup = contextSetup;
	}
	
	@Then("User enters same shortname {string} in offer page and see if same product exists")
	public void user_enters_shortname_and_see_if_same_product_exists(String sName) throws InterruptedException {
		
		switchToWindow();
		//contextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sName);
		
		OfferPage offerPage = new OfferPage(contextSetup.driver);
		offerPage.searchProduct(sName);
		
		Thread.sleep(2000);
		//OfferPageProductName = contextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		
		offerPage.getProductName();
		
		assertEquals(contextSetup.landingPageProductName, OfferPageProductName);
	}
	
	public void switchToWindow() throws InterruptedException {
		contextSetup.driver.findElement(By.linkText("Top Deals")).click();
		
		LandingPage landingPage = new LandingPage(contextSetup.driver);
		landingPage.topDeals();
		
		Thread.sleep(2000);
		Set<String> s1 = contextSetup.driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		contextSetup.driver.switchTo().window(childWindow);
	}

}
