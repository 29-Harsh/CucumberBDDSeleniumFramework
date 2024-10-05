package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		
		//this is to use when passing values from mvn test command line option paramters
		String browser_maven=System.getProperty("browser");
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		if(driver == null) {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
				driver = new ChromeDriver();// driver gets the life
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.out.println("Install firefox driver");
				//System.setProperty("webdriver.gecko.driver","System.getProperty("user.dir")+");
				//driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
		return driver;
	}	
}
