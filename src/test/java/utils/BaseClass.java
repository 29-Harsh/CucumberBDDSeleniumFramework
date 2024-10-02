package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public WebDriver webDriverManager() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\CucumberBDDSeleniumFramework\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
		
	}
}
