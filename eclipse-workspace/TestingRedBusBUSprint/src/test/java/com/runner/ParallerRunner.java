package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = { "com.stepDefinitions", "com.hook" }, tags="@smake",features = { "./src/test/resources/redBusFeature" },
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:reports/Cucumber.xml",
		"json:reports/cumcumberjson.json",
		"html:reports/cucumberreport.html"	
		})

public class ParallerRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount", "2");
		return super.scenarios();
	}
}
