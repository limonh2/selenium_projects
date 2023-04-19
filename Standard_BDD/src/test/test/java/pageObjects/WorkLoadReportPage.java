package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.GenericUtils;

public class WorkLoadReportPage {

	public WebDriver driver;
	GenericUtils genericUtils;

	public WorkLoadReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		genericUtils = new GenericUtils(driver);

	}

	//
	By WorkLoadReportTab = By.id("ctl00_ctl00_TopMenu1_anchorTaskReport");
	By WLR_PendingAssignedTasksReport = By.cssSelector(".reportButton.loadButton.report24Btn");
	By WLR_ResultsTable = By.id("tableDivReportTable_wrapper");
	
	//@FindBy(id = "tableDivReportTable_wrapper")
	//public WebElement WLR_ResultsTable;

	public void clickonWorkLoadReportTab() {
		driver.findElement(WorkLoadReportTab).click();
	}

	public void clickonPendingAssignedTasks() {
		driver.findElement(WLR_PendingAssignedTasksReport).click();
	}

	public void waitforResultTableWLR() {

		genericUtils.waitForVisibilityOfElement(WLR_ResultsTable);
		System.out.println("Results table was displayed");

	}


	//public void waitforResultTableWLR() {

	//	genericUtils.waitForVisibilityOfElement(WLR_ResultsTable);
	//	System.out.println("Results table was displayed");	}
}
