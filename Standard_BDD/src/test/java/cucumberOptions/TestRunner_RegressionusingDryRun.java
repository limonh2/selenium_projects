package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue ="stepDefinitions",
		monochrome=true,
		dryRun = true,
		tags = "@Assign or @BugRegression or @Claims or @Letters or @Notes or @SearchClaimantPage or @Tasks",
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"})
public class TestRunner_RegressionusingDryRun extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}


//skipped
//@SearchClaimantPage - due to defect LW claims not now displaying in search results
//@Assign             - due to defect LW claims not now displaying in search results