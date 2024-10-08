package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class ContextSetup {
	
	//public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public BaseClass baseClass;
	public GenericUtils genericU;
	
	public ContextSetup() throws IOException {
		baseClass = new BaseClass();
		pageObjectManager = new PageObjectManager(baseClass.webDriverManager());
		genericU = new GenericUtils(baseClass.webDriverManager());
	}

}
