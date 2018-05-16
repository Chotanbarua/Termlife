package LifeInsQuote.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNgTestRunner {
	@CucumberOptions(
	        features = "Features",
	        glue="LifeInsQuote.stefdefs",
	        tags= "@Quote"
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}


}


