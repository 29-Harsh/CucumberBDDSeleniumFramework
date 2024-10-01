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

public class SearchProduct {
	WebDriver driver;
	String landingPageProductName;
	String OfferPageProductName;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\CucumberBDDSeleniumFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//String pageTitle = driver.getTitle();
		//System.out.println("Pagetitle "+pageTitle);
		
	}
	
	@When("User enters shortname of product {string} and click offer page")
	public void user_enters_shortname_of_product_and_click_offer_page(String lName) throws InterruptedException {
		//System.out.println(string);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(lName);
		Thread.sleep(1000);
		landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println("Extracted from home page: " + landingPageProductName);
		
		driver.findElement(By.linkText("Top Deals")).click();
		Thread.sleep(2000);
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
		
		
	}
	
	@Then("User enters same shortname {string} and see if same product exists")
	public void user_enters_shortname_and_see_if_same_product_exists(String sName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sName);
		Thread.sleep(2000);
		OfferPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		assertEquals(landingPageProductName, OfferPageProductName);
		
		
	}

}
