package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
public class TasksSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ViewClaimantDetailsPage viewClaimantDetailspage;
	GenericUtils genericUtils;

	public TasksSteps(TestContextSetup testContextSetup) {
		driver = testContextSetup.driver;
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

		// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
	}

	@And("^Verify W4S Received Task was created properly$")
	public void verify_w4s_received_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.W4SReceivedTask.isDisplayed();
		viewClaimantDetailspage.W4SReceivedTask.click();
		Thread.sleep(2000);
	}

	@And("^Verify State Withholding Received Task was created properly$")
	public void verify_state_withholding_received_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.StateWithholdingReceivedTask.isDisplayed();

		viewClaimantDetailspage.StateWithholdingReceivedTask.click();
		Thread.sleep(2000);
	}

	@Then("^Create Terminations and Reductions Tasks$")
	public void create_terminations_and_reductions_tasks() throws Throwable {
		viewClaimantDetailspage.TermsAndReductionsBtn.click();
		viewClaimantDetailspage.selectRadioButtonReduction75();
		viewClaimantDetailspage.selectRadioButtonTerms75();
		viewClaimantDetailspage.termsReductionSubmitBtn.click();
		driver.switchTo().alert().accept();

		Thread.sleep(5000);
	}

	@And("^Verify Terminations and Reductions were created properly$")
	public void verify_terminations_and_reductions_were_created_properly() throws Throwable {
		viewClaimantDetailspage.verifyallTermsReductionTasks();
	}

	@Then("^Request Claimant Questionnarie$")
	public void request_claimant_questionnarie() throws Throwable {

		viewClaimantDetailspage.requestClaimantQuestionnaire();

	}

	@And("^Verify Request Claimant Questionnarie Task was created properly$")
	public void verify_request_claimant_questionnarie_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.MedQuestionnaireTask.isDisplayed();

		Thread.sleep(2000);

	}

	@Then("^Add Reminders in tab$")
	public void add_reminders_in_tab() throws Throwable {

		viewClaimantDetailspage.RemindersTab.click();
		viewClaimantDetailspage.selectSetAReminderChkBox();
		viewClaimantDetailspage.selectRemindMeChkBox();
		viewClaimantDetailspage.selectUserEST26001();
		viewClaimantDetailspage.reminderDateField.click();
		viewClaimantDetailspage.reminderDateField.sendKeys(Keys.RETURN);

	}

	@And("^Verify Reminders task was created properly$")
	public void verify_reminders_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.reminderTask.isDisplayed();
		viewClaimantDetailspage.pendingIconReminderNoteTask.isDisplayed();

		Thread.sleep(2000);

	}

	@Then("^Click into the Reminder Note and Dismiss it$")
	public void click_into_the_reminder_note_and_dismiss_it() throws Throwable {
		viewClaimantDetailspage.reminderTask.click();
		viewClaimantDetailspage.switchToChildWindow();
		viewClaimantDetailspage.RemindersTab.click();
		viewClaimantDetailspage.ReminderDismissedChkBox.click();
		Thread.sleep(2000);

	}

	@And("^Verify Reminder was Dismissed$")
	public void verify_reminder_was_dismissed() throws Throwable {
		viewClaimantDetailspage.reminderDismissedIcon.isDisplayed();

	}

	@And("^Verify Approver Review Completed Task was created properly$")
	public void verify_approver_review_completed_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.approverReviewCompletedTask.isDisplayed();
	}

	@Then("^Upload a file from \"([^\"]*)\"$")
	public void upload_a_file_from_something(String strArg1) throws Throwable {

		viewClaimantDetailspage.uploadFile(strArg1);
	}

	@And("^Verify DMR Review Vocational Task was created properly$")
	public void verify_dmr_review_vocational_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.DMRVocationalTask.isDisplayed();
	}

	@And("^Verify DMR Review Completed Clinical Task was created properly$")
	public void verify_dmr_review_completed_clinical_task_was_created_properly() throws Throwable {

		viewClaimantDetailspage.DMRReviewCompletedClinicalTask.isDisplayed();
	}

	@And("^Verify file was uploaded to DMR Review Vocational Task$")
	public void verify_file_was_uploaded_to_dmr_review_vocational_task() throws Throwable {
		viewClaimantDetailspage.DMRVocationalTask.click();
		viewClaimantDetailspage.switchToChildWindow();
		viewClaimantDetailspage.CoverLetterDownloadlink.isDisplayed();
	}

	@And("^Verify file was uploaded to DMR Review Completed Clinical Task$")
	public void verify_file_was_uploaded_to_dmr_review_completed_clinical_task() throws Throwable {

		viewClaimantDetailspage.DMRReviewCompletedClinicalTask.click();
		viewClaimantDetailspage.switchToChildWindow();
		viewClaimantDetailspage.CoverLetterDownloadlink.isDisplayed();
	}

	@Then("^select LW - Task Options \"([^\"]*)\" and Task Sub Options \"([^\"]*)\"$")
	public void select_lw_task_options_something_and_task_sub_options_something(String strArg1, String strArg2)
			throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.selectLWTaskOptionfromDropdown(strArg1);
		viewClaimantDetailspage.selectLWTaskSubOptionfromDropdown(strArg2);

	}

	@Then("^select LW - Task Options \"([^\"]*)\" and Task Sub Options \"([^\"]*)\" using selectbyValue$")
    public void select_lw_task_options_something_and_task_sub_options_something_using_selectbyvalue(String strArg1, String strArg2) throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.selectLWTaskOptionfromDropdownValue(strArg1);
		viewClaimantDetailspage.selectLWTaskSubOptionfromDropdown(strArg2);
    }
	@And("^Verify Miscellaneous Document Task was created properly$")
    public void verify_miscellaneous_document_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.MiscDocPOAGuardianTask.isDisplayed();

	}
	
	@Then("^LTD: Create Annual Task with Recert Type \"([^\"]*)\"$")
    public void ltd_create_annual_task_with_recert_type_something(String strArg1) throws Throwable {
		viewClaimantDetailspage.clickonInitiateAnnualTaskBtnLTD();
		Thread.sleep(1000);
		viewClaimantDetailspage.selectRecertTypeLTD(strArg1);
		
		viewClaimantDetailspage.createAnnualTaskCreateBtn.click();
		Thread.sleep(5000);		
		viewClaimantDetailspage.createApprovalLetterCancelBtnLTD();
    }
	
	@Then("^QuickComplete Pending Annual Task and PA Task in Pending Tab$")
    public void quickcomplete_pending_annual_task_and_pa_task_in_pending_tab() throws Throwable {
		viewClaimantDetailspage.notesPendingTab.click();
		viewClaimantDetailspage.notesPendingTab1stChkBox();
		viewClaimantDetailspage.notesPendingTab2ndChkBox();
		viewClaimantDetailspage.notesPendingTabCompleteSelectedBtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);	
		driver.switchTo().alert().accept();
		Thread.sleep(5000);	
        
    }

    @Then("^Verify Annual Task and PA Tasks is now completed$")
    public void verify_annual_task_and_pa_tasks_is_now_completed() throws Throwable {
    	//viewClaimantDetailspage.PATask2.click();
    	//viewClaimantDetailspage.switchToChildWindow();
    	viewClaimantDetailspage.verifyPATaskStatusisCompleted();
    	
    	
    	
    	
   
    	
        
    }
}
