package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@D:\\Workspace\\CucumberBDDSeleniumFramework\\ failedCases\\failed_scenarios.txt",
                 glue = "stepDefinitions",
                 tags= "@checkoutProduct or @searchproductScenarioOutlineExmaple",
                 monochrome = true,
                 plugin = {"pretty", "html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedScenariosRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true) // this is to run all scenarios in parallel using cucumber scenarios method defined in searchproductScenarioOutlineExmaple
	public Object[][] scenarios() {
		return super.scenarios();
	}	
}

//now rerun plugin can be removed.
//also, remove the tags plugin as we already captured the failed cases in fialed_scneaios file.