package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue = {"com.stepDefinitions","com.hook"},tags="@smoke",
features= {"./src/test/resources/redBusFeature"},
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:reports/Cucumber.xml",
		"json:reports/cumcumberjson.json",
		"html:reports/cucumberreport.html"	
		})
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
}
