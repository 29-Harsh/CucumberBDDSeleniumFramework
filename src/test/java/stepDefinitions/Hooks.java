package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	//if we don't use tag here then it will run before all the scenario of all feature files.
	// flow -  cucumber framework look for @before in project before > background > scenario > after
	
	@Before("@insurance")
	public void insuranceDBSetup() {
		System.out.println("create entry into insurance database");
	}
	
	@Before("mortgage")
	public void mortgageDBSetup() {
		System.out.println("create entry into mortgage database");
	}
	
	@After()
	public void tearDown() {
		System.out.println("This method at the end of each scenario");
	}
	

}
