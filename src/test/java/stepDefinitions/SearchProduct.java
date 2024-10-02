package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.PageObjectManager;
import utils.ContextSetup;

public class SearchProduct {
	ContextSetup contextSetup;
	PageObjectManager pageObjectManager;
	
	public SearchProduct(ContextSetup contextSetup) {
		this.contextSetup = contextSetup;
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\CucumberBDDSeleniumFramework\\driver\\chromedriver.exe");
		contextSetup.driver = new ChromeDriver();
		contextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//String pageTitle = driver.getTitle();
		//System.out.println("Pagetitle "+pageTitle);
		
	}
	
	@When("User enters shortname of product {string} and extract the name")
	public void user_enters_shortname_of_product_and_extract_the_name(String lName) throws InterruptedException {
		//System.out.println(string);
		//contextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(lName);
		
		//LandingPage landingPage = new LandingPage(contextSetup.driver);
		//pageObjectManager = new PageObjectManager(contextSetup.driver);
		
		LandingPage landingPage = contextSetup.pageObjectManager.getLandingPage();
		landingPage.searchProduct(lName);
		Thread.sleep(1000);
		
		//contextSetup.landingPageProductName = contextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		
		
		landingPage.getProductName().split("-")[0].trim();
		System.out.println("Extracted from home page: " + contextSetup.landingPageProductName);		
		
	}

}
