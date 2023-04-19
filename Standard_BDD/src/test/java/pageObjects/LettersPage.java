package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
public class LettersPage {
	public WebDriver driver;
	GenericUtils genericUtils;
	ViewClaimantDetailsPage viewClaimantDetailsPage;

	public LettersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		genericUtils = new GenericUtils(driver);
		viewClaimantDetailsPage = new ViewClaimantDetailsPage(driver);
	}

	// Manual Letters LTD ************************

	// Life Waiver Manual Letters grid

	// Create Pending Letter in LW claim

	@FindBy(xpath = "//p[normalize-space()='***")
	public WebElement updateTextBox;

	@FindBy(id = "btnOpen_Pending_CPID3_MLB_LetterDialog")
	public WebElement createPendingLetterBtnLW;

	@FindBy(id = "select_Pending_CPID3_MLB_TemplateDialog")
	public WebElement pendingManualLetterDropdownLW;

	@FindBy(id = "button-create-_Pending_CPID3_MLB_-letr")
	public WebElement pendingLetterCreateBtnLW;

	@FindBy(id = "button-cancel-_Pending_CPID3_MLB_-letr")
	public WebElement pendingLetterCancelBtn;
	
	@FindBy(id = "button-cancel-_Pending_CPID5_MLB_-letr")
	public WebElement pendingLetterCancelBtnLTD;
	
	

	// Create Approval Letter
	@FindBy(id = "btnOpen_Approval_CPID3_MLB_LetterDialog")
	public WebElement createApprovalLetterBtnLW;

	@FindBy(id = "select_Approval_CPID3_MLB_TemplateDialog")
	public WebElement approvalManualLetterDropdownLW;

	@FindBy(id = "button-create-_Approval_CPID3_MLB_-letr")
	public WebElement approvalLetterCreateBtnLW;

	@FindBy(id = "button-cancel-_Approval_CPID3_MLB_-letr")
	public WebElement approvalLetterCancelBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ignoreOption")
	public WebElement selectOptionsIgnore;

	// Pending Letter CTA Rollover Beneficiarty Information
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPBeneficiaryControl2_ddlPriCon")
	public WebElement beneficiaryInfoPrimaryDropdown1Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPBeneficiaryControl2_txtName1")
	public WebElement nameField2Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPBeneficiaryControl2_txtRelation1")
	public WebElement relationField3Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPBeneficiaryControl2_txtPercentage1")
	public WebElement percentageField4Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPBeneficiaryControl2_btnSaveKeyContact1")
	public WebElement beneficiarySaveBtnPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_btnCancel")
	public WebElement beneficiaryCancelBtnPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPBeneficiaryControl2_rptCliLwopBen1_ctl01_lnkbtnDelete")
	public WebElement beneficiaryRemoveBtnPending;

	// Create Pending Letter in LTD claim
	@FindBy(id = "btnOpen_Pending_CPID5_MLB_LetterDialog")
	public WebElement createPendingLetterBtnLTD;

	@FindBy(id = "select_Pending_CPID5_MLB_TemplateDialog")
	public WebElement pendingManualLetterDropdownLTD;

	@FindBy(id = "button-create-_Pending_CPID5_MLB_-letr")
	public WebElement pendingLetterCreateBtnLTD;

	@FindBy(id = "btnOpen_Approval_CPID5_MLB_LetterDialog")
	public WebElement createApprovalLetterBtnLTD;

	@FindBy(id = "select_Approval_CPID5_MLB_TemplateDialog")
	public WebElement approvalManualLetterDropdownLTD;

	@FindBy(id = "button-cancel-_Approval_CPID5_MLB_-letr")
	public WebElement approvalLetterCancelBtnLTD;

	@FindBy(id = "btnOpen_Denial_CPID5_MLB_LetterDialog")
	public WebElement createDenialLetterBtnLTD;

	@FindBy(id = "button-cancel-_Denial_CPID5_MLB_-letr")
	public WebElement denialLetterCancelBtnLTD;

	@FindBy(id = "select_Denial_CPID5_MLB_TemplateDialog")
	public WebElement denialLetterDropdownLTD;

	@FindBy(id = "btnOpen_Administration_CPID5_MLB_LetterDialog")
	public WebElement createAdminLetterBtnLTD;

	@FindBy(id = "select_Administration_CPID5_MLB_TemplateDialog")
	public WebElement adminLetterDropdownLTD;

	@FindBy(id = "button-cancel-_Administration_CPID5_MLB_-letr")
	public WebElement adminLetterCancelBtnLTD;

	@FindBy(id = "btnOpen_Closure_CPID5_MLB_LetterDialog")
	public WebElement createClosureLetterBtnLTD;

	@FindBy(id = "select_Closure_CPID5_MLB_TemplateDialog")
	public WebElement closureManualLetterDropdownLTD;

	@FindBy(id = "button-cancel-_Closure_CPID5_MLB_-letr")
	public WebElement closureLetterCancelBtnLTD;

	// Approval -Employee Approval - Template fields such as Salutation, Payment of
	// Premium, etc

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ignoresalutation")
	public WebElement salutation_ChkBox_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ignoreCLpop")
	public WebElement paymentofPremium_ChkBox_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlSignPercent")
	public WebElement selectionInfoPercent1;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlagetype")
	public WebElement selectionInfoType2;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_txtAgeCount")
	public WebElement selectionInfoField3;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rblADD_0")
	public WebElement accidentalDeathDismembermentInsurance_Yes;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rblADD_1")
	public WebElement accidentalDeathDismembermentInsurance_No;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_chkAllInfoIgnoresalutationADD")
	public WebElement accidentalDeathDismembermentInsurance_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_chkAllInfoIgnoresalutationDepend")
	public WebElement dependentLifeInsurance_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbldependent_0")
	public WebElement dependentLifeInsurance_Yes;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbldependent_1")
	public WebElement dependentLifeInsurance_No;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_chkAllInfoIgnoresalutationPRO")
	public WebElement premiumRefundOption_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ddlBenDesig")
	public WebElement beneficiaryDesignationDropdown;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_chkclarifyBen")
	public WebElement clarificationonBeneficiaries_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_chkAllInfoIgnoresalutationABP")
	public WebElement acceleratedBenefitProvision_Ignore;

	// Create Denial Letter
	@FindBy(id = "btnOpen_Denial_CPID3_MLB_LetterDialog")
	public WebElement createDenialLetterBtnLW;

	@FindBy(id = "select_Denial_CPID3_MLB_TemplateDialog")
	public WebElement denialLetterDropdownLW;

	@FindBy(id = "button-create-_Denial_CPID3_MLB_-letr")
	public WebElement denialLetterCreateBtnLW;

	@FindBy(id = "button-cancel-_Denial_CPID3_MLB_-letr")
	public WebElement denialLetterCancelBtn;

	// Create Adminstration Letter
	@FindBy(id = "btnOpen_Administration_CPID3_MLB_LetterDialog")
	public WebElement createAdminLetterBtnLW;

	@FindBy(id = "select_Administration_CPID3_MLB_TemplateDialog")
	public WebElement adminLetterDropdownLW;

	@FindBy(id = "button-create-_Administration_CPID3_MLB_-letr")
	public WebElement adminLetterCreateBtnLW;

	@FindBy(id = "button-cancel-_Administration_CPID3_MLB_-letr")
	public WebElement adminLetterCancelBtn;

	// Denial Template -Denial - did not serve waiting period - Template fields such
	// as Salutation, etc

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_txtWaitingPeriodDays")
	public WebElement waitingPeriodDays;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_txtCeasedDate")
	public WebElement ceasedWorkDate;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_txtWaitingPeriodEndDate")
	public WebElement waitingPeriodEndDate;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ignoreRtwOption")
	public WebElement rTWOption_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbRtwOption_0")
	public WebElement rTWOption_Yes;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbRtwOption_1")
	public WebElement rTWOption_No;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ignoreMedicallyOption")
	public WebElement medRecoveredOption_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbMedicallyOption_0")
	public WebElement medRecoveredOption_Yes;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbMedicallyOption_1")
	public WebElement medRecoveredOption_No;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ignoreMedicalDocNotSupport")
	public WebElement medicalDocumentation_Ignore;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbMedicalDocNotSupport_0")
	public WebElement medicalDocumentation_Yes;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rbMedicalDocNotSupport_1")
	public WebElement medicalDocumentation_No;

	// Create Closure Letter
	@FindBy(id = "btnOpen_Closure_CPID3_MLB_LetterDialog")
	public WebElement createClosureLetterBtnLW;

	@FindBy(id = "select_Closure_CPID3_MLB_TemplateDialog")
	public WebElement closureManualLetterDropdownLW;

	@FindBy(id = "button-create-_Closure_CPID3_MLB_-letr")
	public WebElement closureLetterCreateBtn;

	@FindBy(id = "button-cancel-_Closure_CPID3_MLB_-letr")
	public WebElement closureLetterCancelBtn;

	// Buttons after clicking a template for manual letters

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnSkip")
	public WebElement manualLetterSkipBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnSave")
	public WebElement manualLetterSaveAndContBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_lnkCancel")
	public WebElement manualLetterCancelBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnPreview")
	public WebElement manualLetterPreviewBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnSaveDraft")
	public WebElement manualLetterSaveAsDraftBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnSaveConfirm")
	public WebElement manualLetterConfirmBtn;

	@FindBy(linkText = "Return to Claimant Details")
	public WebElement manualLetterReturnToClaimantDetailsBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnViewLWLetter")
	public WebElement manualLetterDownloadonConfirmationPageBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnEmailLetter")
	public WebElement manualLetterEmailLetteronConfirmationPageBtn;

	@FindBy(xpath = "//p[normalize-space()='Letter successfully created!']")
	public WebElement manualLetterLetterSuccessfullyCreatedMessage;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnCreateLWTaskWithLetter")
	public WebElement manualLetter_CreateTaskFromThisLetterBtnFromConfirmationPage_LW;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_chkBRE")
	public WebElement manualLetter_CreateTaskFromLetter_IncludeBRE_Chkbox;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_AttachmentUploader")
	public WebElement manualLetter_CreateTaskFromLetter_ChooseFiles_btn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_ddlLWTasks")
	public WebElement manualLetter_CreateTaskFromLetter_SelectaTask_dropdown;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_cbLWSAPrint")
	public WebElement manualLetter_CreateTaskFromLetter_SendServiceAdminPrint_chkbox;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_ddlLWTasks")
	public WebElement manualLetter_CreateTaskFromLetter_Create_btn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_btnViewLWLetter")
	public WebElement manualLetter_CreateTaskFromLetter_Downloadbtn;

	@FindBy(xpath = "//label[text()='Top Section:']/following-sibling::div//iframe[contains(@title,'Rich Text Editor')]")
	public WebElement topSectionTextBox;

	@FindBy(xpath = "/html/body/p[1]")
	public WebElement inpTopSectionTextBox;

	@FindBy(xpath = "/html/body")
	public WebElement inpTopSectionTextBox1;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_cbCompleteTask")
	public WebElement completeTaskUponCreationChkBox;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_taskFromLetter_cblLWDocs_5")
	public WebElement checkboxAuthorizationFromCreateTaskFromletterConfirmatonPage;

	@FindBy(xpath = "//*[@aria-describedby='createLWTaskDialog']//button[text()='Create']")
	public WebElement clickCreateBtnfromConfirmationPage;

	@FindBy(xpath = "(//a[contains(text(),'Employee Approval Letter')])[1]")
	public WebElement manualLetterTaskEmployeeApprovalLetterTask;

	@FindBy(xpath = "(//a[contains(text(),'Denial Letter')])[1]")
	public WebElement manualLetterTaskDenialLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Incomplete Form Request')])[1]")
	public WebElement manualIncompleteFormRequestLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Miscellaneous Document')])[1]")
	public WebElement manualMiscDocLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Approval Letter')])[1]")
	public WebElement manualApprovalLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Approver Review')])[1]")
	public WebElement manualApproverReviewLetter;
	
	@FindBy(xpath = "(//a[contains(text(),'MOSERS 201')])[1]")
	public WebElement manualMOSERS201LetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'POL Notification')])[1]")
	public WebElement manualPOLNotificationLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Recert Approval Letter')])[1]")
	public WebElement manualRecertApprovalLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Denial Letter')])[1]")
	public WebElement manualDenialLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Closure Letter')])[1]")
	public WebElement manualClosureLetterTask;
		
	@FindBy(xpath = "(//a[contains(text(),'ARU Deferral')])[1]")
	public WebElement manualARUDeferralTask;	
	
	@FindBy(xpath = "(//a[contains(text(),'ARU Extension')])[1]")
	public WebElement manualARUExtensionTask;
	
	@FindBy(xpath = "(//a[contains(text(),'ARU Initial Status')])[1]")
	public WebElement manualARUInitialStatusTask;
	
	@FindBy(xpath = "(//a[contains(text(),'ARU Pending Update')])[1]")
	public WebElement manualARUPendingUpdateTask;
	
	@FindBy(xpath = "(//a[contains(text(),'ARU Overturn')])[1]")
	public WebElement manualARUOverturnTask;
		
	@FindBy(xpath = "(//a[contains(text(),'ARU Uphold')])[1]")
	public WebElement manualARUUpholdTask;
	
	@FindBy(xpath = "(//a[contains(text(),'CAS Request')])[1]")
	public WebElement manualCASRequestTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Pending Waiver Letter 30th Day')])[1]")
	public WebElement manualPendingWaiverLetter30thDayLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Pending Waiver Letter 45th Day')])[1]")
	public WebElement manualPendingWaiverLetter45thDayLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Pending Waiver Letter 60th Day')])[1]")
	public WebElement manualPendingWaiverLetter60thDayLetterTask;
	
	
	
	
	////
	// Pending Letter Select Information Options BEG
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_txtAmount")
	public WebElement dollarAmountField1Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_ddlLifeInsurance")
	public WebElement coverageDropdownField2DropdownPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_ddlreducetype")
	public WebElement coverageOptionsField3DropdownPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_ddlSignDollar")
	public WebElement dollarOption4DropdownPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_txtPercentage")
	public WebElement percentageNumberField5Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_ddlSignPercent")
	public WebElement signPerecentOption6DropdownPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_ddlagetype")
	public WebElement ageTypeOption7DropdownPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_txtAgeCount")
	public WebElement ageCountOption8Pending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_btnSaveKeyContact")
	public WebElement selectInfoSaveBtnPending;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddAllInformationControl3_rptAllInformation_ctl01_lnkbtnDelete")
	public WebElement selectInfoRemoveBtnPending;
	// Pending Letter Select Information Options END

