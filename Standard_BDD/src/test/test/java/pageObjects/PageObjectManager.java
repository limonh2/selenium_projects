package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;

	public LoginPage loginPage;
	public DashBoardPage dashBoardPage;
	public SearchClaimantPage searchClaimantPage;
	public ViewClaimantDetailsPage viewClaimantDetailsPage;
	public WorkLoadReportPage workLoadReportPage;
	public LettersPage lettersPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		// creating object of LoginPage
		loginPage = new LoginPage(driver);
		return loginPage;

	}

	public SearchClaimantPage getSearchClaimantPage() {

		searchClaimantPage = new SearchClaimantPage(driver);
		return searchClaimantPage;

	}

	public ViewClaimantDetailsPage getViewClaimantDetailsPage() {

		viewClaimantDetailsPage = new ViewClaimantDetailsPage(driver);
		return viewClaimantDetailsPage;

	}

	public DashBoardPage getdashBoardPage() {
		dashBoardPage = new DashBoardPage(driver);
		return dashBoardPage;
	}

	public WorkLoadReportPage getWorkLoadReportPage() {
		workLoadReportPage = new WorkLoadReportPage(driver);
		return workLoadReportPage;
	}
	
	public LettersPage getLettersPage() {
		lettersPage = new LettersPage(driver);
		return lettersPage;
	}

}
