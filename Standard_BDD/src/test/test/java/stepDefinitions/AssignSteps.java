package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SearchClaimantPage;
import pageObjects.ViewClaimantDetailsPage;
import pageObjects.WorkLoadReportPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class AssignSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	WorkLoadReportPage workLoadReportPage;
	GenericUtils genericUtils;

	ViewClaimantDetailsPage viewClaimantDetailspage;

	public AssignSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

	// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
	    this.searchClaimantPage = testContextSetup.pageObjectManager.getSearchClaimantPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
	    this.workLoadReportPage = testContextSetup.pageObjectManager.getWorkLoadReportPage();
	}

	
	@Given("^User is in claim \"([^\"]*)\"$")
	public void user_is_in_claim_something(String strArg1) throws Throwable {
		viewClaimantDetailspage.claimaintQuickSearch(strArg1);

		Thread.sleep(5000);
	}

	@Given("^User is in the WorkLoad Report Page$")
	public void user_is_in_the_workload_report_page() throws Throwable {
		workLoadReportPage.clickonWorkLoadReportTab();
	}

	@Then("^Unassign user and go back into claim \"([^\"]*)\" and Reassign claim to user \"([^\"]*)\"$")
	public void unassign_user_and_go_back_into_claim_something_and_reassign_claim_to_user_something(String strArg1,
			String strArg2) throws Throwable {
		viewClaimantDetailspage.unassignUser();
		Thread.sleep(2000);
		viewClaimantDetailspage.claimaintQuickSearch(strArg1);
		Thread.sleep(2000);
		viewClaimantDetailspage.reassignUserWhenNoUsersAssigned(strArg2);
	}

	@Then("^Reassign claim user to \"([^\"]*)\"$")
	public void reassign_claim_user_to_something(String strArg1) throws Throwable {
		viewClaimantDetailspage.reassignUser(strArg1);
	}

	@And("^Verify new user \"([^\"]*)\" was assigned properly$")
	public void verify_new_user_something_was_assigned_properly(String strArg1) throws Throwable {
		viewClaimantDetailspage.verifyAssineeDisplayed(strArg1);
		System.out.println("User was verified");
	}

	@Then("^Click on Pending Assign Tasks report in WLR Page$")
	public void click_on_pending_assign_tasks_report_in_wlr_page() throws Throwable {
		workLoadReportPage.clickonPendingAssignedTasks();
	}

	@And("^Verify results displayed for selected WLR Report$")
	public void verify_results_displayed_for_selected_wlr_report() throws Throwable {
		workLoadReportPage.waitforResultTableWLR();
	}
	
	


}
