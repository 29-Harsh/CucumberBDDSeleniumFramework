package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		
	}

	By productName = By.xpath("//p[normalize-space()='Tomato - 1 Kg']");
	By promoButton = By.cssSelector(".promoWrapper .promoBtn");
	By placeOrder = By.xpath("//button[normalize-space()= 'Place Order']");
	
	public String getProductName() {
		String pName = driver.findElement(productName).getText();
		//System.out.println(pName);
		return pName;
	}
	
	public boolean validatePromoButton() {
		return driver.findElement(promoButton).isDisplayed();
	}
	
	public boolean validatePlaceOrderButton() {
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	public void placeOrder() {
		driver.findElement(placeOrder).click();
	}
	
	
}
