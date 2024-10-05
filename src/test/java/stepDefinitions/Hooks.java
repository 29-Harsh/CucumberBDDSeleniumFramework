package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ContextSetup;

public class Hooks {
	//if we don't use tag here then it will run before all the scenario of all feature files.
	// flow -  cucumber framework look for @before in project. before > background > scenario > after
	ContextSetup contextSetup;
	public Hooks(ContextSetup contextSetup) {
		this.contextSetup = contextSetup;
		
	}
	
	@Before("@insurance")
	public void insuranceDBSetup() {
		System.out.println("create entry into insurance database");
	}
	
	@Before("@mortgage")
	public void mortgageDBSetup() {
		System.out.println("create entry into mortgage database");
	}
	
	@After()
	public void tearDown() throws IOException {
		System.out.println("Closing Browser");
		contextSetup.baseClass.webDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver =contextSetup.baseClass.webDriverManager();
		if(scenario.isFailed()) //take snap when failed
		{
		//screenshot
		File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //cast the driver to take screenshot and save the output in file format
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");  //extent report will attach this to failed scenario 
		
		}
		
	}

}