//Approval Letter Select Information Options  BEG
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_txtAmount")
	public WebElement dollarAmountField1Approval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlLifeInsurance")
	public WebElement coverageDropdownField2DropdownApproval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlreducetype")
	public WebElement coverageOptionsField3DropdownApproval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlSignDollar")
	public WebElement dollarOption4DropdownApproval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_txtPercentage")
	public WebElement percentageNumberField5Approval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlSignPercent")
	public WebElement signPerecentOption6DropdownApproval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_ddlagetype")
	public WebElement ageTypeOption7DropdownApproval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_txtAgeCount")
	public WebElement ageCountOption8Approval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_btnSaveKeyContact")
	public WebElement selectInfoSaveBtnApproval;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_AddCLIandLWOPControl1_rptCliLwop_ctl01_lnkbtnDelete")
	public WebElement selectInfoRemoveBtnApproval;
	// Approval Letter Select Information Options END

	@FindBy(id = "ltdServiceButtons_sbtn_5_89_lnkbtnServiceControl")
	public WebElement recertApprovalLetterBtnLTD;

	@FindBy(id = "recommendContinuationApprAnnualExpDatePicker")
	public WebElement recertApprovalLetterExpirationDateField;

	@FindBy(xpath = "//*[@aria-describedby='divContinuationApproval']//button[text()='Continue']")
	public WebElement recertApprovalLetterContinueBtnLTD;

	@FindBy(xpath = "(//*[@aria-describedby='divContinuationApproval']//button[text()='Cancel']")
	public WebElement recertApprovalLetterCancelBtnLTD;

	/*	
	 * 
	 * 
	 * 
		*/

	public void createRecertApprovalLetter() throws InterruptedException {
		recertApprovalLetterBtnLTD.click();
		recertApprovalLetterExpirationDateField.click();
		recertApprovalLetterExpirationDateField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		recertApprovalLetterContinueBtnLTD.click();
		Thread.sleep(10000);
	}

	public void uploadFileCreateTaskFromLetterPopup(String file) throws InterruptedException {
		String userdir = System.getProperty("user.dir");
		String filePath = String.format("%s\\src\\test\\resources\\TestData\\%s", userdir, file);

		Thread.sleep(3000);
		// manualLetter_CreateTaskFromLetter_ChooseFiles_btn.click();
		manualLetter_CreateTaskFromLetter_ChooseFiles_btn.sendKeys(filePath);
		Thread.sleep(10000);
	}

	public void includeBRETaskfromLetterPopup() {

		boolean includeBREState = manualLetter_CreateTaskFromLetter_IncludeBRE_Chkbox.isSelected();

		if (includeBREState == false) {
			manualLetter_CreateTaskFromLetter_IncludeBRE_Chkbox.click();

		}

	}

	public void checkBoxforAuthorizationDocandVerifycompleteTaskUponCreationChkBox() throws InterruptedException {

		checkboxAuthorizationFromCreateTaskFromletterConfirmatonPage.click();

		Thread.sleep(2000);

		Assert.assertTrue(completeTaskUponCreationChkBox.isSelected());

	}

	public void clickOnTopSection() {
		genericUtils.switchToIframe(topSectionTextBox);

//		inpTopSectionTextBox.sendKeys("Testing");
		inpTopSectionTextBox1.clear();
		inpTopSectionTextBox1.sendKeys("Replaced all placeholders to testing purposes");

	}

	public void createPendingManualLetterLW(String letterTemplate) throws Exception {
		createPendingLetterBtnLW.click();

		Select sel = new Select(pendingManualLetterDropdownLW);
		Thread.sleep(1000);
		sel.selectByVisibleText(letterTemplate);
		Thread.sleep(1000);

		pendingLetterCreateBtnLW.click();
		Thread.sleep(3000);
	}

	public void createPendingManualLetterLTD(String letterTemplate) throws Exception {
		createPendingLetterBtnLTD.click();

		Select sel = new Select(pendingManualLetterDropdownLTD);
		Thread.sleep(1000);
		sel.selectByVisibleText(letterTemplate);
		Thread.sleep(1000);

		pendingLetterCreateBtnLTD.click();

		Thread.sleep(3000);
	}

	public void createApprovalManualLetterLW(String letterTemplate) throws Exception {
		createApprovalLetterBtnLW.click();

		Select sel = new Select(approvalManualLetterDropdownLW);
		Thread.sleep(1000);
		sel.selectByVisibleText(letterTemplate);
		Thread.sleep(1000);

		approvalLetterCreateBtnLW.click();
		Thread.sleep(3000);
	}

	public void createDenialManualLetterLW(String letterTemplate) throws Exception {
		createDenialLetterBtnLW.click();

		Select sel = new Select(denialLetterDropdownLW);
		Thread.sleep(1000);
		sel.selectByVisibleText(letterTemplate);
		Thread.sleep(1000);

		denialLetterCreateBtnLW.click();
		Thread.sleep(3000);
	}

	public void createAdminManualLetterLW(String letterTemplate) throws Exception {
		createAdminLetterBtnLW.click();

		Select sel = new Select(adminLetterDropdownLW);
		Thread.sleep(1000);
		sel.selectByVisibleText(letterTemplate);
		Thread.sleep(1000);

		adminLetterCreateBtnLW.click();
		Thread.sleep(3000);
	}
	
	public void createClosureManualLetterLW(String letterTemplate) throws Exception {
		createClosureLetterBtnLW.click();

		Select sel = new Select(closureManualLetterDropdownLW);
		Thread.sleep(1000);
		sel.selectByVisibleText(letterTemplate);
		Thread.sleep(1000);

		closureLetterCreateBtn.click();
		Thread.sleep(3000);
	}

	/*
	 * public void prepPageApprovalEmployeeLW() throws InterruptedException {
	 * 
	 * salutation_ChkBox_Ignore.click(); paymentofPremium_ChkBox_Ignore.click();
	 * accidentalDeathDismembermentInsurance_Yes.click();
	 * dependentLifeInsurance_No.click(); premiumRefundOption_Ignore.click();
	 * clarificationonBeneficiaries_Ignore.click();
	 * acceleratedBenefitProvision_Ignore.click();
	 * 
	 * manualLetterSaveAsDraftBtn.click(); Thread.sleep(3000);
	 * manualLetterLetterSuccessfullyCreatedMessage.isDisplayed();
	 * 
	 * }
	 */
	public void selectClosureLetterTemplateDropdownLW(String closureLetterOptions) throws Exception {

		Select sel = new Select(closureManualLetterDropdownLW);
		sel.selectByVisibleText(closureLetterOptions);

	}

	/// Selection Information functionality for Pending LETTER BEG

	public void selectCoverageDropdownField2Pending(String option) throws Exception {

		Select sel = new Select(coverageDropdownField2DropdownPending);
		sel.selectByVisibleText(option);

	}

	public void selectCoverageOptionsField3Pending(String option) throws Exception {

		Select sel = new Select(coverageOptionsField3DropdownApproval);
		sel.selectByValue(option);
	

	}

	public void selectDollarOptionField4Pending(String option) throws Exception {

		Select sel = new Select(dollarOption4DropdownPending);
		sel.selectByVisibleText(option);

	}

	public void selectSignPerecentOption6DropdownPending(String option) throws Exception {

		Select sel = new Select(signPerecentOption6DropdownPending);
		sel.selectByVisibleText(option);

	}

	public void selectAgeTypeOption7DropdownPending(String option) throws Exception {

		Select sel = new Select(ageTypeOption7DropdownPending);
		sel.selectByVisibleText(option);

	}

	public void enterBeneficiaryInformationPendingLetterCTARollover() {
		// Field1 is dropdown by default is Primary;

		nameField2Pending.sendKeys("John Doe");

		relationField3Pending.sendKeys("Husband");

		percentageField4Pending.sendKeys("25");

		beneficiarySaveBtnPending.click();

	}
	/// Selection Information functionality for Pending LETTER END

