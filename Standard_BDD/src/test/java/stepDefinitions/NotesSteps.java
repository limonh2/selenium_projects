package stepDefinitions;

import org.openqa.selenium.Keys;
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
public class NotesSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ViewClaimantDetailsPage viewClaimantDetailspage;
	GenericUtils genericUtils;

	public NotesSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

		// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
	}

	@Then("^LW: Add new Note, NoteType \"([^\"]*)\", Task \"([^\"]*)\", Comments \"([^\"]*)\"$")
	public void add_new_note_notetype_something_task_something_comments_something(String strArg1, String strArg2,
			String strArg3) throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.selectNoteType(strArg1);
		viewClaimantDetailspage.selectLWTaskfromDropdown(strArg2);
		viewClaimantDetailspage.enterCommentstoNotes(strArg3);
		

		
	}
	
	@Then("^LTD: Add new Note, NoteType \"([^\"]*)\", Task \"([^\"]*)\", Comments \"([^\"]*)\"$")
	public void ltd_add_new_note_notetype_something_task_something_comments_something(String strArg1, String strArg2,
			String strArg3) throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.selectNoteType(strArg1);
		viewClaimantDetailspage.selectLTDTaskfromDropdown(strArg2);
		viewClaimantDetailspage.enterCommentstoNotes(strArg3);
		
	}

	@And("^Verify LW: PA Task was created properly$")
    public void verify_lw_pa_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.PATask.isDisplayed();
		viewClaimantDetailspage.verifyHasPendingNoteIconRecent_LW();
		viewClaimantDetailspage.PATask.click();
		Thread.sleep(2000);

	}
	
	 @And("^Verify LTD: PA Task was created properly$")
	    public void verify_ltd_pa_task_was_created_properly() throws Throwable {
		 viewClaimantDetailspage.PATask.isDisplayed();
			viewClaimantDetailspage.verifyHasPendingNoteIconRecent_LTD();
			viewClaimantDetailspage.PATask.click();
			Thread.sleep(2000);
	    }

	@Then("^Add a regular Note with comments \"([^\"]*)\"$")
	public void add_a_regular_note_with_comments_something(String strArg1) throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.enterCommentstoNotes(strArg1);
		

	}

	/*
	 * @Then("^Add new Note, NoteType \"([^\"]*)\", Note with comments \"([^\"]*)\"$"
	 * ) public void
	 * add_new_note_notetype_something_note_with_comments_something(String strArg1,
	 * String strArg2) throws Throwable {
	 * viewClaimantDetailspage.addNewNoteSwitchToChild();
	 * viewClaimantDetailspage.enterCommentstoNotes(strArg1);
	 * viewClaimantDetailspage.noteWindowSaveSwitch2Parent(); }
	 */

	@Then("^Verify regular Note was created$")
	public void verify_regular_note() throws Throwable {
		viewClaimantDetailspage.verifyHasRegularNoteIconRecent();
		viewClaimantDetailspage.RegularNoteTask.isDisplayed();
	}

	@Then("^Add a Call note, select NoteType \"([^\"]*)\" with comments \"([^\"]*)\"$")
	public void add_a_call_note_select_notetype_something_with_comments_something(String strArg1, String strArg2)
			throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.selectNoteType(strArg1);
		viewClaimantDetailspage.OutgoingRadioBtn.click();
		viewClaimantDetailspage.verifyRadioBtnSelection();
		viewClaimantDetailspage.enterCommentstoNotes(strArg2);

	}

	@Then("^Verify Call note was created$")
	public void verify_call_note_was_created() throws Throwable {
		viewClaimantDetailspage.verifyHasCallNoteIconMostRecent();
		viewClaimantDetailspage.CallNoteTask.isDisplayed();
	}

	@Then("^Create Recertification First Request task$")
	public void create_recertication_first_request_task() throws Throwable {
		viewClaimantDetailspage.recertFirstRequest();
	}
	
	@Then("^Create Recertification First Request task2$")
	public void create_recertication_first_request_task2() throws Throwable {
		viewClaimantDetailspage.recertFirstRequest();
		
		If () {
			
			
		}
		
	}

	@Then("^Verify Recertification First Request task$")
	public void verify_recertication_first_request_task() throws Throwable {
		viewClaimantDetailspage.Recertification1stRequestTask.isDisplayed();
		viewClaimantDetailspage.verifyHasAll4IconsMostRecentTask();
	}

	@Then("^Download Cover Letter and Documents from a Task$")
	public void download_cover_letter_and_documents_from_a_task() throws Throwable {
		viewClaimantDetailspage.Recertification1stRequestTask.click();
		viewClaimantDetailspage.switchToChildWindow();
		viewClaimantDetailspage.downloadCoverLetterandDocs();
		viewClaimantDetailspage.closeCurrentWindow();
	}

	@Then("^Add new Note, NoteType \"([^\"]*)\", Task \"([^\"]*)\", Task Option \"([^\"]*)\" Comments \"([^\"]*)\"$")
	public void add_new_note_notetype_something_task_something_task_option_something_comments_something(String strArg1,
			String strArg2, String strArg3, String strArg4) throws Throwable {
		viewClaimantDetailspage.addNewNoteSwitchToChild();
		viewClaimantDetailspage.selectNoteType(strArg1);
		viewClaimantDetailspage.selectLWTaskfromDropdown(strArg2);
		viewClaimantDetailspage.selectLWTaskOptionfromDropdown(strArg3);
		viewClaimantDetailspage.enterCommentstoNotes(strArg4);
		//viewClaimantDetailspage.noteWindowSaveSwitch2Parent();
	}
	@Then("^Add new NoteType: Note and with comments \"([^\"]*)\"$")
    public void add_new_notetype_note_and_with_comments_something(String strArg1) throws Throwable {
    	viewClaimantDetailspage.addNewNoteSwitchToChild();
		//defaults to Note
	
		viewClaimantDetailspage.enterCommentstoNotes(strArg1);
		
		

    }
	
	@Then("^Save the Claimant Note, switches to parentWindow$")
    public void save_the_claimant_note_switches_to_parentwindow() throws Throwable {
		  viewClaimantDetailspage.noteWindowSaveSwitch2Parent();
		  Thread.sleep(1000);	
	    }
	
	@Then("^switch to childWindow$")
    public void switch_to_childwindow() throws Throwable {
       viewClaimantDetailspage.switchToChildWindow();
    }

	@Then("^Verify Medical Received task was created properly$")
	public void verify_medical_received_task_was_created_properly() throws Throwable {
		viewClaimantDetailspage.MedRecTask.isDisplayed();
		viewClaimantDetailspage.verifyHasPendingNoteIconRecent_LW();
	}

	@Then("^Clean up and delete Medical Received Task from list$")
	public void clean_up_and_delete_a_task() throws Throwable {
		viewClaimantDetailspage.deleteMedRecTaskFromNotesList();

	}

	@Given("^Landing Page$")
	public void landing_page() throws Throwable {

	}

	@Then("^eneter login \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void eneter_login_something_and_password_something(String strArg1, String strArg2) throws Throwable {

	}

	@And("^verify you are logged in$")
	public void verify_you_are_logged_in() throws Throwable {

	}

}
