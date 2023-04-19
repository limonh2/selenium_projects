package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.messages.types.Duration;
import utils.GenericUtils;

@SuppressWarnings("unused")
public class SearchClaimantPage {
	public WebDriver driver;
	GenericUtils genericUtils;

	public SearchClaimantPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 genericUtils = new GenericUtils(driver);
	}

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ddlSearchType")
	public WebElement SearchTypeDropdown;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnSearch")
	public WebElement SearchRefreshBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_txtFirstName")
	public WebElement FirstNameSearch;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_txtLastName")
	public WebElement LastNameSearch;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ddlCollaborativeClaim")
	public WebElement CollaborativeClaimSearch;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_SSNControl_txtThird")
	public WebElement SSNFieldSearchClaimaint;

	@FindBy(id = "btnClear")
	public WebElement ClearBtn;

	@FindBy(linkText = "Search Claimant")
	public WebElement SearchClaimantTab;

	// Results section fo search clamiaint
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantResultsDisplay")
	public WebElement TotalNumofRecords;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_LWWebDataGrid")
	public WebElement ResultsTable;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantResultsDisplay")
	public WebElement TotalNumofRecordsinSearchField;

	@FindBy(xpath = "//div[@id='sidenav']//h2[1]")
	public WebElement ClaimaintDetailsTitle;

	@FindBy(xpath = "//h3[normalize-space()='This is a Combo Claim']")
	public WebElement ComboClaimTitle;

	@FindBy(id = "tab7a")
	public WebElement LTDTab;

	@FindBy(id = "tab4a")
	public WebElement LWTab;

	@FindBy(id = "tab8a")
	public WebElement AUXTab;
	// Results table

	@FindBy(xpath = "(//td[@type='cell'])[1]")
	public WebElement FirstRowClickResultsTable;

	// Search Claimant page methods
	public void SelectSearchTypefromDropdown(String SearchProductType) throws Exception {
		SearchTypeDropdown.click();

		Select sel = new Select(SearchTypeDropdown);

		sel.selectByVisibleText(SearchProductType);

	}
	
	public void waitForTextToLoad() {
		genericUtils.waitforElementToBePresent();
	}

	public void SelectCollaborativeClaimDropdown(String SelectCollabType) throws Exception {

		Select sel = new Select(CollaborativeClaimSearch);
		sel.selectByVisibleText(SelectCollabType);

	}

	public void VerifyTitleInViewClaimantpage(String ActualTitle, String ExpectedTitle) {

		ClaimaintDetailsTitle.getText();
		Assert.assertEquals(ActualTitle, ExpectedTitle);

	}

	public void VerifyComboClaimTitleInViewClaimantpage(String ActualTitle, String ExpectedTitle) {

		ComboClaimTitle.getText();
		Assert.assertEquals(ActualTitle, ExpectedTitle);

	}

	public void VerifyProductTabTextInViewClaimantpage(String ActualTitle, String ExpectedTitle) {

		LTDTab.getText();
		Assert.assertEquals(ActualTitle, ExpectedTitle);

	}

	public void VerifySearchHasResults() {

		TotalNumofRecordsinSearchField.getText();

		// String result = TotalNumofRecordsinSearchField.getText();

		Assert.assertNotEquals(0, 0);

	}

	public void enterDatainFirstName(String value) throws IOException {

		FirstNameSearch.click();
		FirstNameSearch.clear();
		FirstNameSearch.sendKeys(value);

	}

	public void selectProductFromDropdownSearchClaimantPage() throws IOException {

//genericUtils.selectFromDropDown(SearchTypeDropdown, selectByValue, null);
	}

	public void waitforResultTable() {

		genericUtils.waitForVisibilityOfElement(ResultsTable);

	}
}
