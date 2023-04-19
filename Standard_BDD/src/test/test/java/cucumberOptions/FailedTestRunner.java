package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//s
@CucumberOptions(
		features="@target/failed_scenarios.txt",glue ="stepDefinitions",
		monochrome=true,
		tags = "@Assign or @BugRegression or @Claims or @Letters or @Notes or @SearchClaimantPage or @Tasks",
		plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class FailedTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}