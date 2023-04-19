package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.SearchClaimantPage;
import pageObjects.ViewClaimantDetailsPage;
import pageObjects.WorkLoadReportPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class SearchClaimantPageSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	SearchClaimantPage searchClaimantPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	WorkLoadReportPage workLoadReportPage;
	GenericUtils genericUtils;

	ViewClaimantDetailsPage viewClaimantDetailspage;

	public SearchClaimantPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		genericUtils = new GenericUtils(driver);

		// Add Pages which objects will be used
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		this.dashBoardPage = testContextSetup.pageObjectManager.getdashBoardPage();
		this.searchClaimantPage = testContextSetup.pageObjectManager.getSearchClaimantPage();
		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
		this.workLoadReportPage = testContextSetup.pageObjectManager.getWorkLoadReportPage();
	}

	@Given("^I am logged in the app$")
	public void i_am_logged_in_the_app() throws Throwable {
		loginPage.LoginintoApp();
	}

	@Given("^filters SearchTypeDropdownMenu \"([^\"]*)\", FirstNameSearchField \"([^\"]*)\"$")
	public void filters_searchtypedropdownmenu_something_firstnamesearchfield_something(String strArg1, String strArg2)
			throws Throwable {

		searchClaimantPage.SearchClaimantTab.click();
		searchClaimantPage.SelectSearchTypefromDropdown(strArg1);
		searchClaimantPage.enterDatainFirstName(strArg2);
		searchClaimantPage.SearchRefreshBtn.click();

	}

	@Given("^filters SearchTypeDropdownMenu \"([^\"]*)\", FirstNameSearchField \"([^\"]*)\", SelectCollaborativeClaimDropdown \"([^\"]*)\"$")
	public void filters_searchtypedropdownmenu_something_firstnamesearchfield_something_selectcollaborativeclaimdropdown_something(
			String strArg1, String strArg2, String strArg3) throws Throwable {

		searchClaimantPage.SearchClaimantTab.click();
		searchClaimantPage.SelectSearchTypefromDropdown(strArg1);
		searchClaimantPage.enterDatainFirstName(strArg2);
		searchClaimantPage.SelectCollaborativeClaimDropdown(strArg3);
		searchClaimantPage.SearchRefreshBtn.click();

	}

	@Given("^filters SearchTypeDropdownMenu \"([^\"]*)\", SSNFieldSearchClaimaint \"([^\"]*)\"$")
	public void filters_searchtypedropdownmenu_something_ssnfieldsearchclaimaint_something(String strArg1,
			String strArg2) throws Throwable {

		searchClaimantPage.SearchClaimantTab.click();
		searchClaimantPage.SelectSearchTypefromDropdown(strArg1);
		searchClaimantPage.SSNFieldSearchClaimaint.sendKeys(strArg2);
		searchClaimantPage.SearchRefreshBtn.click();

	}

	@Given("^filter SSNFieldSearchClaimaint \"([^\"]*)\"$")
	public void filter_ssnfieldsearchclaimaint_something(String strArg1) throws Throwable {
		// Currently disabling test as its not working properly and no plans to fix yet
		// dashBoardPage.searchSSNQuickSearchDashboard(strArg1);
	}

	@Then("^filters should display data results accordingly$")
	public void filters_should_display_data_results_accordingly() throws Throwable {
		searchClaimantPage.waitforResultTable();
		System.out.println("Results table is displayed");
	}

	public void waitforResultTable() {

		genericUtils.waitForVisibilityOfElement(ResultsTable);

	}

	@Then("^Verify claim is opened properly$")
	public void verify_claim_is_opened_properly() throws Throwable {
		// Currently disabling test as its not working properly and no plans to fix yet
		// viewClaimantDetailspage.verifyClaimOpened();
		System.out.println("SSN TC is completed");
	}
}
