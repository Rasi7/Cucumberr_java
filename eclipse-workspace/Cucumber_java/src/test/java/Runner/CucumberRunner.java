package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/features"},glue= {"StepDefinitions"},
plugin= {"html:Reports/CucumberReports.html","json:Reports/CucumberJSONReport.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
