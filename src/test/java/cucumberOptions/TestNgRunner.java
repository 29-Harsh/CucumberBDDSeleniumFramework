package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//features attribute below is to give location of our feature file s that test runner will execute them
//glue is to provide the packagename of step definitions
//monochrome is to view resultin plain english, Default is some base encoded
// we have to extend the testNg class because by default it does not have ability to run features
//AbstractTestNGCucumberTests - inherit so that our TestNgRunner gets life to run our tests
//tags= "not @negativetest" means run all tags except negative test.
//more e.g tags = @smoketest and @regressiontest , tags = @smoketest and @negativetest


@CucumberOptions(features="src/test/java/features", glue = "stepDefinitions",tags= "@regressiontest or @smoketest" ,monochrome = true)
public class TestNgRunner extends AbstractTestNGCucumberTests{
	
	
}