///Selection Information functionality for APPROVAL LETTER BEG

	public void pendingCTARollverLetterPrepPage() throws Exception {
		salutation_ChkBox_Ignore.click();
		selectOptionsIgnore.click();

		// select information fields
		dollarAmountField1Pending.sendKeys("100");
		selectCoverageDropdownField2Pending("Basic Term Life Insurance,");
		
		Thread.sleep(1000);
		selectCoverageOptionsField3Pending("reduceto");		
				
		selectDollarOptionField4Pending("$");
		Thread.sleep(1000);
		percentageNumberField5Pending.sendKeys("50");
		Thread.sleep(1000);
		selectSignPerecentOption6DropdownPending("%");
		Thread.sleep(1000);
		selectAgeTypeOption7DropdownPending("at age");
		Thread.sleep(1000);
		ageCountOption8Pending.sendKeys("80");
		Thread.sleep(1000);
		selectInfoSaveBtnPending.click();
		selectInfoRemoveBtnPending.isDisplayed();
		///
		// select information fields end

		accidentalDeathDismembermentInsurance_Ignore.click();
		dependentLifeInsurance_Ignore.click();
		premiumRefundOption_Ignore.click();
		clarificationonBeneficiaries_Ignore.click();
		acceleratedBenefitProvision_Ignore.click();
		manualLetterSaveAndContBtn.click();
		Thread.sleep(1000);
	}

	public void approvalEmployeeLetterPrepPage() throws Exception {
		salutation_ChkBox_Ignore.click();
		paymentofPremium_ChkBox_Ignore.click();

		// select information fields beg
		dollarAmountField1Approval.sendKeys("100");
		selectCoverageDropdownField2Approval("Basic Term Life Insurance");
		selectCoverageOptionsField3Approval("- reduces to");
		selectDollarOptionField4Approval("$");
		percentageNumberField5Approval.sendKeys("50");
		selectSignPerecentOption6DropdownApproval("%");
		selectAgeTypeOption7DropdownApproval("at age");
		ageCountOption8Approval.sendKeys("80");
		selectInfoSaveBtnApproval.click();
		selectInfoRemoveBtnApproval.isDisplayed();
		// select information fields end

		accidentalDeathDismembermentInsurance_Ignore.click();
		dependentLifeInsurance_Ignore.click();
		premiumRefundOption_Ignore.click();
		clarificationonBeneficiaries_Ignore.click();
		acceleratedBenefitProvision_Ignore.click();
		Thread.sleep(1000);
	}

	public void denialDidNotServeWaitingPeriodLetterPrepPage() throws InterruptedException {
		salutation_ChkBox_Ignore.click();
		waitingPeriodDays.sendKeys("30");
		ceasedWorkDate.sendKeys("01/01/2025");
		waitingPeriodEndDate.sendKeys("02/02/2025");

		rTWOption_Ignore.click();
		medRecoveredOption_Ignore.click();
		medicalDocumentation_Ignore.click();

	}

	public void selectCoverageDropdownField2Approval(String option) throws Exception {

		Select sel = new Select(coverageDropdownField2DropdownApproval);
		sel.selectByVisibleText(option);

	}

	public void selectCoverageOptionsField3Approval(String option) throws Exception {

		Select sel = new Select(coverageOptionsField3DropdownApproval);
		sel.selectByVisibleText(option);

	}

	public void selectDollarOptionField4Approval(String option) throws Exception {

		Select sel = new Select(dollarOption4DropdownApproval);
		sel.selectByVisibleText(option);

	}

	public void selectSignPerecentOption6DropdownApproval(String option) throws Exception {

		Select sel = new Select(signPerecentOption6DropdownApproval);
		sel.selectByVisibleText(option);

	}

	public void selectAgeTypeOption7DropdownApproval(String option) throws Exception {

		Select sel = new Select(ageTypeOption7DropdownApproval);
		sel.selectByVisibleText(option);

	}

	/// Selection Information functionality for APPROVAL LETTER END

	public void select_CreateTaskFromLetter_SelectaTaskDropdown(String CreateTaskFromLetter1) throws Exception {

		Select sel = new Select(manualLetter_CreateTaskFromLetter_SelectaTask_dropdown);
		sel.selectByVisibleText(CreateTaskFromLetter1);
		Thread.sleep(2000);

	}

	public void clickCreateBtnfromConfirmationPage() throws InterruptedException {
		clickCreateBtnfromConfirmationPage.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	public void verifyALLPendingManualLettersinDropdownLW() throws InterruptedException {
		createPendingLetterBtnLW.click();
		Select sel = new Select(pendingManualLetterDropdownLW);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Pending");
		expectedDropdownValues.add("CTA Rollover");
		expectedDropdownValues.add("Extension with tolling");
		expectedDropdownValues.add("Extension without tolling");
		expectedDropdownValues.add("Incomplete Form Request");
		expectedDropdownValues.add("Over 60 Contact Letter");
		expectedDropdownValues.add("Reduction letter - age");
		
		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			
			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		pendingLetterCancelBtn.click();
	}

	public void verifyALLApprovalManualLettersinDropdownLW() throws InterruptedException {
		createApprovalLetterBtnLW.click();
		Select sel = new Select(approvalManualLetterDropdownLW);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Approve and Close Employee");
		expectedDropdownValues.add("Blank Approval");
		expectedDropdownValues.add("Employee Approval");
		expectedDropdownValues.add("Generic ER Approval Letter");
		expectedDropdownValues.add("Generic ER Approval Letter - Oregon");
		expectedDropdownValues.add("MOSERS Employer Approval Letter");
		expectedDropdownValues.add("POL Reopen");
		expectedDropdownValues.add("Recert Approval Letter");
		expectedDropdownValues.add("State of IOWA Employer Letter");
		
		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			
			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		approvalLetterCancelBtn.click();
	}

	public void verifyALLDenialManualLettersinDropdownLW() throws InterruptedException {
		createDenialLetterBtnLW.click();
		Select sel = new Select(denialLetterDropdownLW);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Denial");
		expectedDropdownValues.add("Denial - did not serve waiting period");
		expectedDropdownValues.add("Denial - not a member");
		expectedDropdownValues.add("Denial - over age");
		expectedDropdownValues.add("Denial/Closure - Claimant");
		expectedDropdownValues.add("Denial/Closure - Policyholder");
		expectedDropdownValues.add("Denial/Closure at Request of Claimant");
		expectedDropdownValues.add("ER Denial Not Totally Disabled");
		expectedDropdownValues.add("FTPP Closure Warning Letter - Combo");
		expectedDropdownValues.add("FTPP Closure Warning Letter - Waiver Only");
		expectedDropdownValues.add("FTPP Denial_Closure letter");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {
			

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		denialLetterCancelBtn.click();
	}

	public void verifyALLAdminManualLettersinDropdownLW() throws InterruptedException {
		createAdminLetterBtnLW.click();
		Select sel = new Select(adminLetterDropdownLW);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("All Information");
		expectedDropdownValues.add("Blank Administration");
		expectedDropdownValues.add("Correction letter");
		expectedDropdownValues.add("PII Acknowledgment of Complete Written Request");
		expectedDropdownValues.add("PII Request for Additional Information - 3RD Party");
		expectedDropdownValues.add("PII Request for Additional Information - Claimant");
		expectedDropdownValues.add("PII Response to Request for General PI Data");
		expectedDropdownValues.add("Reduction Due to Age");
		expectedDropdownValues.add("Return Original Documents");
		expectedDropdownValues.add("SIC Not Responsible for Invoice");
		expectedDropdownValues.add("Termination");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		adminLetterCancelBtn.click();
	}

	public void verifyALLClosureManualLettersinDropdownLW() throws InterruptedException {
		createClosureLetterBtnLW.click();
		Select sel = new Select(closureManualLetterDropdownLW);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Closure");
		expectedDropdownValues.add("FTPP – LTD Closures/Waiver Closes");
		expectedDropdownValues.add("LTD Closes/Waiver Closes");
		expectedDropdownValues.add("Policyholder Approval/Closure");
		expectedDropdownValues.add("Recert Closure Letter");
		expectedDropdownValues.add("Termination Due to Age");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			// closureLetterCancelBtn.click();
			Thread.sleep(2000);
		}

	}

	/// LTD below
	public void verifyALLPendingManualLettersinDropdownLTD() throws InterruptedException {
		createPendingLetterBtnLTD.click();
		Select sel = new Select(pendingManualLetterDropdownLTD);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Pending");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		pendingLetterCancelBtnLTD.click();
	}

	public void verifyALLApprovalManualLettersinDropdownLTD() throws InterruptedException {
		createApprovalLetterBtnLTD.click();
		Select sel = new Select(approvalManualLetterDropdownLTD);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Approval");
		expectedDropdownValues.add("Recert Approval Letter");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		approvalLetterCancelBtnLTD.click();
	}

	public void verifyALLDenialManualLettersinDropdownLTD() throws InterruptedException {
		createDenialLetterBtnLTD.click();
		Select sel = new Select(denialLetterDropdownLTD);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Denial");
		expectedDropdownValues.add("Denial/Closure at Request of Claimant");
		expectedDropdownValues.add("FTPP Denial_Closure letter");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		denialLetterCancelBtnLTD.click();
	}

	public void verifyALLAdminManualLettersinDropdownLTD() throws InterruptedException {
		createAdminLetterBtnLTD.click();
		Select sel = new Select(adminLetterDropdownLTD);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Administration");
		expectedDropdownValues.add("Blank Administration");
		expectedDropdownValues.add("FTPP Warning RTS Check");
		expectedDropdownValues.add("LTD_3rd Party Income Verification Letter");
		expectedDropdownValues.add("LTD_Income Verification PAST");
		expectedDropdownValues.add("LTD_Income Verification to Claimant Letter");
		expectedDropdownValues.add("PII Acknowledgment of Complete Written Request");
		expectedDropdownValues.add("PII Request for Additional Information - 3RD Party");
		expectedDropdownValues.add("PII Request for Additional Information - Claimant");
		expectedDropdownValues.add("PII Response to Request for General PI Data");
		expectedDropdownValues.add("Publication 525 Letter");
		expectedDropdownValues.add("Return Original Documents");
		expectedDropdownValues.add("SIC Not Responsible for Invoice");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			Thread.sleep(2000);
		}
		adminLetterCancelBtnLTD.click();

	}

	public void verifyALLClosureManualLettersinDropdownLTD() throws InterruptedException {
		createClosureLetterBtnLTD.click();
		Select sel = new Select(closureManualLetterDropdownLTD);
		List<String> actualDropdownValues = new ArrayList<String>();

		for (WebElement element : sel.getOptions()) {
			actualDropdownValues.add(element.getText());

		}
		List<String> expectedDropdownValues = new ArrayList<String>();
		expectedDropdownValues.add("Blank Closure");
		expectedDropdownValues.add("Recert Closure Letter");

		System.out.println(actualDropdownValues);
		System.out.println(expectedDropdownValues);

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

			// closureLetterCancelBtn.click();
			Thread.sleep(2000);
		}

	}
}
