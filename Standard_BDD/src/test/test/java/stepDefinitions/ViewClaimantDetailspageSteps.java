package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.ViewClaimantDetailsPage;
import pageObjects.WorkLoadReportPage;
import utils.GenericUtils;
import utils.TestContextSetup;

@SuppressWarnings("unused")
public class ViewClaimantDetailspageSteps {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	WorkLoadReportPage workLoadReportPage;
	ViewClaimantDetailsPage viewClaimantDetailspage;
	GenericUtils genericUtils;

	public ViewClaimantDetailspageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		// Add Pages which objects will be used
				this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
				this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
				this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
				this.workLoadReportPage = testContextSetup.pageObjectManager.getWorkLoadReportPage();
		
	}
	
}
