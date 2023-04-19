package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DashBoardPage;
import pageObjects.LettersPage;
import pageObjects.LoginPage;
import pageObjects.SearchClaimantPage;
import pageObjects.ViewClaimantDetailsPage;
import pageObjects.WorkLoadReportPage;
import utils.GenericUtils;
import utils.TestContextSetup;

@SuppressWarnings("unused")
public class LettersSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ViewClaimantDetailsPage viewClaimantDetailspage;
	LettersPage lettersPage;
	GenericUtils genericUtils;

	public LettersSteps(TestContextSetup testContextSetup) {
		driver = testContextSetup.driver;
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

		// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
		this.lettersPage = testContextSetup.pageObjectManager.getLettersPage();
	}

	////
	////
	////
	@Then("^Create LW: Manual Pending Letter, select \"([^\"]*)\"$")
	public void create_lw_manual_pending_letter_select_something(String strArg1) throws Throwable {

		lettersPage.createPendingManualLetterLW(strArg1);

	}

	@Then("^Create LTD: Manual Pending Letter, select \"([^\"]*)\"$")
	public void create_ltd_manual_pending_letter_select_something(String strArg1) throws Throwable {

		lettersPage.createPendingManualLetterLTD(strArg1);

	}

	@Then("^Create LW: Manual Denial Letter, select \"([^\"]*)\"$")
	public void create_lw_manual_denial_letter_select_something(String strArg1) throws Throwable {
		lettersPage.createDenialManualLetterLW(strArg1);

	}

	@Then("^Create LW: Manual Approval Letter, select \"([^\"]*)\"$")
	public void create_lw_manual_approval_letter_select_something(String strArg1) throws Throwable {
		lettersPage.createApprovalManualLetterLW(strArg1);
	}

	@Then("^Create LW: Manual Adminstration Letter, select \"([^\"]*)\"$")
	public void create_lw_manual_adminstration_letter_select_something(String strArg1) throws Throwable {
		lettersPage.createAdminManualLetterLW(strArg1);
	}

	  @Then("^Create LW: Manual Closure Letter, select \"([^\"]*)\"$")
	    public void create_lw_manual_closure_letter_select_something(String strArg1) throws Throwable {
		  lettersPage.createClosureManualLetterLW(strArg1);
	    }
	@Then("^Click on Skip button for Manual Letter$")
	public void click_on_skip_button_for_manual_letter() throws Throwable {
		lettersPage.manualLetterSkipBtn.click();
	}

	@Then("^Verify you can Preview Document$")
	public void verify_you_can_preview_document() throws Throwable {
		lettersPage.manualLetterPreviewBtn.click();
		Thread.sleep(3000);
		System.out.println("Verify Preview PDF Document Manually");
	}

	@Then("^SwitchTo Top Section Clear Text and Enter Text$")
	public void switchto_top_section_clear_text_and_enter_text() throws Throwable {
		lettersPage.clickOnTopSection();
		genericUtils.switchToDefault();

	}

	@Then("^Prep Page Pending Manual Letter: CTA Rollover Letter$")
	public void prep_page_pending_manual_letter_cta_rollover_letter() throws Throwable {

		// lettersPage.pendingCTARollverLetterPrepPage();
		// lettersPage.enterBeneficiaryInformationPendingLetterCTARollover();

	}

	@Then("^Prep Page Approval Manual Letter: Employee Approval Letter$")
	public void prep_page_approval_manual_letter_employee_approval_letter() throws Throwable {

		lettersPage.approvalEmployeeLetterPrepPage();

	}

	@Then("^Denial did not serve waiting period Letter Prep Page$")
	public void denial_did_not_serve_waiting_period_letter_prep_page() throws Throwable {

		lettersPage.denialDidNotServeWaitingPeriodLetterPrepPage();

	}

	@Then("^Click on Save and Continue Button in Prep Page$")
	public void click_on_save_and_continue_button_in_prep_page() throws Throwable {
		lettersPage.manualLetterSaveAndContBtn.click();
		Thread.sleep(2000);
	}

	@Then("^Click on Save as Draft button and Verify Letter Successfully was created$")
	public void click_on_save_as_draft_button_and_verify_letter_successfully_was_created() throws Throwable {
		lettersPage.manualLetterSaveAsDraftBtn.click();
		lettersPage.manualLetterLetterSuccessfullyCreatedMessage.isDisplayed();
		Assert.assertTrue(lettersPage.manualLetterLetterSuccessfullyCreatedMessage.isDisplayed());

		Thread.sleep(5000);

	}

	@Then("^Click on Confirm Document button and Verify Letter Successfully was created$")
	public void click_on_confirm_document_button_and_verify_letter_successfully_was_created() throws Throwable {
		lettersPage.manualLetterConfirmBtn.click();

		lettersPage.manualLetterLetterSuccessfullyCreatedMessage.isDisplayed();
		Assert.assertTrue(lettersPage.manualLetterLetterSuccessfullyCreatedMessage.isDisplayed());

		Thread.sleep(5000);
	}

	@Then("^Click on Create Task from This Letter button$")
	public void click_on_create_task_from_this_letter_button() throws Throwable {
		lettersPage.manualLetter_CreateTaskFromThisLetterBtnFromConfirmationPage_LW.click();
	}

	@Then("^Click on Return to Claimant Details Page Button$")
	public void click_on_return_to_claimant_details_page_button() throws Throwable {
		Thread.sleep(2000);
		lettersPage.manualLetterReturnToClaimantDetailsBtn.click();
		Thread.sleep(2000);
		viewClaimantDetailspage.SSNQuickSearchVCP.isDisplayed();
	}

	@Then("^Click Create Task Btn and Select a Task \"([^\"]*)\" and check checkbox for a document and upload a file \"([^\"]*)\"$")
	public void click_create_task_btn_and_select_a_task_something_and_check_checkbox_for_a_document_and_upload_a_file_something(
			String strArg1, String strArg2) throws Throwable {

		lettersPage.manualLetter_CreateTaskFromThisLetterBtnFromConfirmationPage_LW.click();
		Thread.sleep(1000);
		lettersPage.select_CreateTaskFromLetter_SelectaTaskDropdown(strArg1);
		lettersPage.checkBoxforAuthorizationDocandVerifycompleteTaskUponCreationChkBox();

		lettersPage.uploadFileCreateTaskFromLetterPopup(strArg2);

	}

	@Then("^Create a Task from this Manual Letter from ViewClaimant Page$")
	public void create_a_task_from_this_manual_letter_from_viewclaimant_page() throws Throwable {

	}

	@Then("^Verify Task: Employee Approval Letter was created properly$")
	public void verify_task_employee_approval_letter_was_created_properly() throws Throwable {
		lettersPage.manualLetterTaskEmployeeApprovalLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Manual Letter Task CTA Rollover was created properly$")
	public void verify_manual_letter_task_cta_rollover_was_created_properly() throws Throwable {
		viewClaimantDetailspage.ctaRolloverLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: Denial did not serve waiting period was created properly$")
	public void verify_task_denial_did_not_serve_waiting_period_was_created_properly() throws Throwable {

		lettersPage.manualLetterTaskEmployeeApprovalLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();

	}

	@Then("^Verify Task: Incomplete Form Request was created properly$")
	public void verify_task_incomplete_form_request_was_created_properly() throws Throwable {
		lettersPage.manualIncompleteFormRequestLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: Miscellaneous Document was created properly$")
	public void verify_task_miscellaneous_document_was_created_properly() throws Throwable {
		lettersPage.manualMiscDocLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}
	
	   @Then("^Verify Task: Pending Waiver Letter 30th Day was created properly$")
	    public void verify_task_pending_waiver_letter_30th_day_was_created_properly() throws Throwable {
		   lettersPage.manualPendingWaiverLetter30thDayLetterTask.isDisplayed();

			viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
			viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	    }

	    @Then("^Verify Task: Pending Waiver Letter 45th Day was created properly$")
	    public void verify_task_pending_waiver_letter_45th_day_was_created_properly() throws Throwable {
	    	lettersPage.manualPendingWaiverLetter45thDayLetterTask.isDisplayed();

			viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
			viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	    }

	    @Then("^Verify Task: Pending Waiver Letter 60th Day was created properly$")
	    public void verify_task_pending_waiver_letter_60th_day_was_created_properly() throws Throwable {
	    	lettersPage.manualPendingWaiverLetter60thDayLetterTask.isDisplayed();

			viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
			viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	    }
	

	@Then("^Verify Task: Approval Letter was created properly$")
	public void verify_task_approval_letter_was_created_properly() throws Throwable {
		lettersPage.manualApprovalLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: Approval Review was created properly$")
	public void verify_task_approval_review_was_created_properly() throws Throwable {
		lettersPage.manualApproverReviewLetter.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: MOSERS 201 was created properly$")
	public void verify_task_mosers_201_was_created_properly() throws Throwable {
		lettersPage.manualMOSERS201LetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: POL Notification was created properly$")
	public void verify_task_pol_notification_was_created_properly() throws Throwable {
		lettersPage.manualPOLNotificationLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: Recert Approval Letter was created properly$")
	public void verify_task_recert_approval_letter_was_created_properly() throws Throwable {
		lettersPage.manualRecertApprovalLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: Denial Letter was created properly$")
	public void verify_task_denial_letter_was_created_properly() throws Throwable {
		lettersPage.manualDenialLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: Closure Letter was created properly$")
	public void verify_task_closure_letter_was_created_properly() throws Throwable {
		lettersPage.manualClosureLetterTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();

	}

	@Then("^Verify Task: ARU Deferral was created properly$")
	public void verify_task_aru_deferral_was_created_properly() throws Throwable {
		lettersPage.manualARUDeferralTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: ARU Extension was created properly$")
	public void verify_task_aru_extension_was_created_properly() throws Throwable {
		lettersPage.manualARUExtensionTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: ARU Initial Status was created properly$")
	public void verify_task_aru_initial_status_was_created_properly() throws Throwable {
		lettersPage.manualARUInitialStatusTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: ARU Overturn was created properly$")
	public void verify_task_aru_overturn_was_created_properly() throws Throwable {
		lettersPage.manualARUOverturnTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}

	@Then("^Verify Task: ARU Pending Update was created properly$")
	public void verify_task_aru_pending_update_was_created_properly() throws Throwable {
		lettersPage.manualARUPendingUpdateTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
	}
	
	@Then("^Verify Task: ARU Uphold was created properly$")
    public void verify_task_aru_uphold_was_created_properly() throws Throwable {
		lettersPage.manualARUUpholdTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
    }

    @Then("^Verify Task: CAS Request was created properly$")
    public void verify_task_cas_request_was_created_properly() throws Throwable {
    	lettersPage.manualCASRequestTask.isDisplayed();

		viewClaimantDetailspage.verifyHasCompletedIconMostRecent();
		viewClaimantDetailspage.lwAttachmentIcon2Position.isDisplayed();
    }

	@Then("^Check the checkbox for BRE option$")
	public void check_the_checkbox_for_bre_option() throws Throwable {
		lettersPage.includeBRETaskfromLetterPopup();
	}

	@Then("^Click on Create Button to create Manual Letter Task from Confirmation page$")
	public void click_on_create_button_to_create_manual_letter_task_from_confirmation_page() throws Throwable {
		lettersPage.clickCreateBtnfromConfirmationPage();
	}

	@Then("^Click on Recert Approval Letter Button$")
	public void click_on_recert_approval_letter_button() throws Throwable {
		lettersPage.createRecertApprovalLetter();
	}

	@And("^Verify existing Tasks are completed and IAT is created in Pending Status$")
	public void verify_existing_tasks_are_completed_and_iat_is_created_in_pending_status() throws Throwable {
		viewClaimantDetailspage.verifyPATaskStatusisCompleted();
		viewClaimantDetailspage.verifyClaimantQuestionnaireTaskStatusisCompleted();
		viewClaimantDetailspage.verifyRecertApprovalLetterTaskStatusisCompleted();
		viewClaimantDetailspage.verifyIATTaskStatusisPending();

	}

	@And("^Verify Pending Waiver Letter Task are in Completed Status and verify Icons$")
	public void verify_pending_waiver_letter_task_are_in_completed_status_and_verify_icons() throws Throwable {
		viewClaimantDetailspage.verifyPendingWaiverLetterStatusisCompleted();
		viewClaimantDetailspage.ltd_CompletedIconMostRecentTaskPosition1.isDisplayed();
		viewClaimantDetailspage.LTD_AttachmentIconMostRecentTaskPosition2.isDisplayed();
		viewClaimantDetailspage.ltd_AssociatedwithLWLetterIconMostRecentTaskPosition3.isDisplayed();

	}

	@Then("^Verify all letters in Create Pending Letter dropdown for LW$")
	public void verify_all_letters_in_create_pending_letter_dropdown_for_lw() throws Throwable {
		lettersPage.verifyALLPendingManualLettersinDropdownLW();
		Thread.sleep(2000);

	}

	@Then("^Verify all letters in Create Approval Letter dropdown for LW$")
	public void verify_all_letters_in_create_approval_letter_dropdown_for_lw() throws Throwable {
		lettersPage.verifyALLApprovalManualLettersinDropdownLW();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Denial Letter dropdown for LW$")
	public void verify_all_letters_in_create_denial_letter_dropdown_for_lw() throws Throwable {
		lettersPage.verifyALLDenialManualLettersinDropdownLW();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Admin Letter dropdown for LW$")
	public void verify_all_letters_in_create_admin_letter_dropdown_for_lw() throws Throwable {
		lettersPage.verifyALLAdminManualLettersinDropdownLW();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Closure Letter dropdown for LW$")
	public void verify_all_letters_in_create_closure_letter_dropdown_for_lw() throws Throwable {
		lettersPage.verifyALLClosureManualLettersinDropdownLW();

	}

	@Then("^Verify all letters in Create Pending Letter dropdown for LTD$")
	public void verify_all_letters_in_create_pending_letter_dropdown_for_ltd() throws Throwable {
		lettersPage.verifyALLPendingManualLettersinDropdownLTD();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Approval Letter dropdown for LT$")
	public void verify_all_letters_in_create_approval_letter_dropdown_for_lt() throws Throwable {
		lettersPage.verifyALLApprovalManualLettersinDropdownLTD();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Denial Letter dropdown for LTD$")
	public void verify_all_letters_in_create_denial_letter_dropdown_for_ltd() throws Throwable {
		lettersPage.verifyALLDenialManualLettersinDropdownLTD();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Admin Letter dropdown for LTD$")
	public void verify_all_letters_in_create_admin_letter_dropdown_for_ltd() throws Throwable {
		lettersPage.verifyALLAdminManualLettersinDropdownLTD();
		Thread.sleep(2000);
	}

	@Then("^Verify all letters in Create Closure Letter dropdown for LTD$")
	public void verify_all_letters_in_create_closure_letter_dropdown_for_ltd() throws Throwable {
		lettersPage.verifyALLClosureManualLettersinDropdownLTD();
		Thread.sleep(2000);
	}
}
