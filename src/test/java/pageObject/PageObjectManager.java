package pageObject;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	
	WebDriver driver;
	LandingPage landingPage;
	OfferPage offerPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	
	public OfferPage getOfferPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
	}
	

}


