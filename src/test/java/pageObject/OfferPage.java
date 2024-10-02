package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	WebDriver driver;
	
	public OfferPage( WebDriver driver) {
		this.driver = driver;
		
	}
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("tr td:nth-child(1)");
	
	public void searchProduct(String lName) {
		driver.findElement(search).sendKeys(lName);
		
	}
	
	public String getProductName() {
		String pName = driver.findElement(productName).getText();
		return pName;
		
	}

}
