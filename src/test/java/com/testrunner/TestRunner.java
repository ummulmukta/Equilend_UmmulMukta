package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="CucumberFeature",
		glue="com.stepdefinition"
	
		)
		
		
public class TestRunner extends AbstractTestNGCucumberTests{

}
