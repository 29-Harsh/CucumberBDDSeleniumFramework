package utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class ContextSetup {
	
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	
	public ContextSetup() {
		pageObjectManager = new PageObjectManager(driver);
	}

}
