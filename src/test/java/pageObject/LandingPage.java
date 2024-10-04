package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By cart = By.xpath("//img[@alt='Cart']");
	By checkoutButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	public void searchProduct(String lName) {
		driver.findElement(search).sendKeys(lName);
		
	} 
	
	public String getProductName() {
		String pName = driver.findElement(productName).getText();
		return pName;
		
	}
	
	public void topDeals() {
		driver.findElement(topDeals).click();
		
	}
	
	public void goCart() {
		driver.findElement(cart).click();
	}
	
	public void proceedCheckout() {
		driver.findElement(checkoutButton).click();
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
}
