package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	WebDriver driver;
	
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\CucumberBDDSeleniumFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
	}
	
	@When("User enters shortname of product {string} and click offer page")
	public void user_enters_shortname_of_product_and_click_offer_page(String string) {
		System.out.println(string);
	
	}
	
	@Then("User enters shortname and see if same product exists")
	public void user_enters_shortname_and_see_if_same_product_exists() {
	}

}
