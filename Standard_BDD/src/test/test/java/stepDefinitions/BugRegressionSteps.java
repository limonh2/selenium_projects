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

@SuppressWarnings("unused")
public class BugRegressionSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ViewClaimantDetailsPage viewClaimantDetailspage;
	GenericUtils genericUtils;

	public BugRegressionSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

		// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
	}
	
	@Then("^Click on Recertification First Request button$")
    public void click_on_recertification_first_request_button() throws Throwable {
        viewClaimantDetailspage.recertFirstRequestBtn.click();
        
    }

	@Then("^In a Recert First Request task, Check off at least one tracking item and save$")
	public void in_a_recert_first_request_task_check_off_at_least_one_tracking_item_and_save() throws Throwable {
		viewClaimantDetailspage.Recertification1stRequestTask.click();
		viewClaimantDetailspage.switchToChildWindow();
		viewClaimantDetailspage.DocReturnTrackingChkBox_APSLineItem.isDisplayed();
		viewClaimantDetailspage.DocReturnTrackingChkBox_AUTHLineItem.isDisplayed();
		viewClaimantDetailspage.DocReturnTrackingChkBox_QuestionaireLineItem.isDisplayed();
		viewClaimantDetailspage.DocReturnTrackingChkBox_APS.click();
		Thread.sleep(2000);
		viewClaimantDetailspage.noteWindowSaveSwitch2Parent();
		Thread.sleep(5000);
		viewClaimantDetailspage.Recertification1stRequestTask.click();
		Thread.sleep(3000);
		viewClaimantDetailspage.switchToChildWindow();

	}

	@Then("^Verify all three tracking items are still displaying$")
	public void verify_all_three_tracking_items_are_still_displaying() throws Throwable {
		
		viewClaimantDetailspage.DocReturnTrackingChkBox_APSLineItem.isDisplayed();
		viewClaimantDetailspage.DocReturnTrackingChkBox_AUTHLineItem.isDisplayed();
		viewClaimantDetailspage.DocReturnTrackingChkBox_QuestionaireLineItem.isDisplayed();
		System.out.println("All items are displayed in list");
		//Clicking to uncheck
		viewClaimantDetailspage.DocReturnTrackingChkBox_APS.click();
		Thread.sleep(2000);
		viewClaimantDetailspage.noteWindowSaveSwitch2Parent();
		Thread.sleep(3000);
		System.out.println("Item was checked off and Saved for next run");
		
	}

}
