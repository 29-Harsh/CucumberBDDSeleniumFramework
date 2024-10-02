package utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class ContextSetup {
	
	//public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public BaseClass baseClass;
	public GenericUtils genericU;
	
	public ContextSetup() {
		
		baseClass = new BaseClass();
		pageObjectManager = new PageObjectManager(baseClass.webDriverManager());
		genericU = new GenericUtils(baseClass.webDriverManager());
		
	}

}
