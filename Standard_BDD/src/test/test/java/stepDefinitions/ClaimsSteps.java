package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import io.cucumber.datatable.DataTable;
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
public class ClaimsSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ViewClaimantDetailsPage viewClaimantDetailspage;
	GenericUtils genericUtils;

	public ClaimsSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

		// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
	}

	@Then("^Create LTD Gateway Review$")
	public void create_ltd_gateway_review() throws Throwable {
		viewClaimantDetailspage.createLTDGateWayReview();
		Thread.sleep(2000);
	}

	@Then("^Fill out fields in MBP Preparation window and Save$")
	public void fill_out_fields_in_mbp_preparation_window_and_save() throws Throwable {
		Thread.sleep(2000);
		viewClaimantDetailspage.LtdGatewaySaveButtonPopup();
		Thread.sleep(5000);
	}

	@And("^Verify MBP Simple and MBP Deailed tasks were created$")
	public void verify_mbp_simple_and_mbp_deailed_tasks_were_created() throws Throwable {
		viewClaimantDetailspage.verifyMBPSimpleDetailedTasks();
	}

	@Then("^Decline a LTD claim$")
	public void decline_a_claim() throws Throwable {
		viewClaimantDetailspage.DeclineStatusBtnLTD.click();
		Thread.sleep(2000);
		viewClaimantDetailspage.ChangetoStatusDenyContinueStatusBtn.click();
	
		Thread.sleep(2000);
		viewClaimantDetailspage.ClaimantStatusUpdatedCancelBtn2.click();

	}
	
	@And("^Perform clean up, Approve claim for next run$")
    public void perform_clean_up_approve_claim_for_next_run() throws Throwable {
	viewClaimantDetailspage.ApproveStatusBtnLTD.click();
	viewClaimantDetailspage.ChangetoStatusApprovalContinueStatusBtn.click();	
	Thread.sleep(3000);
	viewClaimantDetailspage.createAnnualTaskCreateBtn.click();
	Thread.sleep(4000);
    viewClaimantDetailspage.IAT_Task.isDisplayed();
	
	    }

	@And("^Verify the button selected$")
	public void claim_was_declined(DataTable dataTable) throws Throwable {
		// Need to add assertion here to verify Decline button is actually current
		// status
		String btn = dataTable.asLists().get(0).get(0);
		viewClaimantDetailspage.verifyButtonSelected(btn);
	}

	@Then("^Create a Mosers Initiate Retirement Notice$")
	public void create_a_mosers_initiate_retirement_notice() throws Throwable {
		viewClaimantDetailspage.Mosers_InitiateRetirementNoticeBtn.click();

		viewClaimantDetailspage.Mosers_RetirementDateField.click();
		viewClaimantDetailspage.Mosers_RetirementDateField.sendKeys("01/01/2025");
		Thread.sleep(2000);
		viewClaimantDetailspage.Mosers_RetirementDateField.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		viewClaimantDetailspage.Mosers_RetirementSaveBtn.click();
		Thread.sleep(1000);

	}

	@Then("^Verify Mosers Initiate Retirement Notice task were created$")
	public void verify_mosers_initiate_retirement_notice_task_were_created() throws Throwable {

		Assert.assertEquals(true, viewClaimantDetailspage.InitateRetirementNoticeTask.isDisplayed());
		Assert.assertEquals(true, viewClaimantDetailspage.MOSERSTerminationLetterTask.isDisplayed());
		Assert.assertEquals(true, viewClaimantDetailspage.MOSERSProclaimClosureTask.isDisplayed());

	}

	@Then("^Click into LW tab$")
	public void click_into_lw_tab() throws Throwable {
		viewClaimantDetailspage.clickintoLWTab();
	}

	@Then("^Click into LTD tab$")
	public void click_into_ltd_tab() throws Throwable {
		viewClaimantDetailspage.clickintoLTDTab();
	}

	@Then("^Click into AUX tab$")
	public void click_into_aux_tab() throws Throwable {
		viewClaimantDetailspage.clickintoAUXTab();
	}

	@Then("^Create an EFT Request$")
	public void create_an_eft_request() throws Throwable {
		viewClaimantDetailspage.EFTRequestBtn.click();
		Thread.sleep(1000);
		viewClaimantDetailspage.EFTRequest_YesBtn.click();
		Thread.sleep(1000);
	}

	@Then("^Verify EFT Request task were created$")
	public void verify_eft_request_task_were_created() throws Throwable {
		Assert.assertEquals(true, viewClaimantDetailspage.EFTRequest_Task.isDisplayed());
	}

	@Then("^Verify all Aux product Monthly Annuity Premium is displayed$")
	public void verify_all_aux_products_is_displayed() throws Throwable {
		Assert.assertEquals(true, viewClaimantDetailspage.AuxMAProduct.isDisplayed());

	}

	@Then("^LW: Create Annual Task with Recert Type \"([^\"]*)\"$")
    public void lw_create_annual_task_with_recert_type_something(String strArg1) throws Throwable {
		viewClaimantDetailspage.clickonInitiateAnnualTaskBtnLW();
		Thread.sleep(1000);
		viewClaimantDetailspage.selectRecertTypeLW(strArg1);
		Thread.sleep(1000);
		viewClaimantDetailspage.createAnnualTaskCreateBtn.click();
		Thread.sleep(6000);
		viewClaimantDetailspage.createApprovalLetterCancelBtnLW();

	}

	@And("^Verify Annual Task was created properly$")
	public void verify_annual_task_was_created_properly() throws Throwable {
		Assert.assertEquals(true, viewClaimantDetailspage.IAT_Task.isDisplayed());
		

}
}
