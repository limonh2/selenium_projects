package pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import utils.GenericUtils;
import utils.TestContextSetup;

@SuppressWarnings("unused")
public class ViewClaimantDetailsPage {

	public WebDriver driver;
	TestContextSetup testContextSetup;
	GenericUtils genericUtils;

	public ViewClaimantDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		genericUtils = new GenericUtils(driver);
	}

	// Dash-board Left Panel
	@FindBy(id = "ctl00_ctl00_MainContent_SearchSideBar1_cqSearch_txtQSearch")
	public WebElement DashboardClaimantquickSearch;

	@FindBy(id = "ctl00_ctl00_MainContent_SearchSideBar1_cqSearch_lnkbtnQuickClSearch")
	public WebElement DashboardcqsSearchBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_SearchSideBar1_snSearch_txtSsnQSearch")
	public WebElement SSNQuickSearchDashboard;
	
	@FindBy(id = "ssnqSearch_txtSsnQSearch")
	public WebElement SSNQuickSearchVCP;

	@FindBy(id = "cqSearch_lnkbtnQuickClSearch")
	public WebElement ViewClaimantSearchBtn;

	@FindBy(linkText = "Full Details")
	public WebElement FullDetailsBtn;

	// ClaimantViewDetailsPage Left Panel
	@FindBy(id = "cqSearch_txtQSearch")
	public WebElement ViewClaimantquickSearch;

	// Product tabs (LTD or LW)
	@FindBy(id = "tab7a")
	public WebElement LTDTab;

	@FindBy(id = "tab4a")
	public WebElement LWTab;

	@FindBy(id = "tab8a")
	public WebElement AUXTab;

	// LTD tab elements

	// LTD tab elements

	// Create Initiate Annual Task
	@FindBy(id = "changeStatusButtonsTopLtd_inputAnnualTask")
	public WebElement createAnnualTaskBtnLTD;

	@FindBy(id = "changeStatusButtonsTopLw_inputAnnualTask")
	public WebElement createAnnualTaskBtnLW;

	// Recertification First Request
	@FindBy(id = "ltdServiceButtons_sbtn_5_10_lnkbtnServiceControl")
	public WebElement recertFirstRequestBtn;

	@FindBy(xpath = "//*[@aria-describedby='closePendingTasksVCD']//button[text()='OK']")
	public WebElement recertOKBtn;

	@FindBy(xpath = "//*[@aria-describedby='closePendingTasksVCD']//button[text()='Cancel']")
	public WebElement recertCancelBtn;

	@FindBy(id = "cbFailAllExistingPendingTasks")
	public WebElement recertFailAppTasksCheckBoxBtn;

	// Incomplete Form Request
	@FindBy(id = "ltdServiceButtons_sbtn_5_34_lnkbtnServiceControl")
	public WebElement IncompleteFormRequestBtn;

	// Request Medical Questionnare
	@FindBy(id = "btnMedicalQuestionnare")
	public WebElement LWRequestMedicalQuestionnareBtn;

	@FindBy(id = "medQuesDate")
	public WebElement MedQuestExpirationDate;

	@FindBy(id = "ltdServiceButtons_sbtn_5_26_lnkbtnServiceControl")
	public WebElement MedRequest_Btn;
	
	@FindBy(xpath = "//*[@aria-describedby='divMedicalQuestionnaire']//button[text()='Create']")
	public WebElement MedRequest_CreateBtn;

	///
	// //*[@id='mqCbDocs_19']/following-sibling::div//button[text()='Create']

	// Documents List

	@FindBy(id = "mqCbDocs_2")
	public WebElement MedRequest_AuthorizationDoc;

	@FindBy(id = "mqCbDocs_0")
	public WebElement MedRequest_WOP_APSDoc;

	// Choose documents to attach from dropdown list

	@FindBy(id = "IncompleteFormRequest_ifrDocs_3")
	public WebElement AuthorizationDoc;

	@FindBy(id = "IncompleteFormRequest_ifrDocs_2")
	public WebElement ClaimaintStatementDoc;

	@FindBy(xpath = "")
	public WebElement IncomFormReqOKBtn;

	@FindBy(xpath = "")
	public WebElement IncomFormReqCancelBtn;

	// LTD Gateway
	@FindBy(id = "ltdServiceButtons_sbtn_5_13_lnkbtnServiceControl")
	public WebElement LtdGatewayBtn;

	@FindBy(linkText = "Accept")
	public WebElement LtdGatewayAcceptBtn;

	@FindBy(id = "MBPPreparation_txtRetAmountGeneric")
	public WebElement RetirementbenefitsPaymentAmount;

	@FindBy(linkText = "Reject")
	public WebElement LtdGatewayRejectBtn;

	@FindBy(linkText = "Cancel")
	public WebElement LtdGatewayCancelBtn;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[11]")
	public WebElement LtdGatewaySaveButtonPopup;

	// Part 1 Review

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_pcFeed")
	public WebElement LtdGateway_PCFeed;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_statAC")
	public WebElement LtdGateway_Stat;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_typeAI")
	public WebElement LtdGateway_TypeA;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_disDegP")
	public WebElement LtdGateway_DIS_DEG;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_aoDecY")
	public WebElement LtdGateway_AODEC;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_rtdMrdBlank")
	public WebElement LtdGateway_RTD_MRD;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_lsbP")
	public WebElement LtdGateway_LSB_P;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_verifiedPaid")
	public WebElement LtdGateway_VerifiedPaidPayable;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_offsetsReviewed")
	public WebElement LtdGateway_OffsetsReviewed;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_anyOccMilestone")
	public WebElement LtdGateway_AnyoccMilestone;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_NotMoserMBPRotation")
	public WebElement LtdGateway_MBPRotationParent;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_NotMoserNoClaimsContinue")
	public WebElement LtdGateway_MBPRotation_NoClaims;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_mosersMbpTerm")
	public WebElement LtdGateway_MOSERSMBPTerm;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_EST26001")
	public WebElement LtdGateway_GeneralUserId;

	// ctl00_ctl00_MainContent_MainContent_NotMoserMBPRotation

	// Recert Closure Letter
	@FindBy(id = "ltdServiceButtons_sbtn_5_247_lnkbtnServiceControl")
	public WebElement RecertClosureLetterBtn;

	// Physical Capacity Form (PCF)
	@FindBy(id = "lnkLWAddDefPCF")
	public WebElement AddStandardPCFBtn;
	
	@FindBy(id = "tableDivReportTable_wrapper")
	public WebElement WLR_ResultsTable;
	
	@FindBy(id = "tableDivReportTable_wrapper")
	public WebElement ResultsTable;



	
	// TE & E Summary

	@FindBy(id = "clTEEControlLtd_lnkEditClExp")
	public WebElement ManageAllExpBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_lnkAddExpDialog")
	public WebElement AddNewExpBtn;

	@FindBy(id = "driver.findElement(By.xpath(\"//button[[@type, 'Go to Claimant Education']")
	public WebElement GotoClaimantEduBtn;

	@FindBy(id = "driver.findElement(By.xpath(\"//button[[@type, 'Go to Claimant Training']")
	public WebElement GotoClaimantTrainingBtn;

	@FindBy(xpath = "(//a[normalize-space()='Return to Claimant Details']")
	public WebElement ReturntoClaimantDetailsBtn;

	@FindBy(linkText = "Return to Claimant Details")
	public WebElement ReturntoClaimantDetailsBtn2;

	@FindBy(linkText = "Dashboard")
	public WebElement ViewClaimantDashboardBtn;

	// All Tasks List elements in Notes
	@FindBy(linkText = "Add New Note")
	public WebElement AddNewNoteBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_btnDeleteNote")
	public WebElement ClaimantNotesDeleteButton;

	@FindBy(xpath = "(//a[contains(text(),'Recertification Request')])")
	public WebElement Recertification1stRequestTask;

	@FindBy(xpath = "(//a[contains(text(),'Recertification 2nd Request')])")
	public WebElement Recertification2ndRequestTask;

	@FindBy(xpath = "(//a[contains(text(),'MBP Detailed')])")
	public WebElement MBPDetailedTask;

	@FindBy(xpath = "(//a[contains(text(),'MBP Simple Trigger')])[1]")
	public WebElement MBPSimpleTask;

	//@FindBy(xpath = "//a[contains(text(),'Pending Adjudication')])")
	///public WebElement PATask2;
	
	@FindBy(xpath = "(//a[contains(text(),'Pending Adjudication')])[1]")
	public WebElement PATask;
	
	@FindBy(xpath = "(//a[contains(text(),'Reduction Letter')])[1]")
	public WebElement ReductionLetterTask;

	@FindBy(xpath = "(//a[contains(text(),'Medical Received')])")
	public WebElement MedRecTask;

	@FindBy(xpath = "(//a[contains(text(),'W4S Received')])")
	public WebElement W4SReceivedTask;

	@FindBy(xpath = "(//a[contains(text(),'State Withholding Received')])")
	public WebElement StateWithholdingReceivedTask;

	@FindBy(xpath = "(//a[contains(text(),'Benefit Reduction Reminder')])")
	public WebElement BenefitReductionRemTask;

	@FindBy(xpath = "(//a[contains(text(),'Benefit Termination Reminder')])")
	public WebElement BenefitTerminationRemTask;

	@FindBy(xpath = "(//a[contains(text(),'Claimant Questionnaire Trigger')])")
	public WebElement MedQuestionnaireTask;

	@FindBy(xpath = "(//a[contains(text(),'Approver Review Completed')])")
	public WebElement ApproverReviewCompletedTask;

	@FindBy(xpath = "(//a[contains(text(),'DMR Review - Vocational')])")
	public WebElement DMRReviewTask;

	@FindBy(xpath = "(//a[contains(text(),'Initiate Annual Task')])[1]")
	public WebElement IAT_Task;

	@FindBy(linkText = "EFT Request — Task Created upon Caseworker command...")
	public WebElement EFTRequest_Task;

	@FindBy(xpath = "Miscellaneous Document - General - [No comments en...")
	public WebElement MiscDoc_GeneralTask;

	@FindBy(linkText = "Resend Letter Task — Letter and Document(s) resend...")
	public WebElement ResendLetterTask;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_AttachmentControl1_lvAttachments_ctrl0_ctl01_lnkDownload")
	public WebElement FileName1;

	@FindBy(xpath = "(//a[contains(text(),'Regular note comments')])[1]")
	public WebElement RegularNoteTask;

	@FindBy(xpath = "(//a[contains(text(),'Call note comments')])[1]")
	public WebElement CallNoteTask;

	@FindBy(linkText = "Input Termination in System (trigger) —")
	public WebElement inputTerminationInSystemTask;

	@FindBy(linkText = "Benefit Termination Reminder (trigger) —")
	public WebElement benefitTerminationReminderTask;

	@FindBy(linkText = "Input Reduction in System (trigger) —")
	public WebElement inputReductioninSystemTask;

	@FindBy(linkText = "Benefit Reduction Reminder (trigger) —")
	public WebElement benefitReductionReminderTask;

	@FindBy(xpath = "(//a[contains(text(),'Task for Note')])[1]")
	public WebElement reminderTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Approver Review Completed - ARC Comments')])[1]")
	public WebElement approverReviewCompletedTask;
	
	@FindBy(xpath = "//*[@id=\"lwNotes_pnlNoteRepeater\"]//a[contains(text(),'DMR Review - Vocational')]")
	public WebElement DMRVocationalTask;
	
	@FindBy(xpath = "//*[@id=\"lwNotes_pnlNoteRepeater\"]//a[contains(text(),'DMR Review Completed - Clinical')]")
	public WebElement DMRReviewCompletedClinicalTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Miscellaneous Document - POA/Guardian')])[1]")
	public WebElement MiscDocPOAGuardianTask;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Claimant Questionnaire -')])[1]")
	public WebElement claimantQuestionnaireTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Recert Approval Letter — Task Created upon Casewor')])[1]")
	public WebElement recertApprovalLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'CTA Rollover')])[1]")
	public WebElement ctaRolloverLetterTask;
	
	@FindBy(xpath = "(//a[contains(text(),'Pending Waiver Letter ')])[1]")
	public WebElement pendingWaiverLetterTask;
	
	//*[@id=\"lwNotes_pnlNoteRepeater\"]//a[contains(text(),'Miscellaneous Document - POA/Guardian')]
	// LW Task List

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_ddlLWTask")
	public WebElement LTDLWTaskDropdown;
	


	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_ddlLWTaskOpt")
	public WebElement LWTaskOptionDropdown;
	
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_ddlTaskSubOpt")
	public WebElement LWTaskSubOptionDropdown;
	
	
	@FindBy(id = "ltdNotes_tbliPending")
	public WebElement notesPendingTab;
	
	@FindBy(id = "ltdNotes_rptPendingTasks_ctl01_chkToComplete")
	public WebElement notesPendingTab1stChkBox;
	
	@FindBy(id = "ltdNotes_rptPendingTasks_ctl02_chkToComplete")
	public WebElement notesPendingTab2ndChkBox;
	
	@FindBy(id = "ltdNotes_validate")
	public WebElement notesPendingTabCompleteSelectedBtn;
	
	
	

	/// Icons
	
	
	
	@FindBy(id = "lwNotes_rptNotes_ctl01_imgHasAttachment")
	public WebElement lwAttachmentIcon1Position;
	
	@FindBy(id = "lwNotes_rptNotes_ctl02_imgHasAttachment")
	public WebElement lwAttachmentIcon2Position;
	
	@FindBy(id = "lwNotes_rptNotes_ctl01_imgReminderDismiss")
	public WebElement reminderDismissedIcon;

	@FindBy(id = "lwNotes_rptNotes_ctl01_imgReminderPend")
	public WebElement pendingIconReminderNoteTask;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgLwTaskPending")
	public WebElement LTD_PendingIconMostRecentTask;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgPendingExpired")
	public WebElement LTD_ExpiredIconMostRecentTask0;

	@FindBy(id = "ltdNotes_rptNotes_ctl02_imgPendingExpired")
	public WebElement LTD_ExpiredIconMostRecentTask1;

	@FindBy(id = "lwNotes_rptNotes_ctl01_imgLwTaskPending")
	public WebElement LWPendingIconMostRecentTask;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgHasAttachment")
	public WebElement LTD_AttachmentIconMostRecentTaskPosition2;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgServiceAdmin")
	public WebElement LTD_ServiceAdminIconMostRecentTask;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgNextTask")
	public WebElement LTD_ExpirationIconMostRecentTask;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgRegularNote")
	public WebElement LTD_RegularNoteIconMostRecentTask;

	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgCall")
	public WebElement LTD_CallIconMostRecentTask;

	@FindBy(id = "lwNotes_rptNotes_ctl01_imgLwTaskCompleted")
	public WebElement LW_CompletedMostRecentTaskIcon;
	
	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgLwTaskCompleted")
	public WebElement ltd_CompletedIconMostRecentTaskPosition1;

	@FindBy(id = "lwNotes_rptNotes_ctl01_imgLwTaskSuspended")
	public WebElement IconSuspended;

	
	@FindBy(id = "ltdNotes_rptNotes_ctl01_imgLifeWaiverLetter")
	public WebElement ltd_AssociatedwithLWLetterIconMostRecentTaskPosition3;
	
	
	
	// Mosers

	@FindBy(id = "ltdServiceButtons_sbtn_5_131_lnkbtnServiceControl")
	public WebElement Mosers_InitiateRetirementNoticeBtn;

	@FindBy(id = "txtRetiremetNotificationTask")
	public WebElement Mosers_RetirementDateField;

	@FindBy(xpath = "//*[@aria-describedby='divRetiremetNotificationTask']//button[text()='Save']")
	public WebElement Mosers_RetirementSaveBtn;

	@FindBy(xpath = "//*[@aria-describedby='divRetiremetNotificationTask']//button[text()='Cancel']")
	public WebElement Mosers_RetirementCancelBtn;

	@FindBy(xpath = "(//a[contains(text(),'Initiate Retirement Notice')])")
	public WebElement InitateRetirementNoticeTask;

	@FindBy(linkText = "MOSERS Termination Letter Required — Task Created")
	public WebElement MOSERSTerminationLetterTask;

	@FindBy(linkText = "Proclaim Closure — Cover Letter Task created")
	public WebElement MOSERSProclaimClosureTask;

	// Claim Notes window pop up
		
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_ddlCNType")
	public WebElement NoteTypeDropdown;
	
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_txtClaimantNotes")
	public WebElement ClaimNotesCommentsBox;

	@FindBy(id = "btnAddCommentsPop")
	public WebElement AddCommentsBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_txtAddedComments")
	public WebElement AddCommentsTextBox;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement AddCommentsSaveBtn;

	// Note Type - Call
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_selectCallType_0")
	public WebElement IncomingRadioBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_selectCallType_1")
	public WebElement OutgoingRadioBtn;

	// EFT Request

	@FindBy(id = "ltdServiceButtons_sbtn_5_7_lnkbtnServiceControl")
	public WebElement EFTRequestBtn;

	@FindBy(xpath = "//*[@aria-describedby='divCreateEftRequest']//button[text()='Yes']")
	public WebElement EFTRequest_YesBtn;
	
	
	
	
	
	

	@FindBy(xpath = "//*[@aria-describedby='divCreateEftRequest']//button[text()='Cancel']")
	public WebElement EFTRequest_CancelBtn;

//Document Tracking checkboxes
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_rptLWTaskDocTracking_ctl01_cbLWTaskDocTrackReturned")
	public WebElement DocReturnTrackingChkBox_APS;

	@FindBy(id = "ctl00$ctl00$MainContent$MainContent$ClaimantNote$rptLWTaskDocTracking$ctl02$cbLWTaskDocTrackReturned")
	public WebElement DocReturnTrackingChkBox_AUTH;

	@FindBy(id = "ctl00$ctl00$MainContent$MainContent$ClaimantNote$rptLWTaskDocTracking$ctl03$cbLWTaskDocTrackReturned")
	public WebElement DocReturnTrackingChkBox_Questionaire;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_rptLWTaskDocTracking_ctl01_lblLTTaskDocTrack")
	public WebElement DocReturnTrackingChkBox_APSLineItem;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_rptLWTaskDocTracking_ctl01_lblLTTaskDocTrack")
	public WebElement DocReturnTrackingChkBox_AUTHLineItem;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_rptLWTaskDocTracking_ctl02_lblLTTaskDocTrack")
	public WebElement DocReturnTrackingChkBox_QuestionaireLineItem;

	// Task Status drop down
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_ddlLWTaskStatus")
	public WebElement TaskStatusDropdown;

	

	// If task exist during creation, Fail All Existing Pending Tasks
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_cbFailAllExistingPendingTasks")
	public WebElement CheckboxFailAllTasks;

	@FindBy(xpath = "//*[@id='closePendingTasks']/following-sibling::div//button[text()='OK']")
	public WebElement failAppTasksOKBtn;

	

	@FindBy(id = "button-cancel-_Approval_CPID3_CCST_-letr")
	public WebElement createApprovalLetterCancelBtnLW;
	
	@FindBy(id = "button-cancel-_Approval_CPID5_CCST_-letr")
	public WebElement createApprovalLetterCancelBtnLTD;

	
	@FindBy(id = "changeStatusButtonsTopLw_selectAnnualDocType")
	public WebElement recertTypeDropdownLW;
	
	@FindBy(id = "changeStatusButtonsTopLtd_selectAnnualDocType")
	public WebElement recertTypeDropdownLTD;
	

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_btnSubmit")
	public WebElement ClaimNotesWindowSaveBtn;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement ClaimNotesWindowSaveBtn2;

	@FindBy(id = "btnClose")
	public WebElement ClaimNotesWindowCancelBtn;

	// Reminders Tab
	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_chkReminderDismissed")
	public WebElement ReminderDismissedChkBox;
	
		
	@FindBy(id = "lnktab1")
	public WebElement RemindersTab;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_newNoteRemind")
	public WebElement setaReminderCheckbox;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_chRemindCreator")
	public WebElement remindMeCheckbox;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_dateofReminderSelect")
	public WebElement reminderDateField;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_cbSelectCaseworkerRemind_15")
	public WebElement remindUserEST26001;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_cbSelectCaseworkerRemind_1")
	public WebElement SelectCaseWorker2;

	// Attachments Tab

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_AttachmentControl1_lvAttachments_ctrl0_ctl01_lnkDownload")
	public WebElement AttachmentDoc;

	@FindBy(css = "#lnktab2")
	public WebElement AttachmentsTab;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_AttachmentControl1_AjaxFileUpload1_Html5InputFile")
	public WebElement SelectFileBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_AttachmentControl1_AjaxFileUpload1_UploadOrCancelButton")
	public WebElement UploadFileBtn;

	@FindBy(id = "uploadSuccess")
	public WebElement UploadSucessMessage;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_btnResendLetter")
	public WebElement ResendLetterBtn;

	@FindBy(xpath = "//div[14]//div[3]//div[1]//button[1]")
	public WebElement ResendLetterOKBtn;

	@FindBy(id = "lnktab3")
	public WebElement AssignmentTab;

	@FindBy(xpath = "(//input[@id='ctl00_ctl00_MainContent_MainContent_ClaimantNote_btnExpireTask'])[1]")
	public WebElement ExpireTaskBtn;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_AttachmentControl1_lvAttachments_ctrl0_ctl01_lnkDownload")
	public WebElement CoverLetterDownloadlink;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_ClaimantNote_AttachmentControl1_lvAttachments_ctrl0_ctl03_lnkDownload")
	public WebElement DocumentsDownloadlink;

	@FindBy(xpath = "//a[contains(text(),'AARON PALACIOS')])[1]")
	public WebElement SelectLTDCLaimAaron;

	// Termindation and Reduction window
	@FindBy(id = "btnTermsAndReductions")
	public WebElement TermsAndReductionsBtn;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Submit'])[4]")
	public WebElement TermsReductSubmitBtn;

	// Reductions
	@FindBy(id = "checkbox_55")
	public WebElement reductionValue55;

	@FindBy(id = "checkbox_65")
	public WebElement reductionValue65;

	@FindBy(id = "checkbox_75")
	public WebElement reductionValue75;

	// Termination
	@FindBy(xpath = "//div[@id='phTermsAndReductionsCtrl_3']//div[@id='divTermAges']//input[2]")
	public WebElement terminationValue35;

	@FindBy(css = "input[value='75']")
	public WebElement terminationValue75;

	@FindBy(xpath = "//body/form[@id='caseworker']/div[145]/div[3]/div[1]/button[1]")
	public WebElement termsReductionSubmitBtn;

	/// WorkdLoad Report
	@FindBy(id = "ctl00_ctl00_TopMenu1_anchorTaskReport")
	public WebElement workloadReportTab;

	// downloading attachments, adding new notes, create log notes, entering
	// comments in notes, add tasks within a note

	// Documents tab
	@FindBy(id = "ui-id-131")
	public WebElement DocumentsTab;

	@FindBy(id = "doclnktab3-1")
	public WebElement CASTab;

	@FindBy(id = "doclnktab3-2")
	public WebElement SystemGeneratedTab;

	@FindBy(id = "doclnktab3-4")
	public WebElement ImagingNotesTab;

	@FindBy(xpath = "//li[@id='lwNotes_tbliPending']//a[@id='lnktab3-2']")
	public WebElement PendingTab;

	// CAS tab
	@FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'Incomplete Form Request')]")
	public WebElement CASIncompleteFormRequestType;

	@FindBy(linkText = "DOC_456861_2194391_...8.pdf")
	public WebElement CASIncompleteFormRequestFile;

	// Pending Tab
	@FindBy(linkText = "lwNotes_rptPendingTasks_ctl01_tdDateCell")
	public WebElement PendingTabCreatedDate;

	@FindBy(linkText = "Incomplete Form Request")
	public WebElement PendingTabIncompleteFormRequest;

	@FindBy(linkText = "lwNotes_rptPendingTasks_ctl01_tdDueDateCell")
	public WebElement PendingTabDueDate;

	//
	@FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'Initial Acknowledgement Letter')]")
	public WebElement SGInitialAcknowLetterType;

	@FindBy(linkText = "DOC_456861_3305679_...8.pdf")
	public WebElement SGInitialAcknowLetterFile;

	@FindBy(xpath = "//td[normalize-space()='PCF Document']")
	public WebElement ImagingNotesPCFDocType;

	@FindBy(linkText = "INC_APS_LLonlani.pdf")
	public WebElement ImagingNotesPCFDocFile;

	// View All Claimant Activity

	@FindBy(id = "changeStatusButtonsBtmLw_btnViewAllClaimantActivity")
	public WebElement ViewAllClaimantActivityBtn;

	@FindBy(linkText = "View")
	public WebElement VAC_ViewBtn;

	// Status buttons
	@FindBy(id = "changeStatusButtonsTopLw_inputLWPending")
	public WebElement PendingStatusBtn;

	@FindBy(id = "changeStatusButtonsTopLw_inputLWApprove")
	public WebElement ApprovedStatusBtn;

	@FindBy(id = "changeStatusButtonsTopLw_inputLWDeny")
	public WebElement DeclineStatusBtnLW;

	@FindBy(id = "changeStatusButtonsTopLtd_inputLWDeny")
	public WebElement DeclineStatusBtnLTD;

	@FindBy(id = "changeStatusButtonsTopLtd_inputLWApprove")
	public WebElement ApproveStatusBtnLTD;

	@FindBy(xpath = "//*[@aria-describedby='lwdenyok_CPID5_CCST']//button[text()='Continue']")
	public WebElement ChangetoStatusDenyContinueStatusBtn;
	
	
	@FindBy(xpath = "//*[@aria-describedby='lwapproveok_CPID5_CCST']//button[text()='Continue']")
	public WebElement ChangetoStatusApprovalContinueStatusBtn;
	
	
	@FindBy(xpath = "//*[@aria-describedby='lwApprovalAnnual_CPID5_CCST']//button[text()='Skip']")
	public WebElement createAnnualTaskSkipBtn;
	
	@FindBy(xpath = "//*[@aria-describedby='lwApprovalAnnual_CPID5_CCST']//button[text()='Create']")
	public WebElement createAnnualTaskCreateBtn;
	
	
	
	@FindBy(xpath = "//*[@aria-describedby='lwDenialPrompt_CPID5_CCST']//button[text()='Cancel']")
	public WebElement ClaimantStatusUpdatedCancelBtn2;

	@FindBy(xpath = "//*[@aria-describedby='lwdenyok_CPID5_CCST']//button[text()='Continue']")
	public WebElement ContinueStatusBtnLTD;

	@FindBy(xpath = "//*[@aria-describedby='lwdenyok_CPID5_CCST']//button[text()='Cancel']")
	public WebElement CancelStatusBtn;

	// Claimant Status Updated popup
	@FindBy(xpath = "//*[@aria-describedby='lwDenialPrompt_CPID5_CCST']//button[text()='Continue']")
	public WebElement ContinueStatusBtnToCreateLetter;

	@FindBy(xpath = "//*[@aria-describedby='lwDenialPrompt_CPID3_CCST']//button[text()='Cancel']")
	public WebElement ClaimantStatusUpdatedCancelBtn;

	@FindBy(xpath = "//*[@aria-describedby='lwDenialPrompt_CPID5_CCST']//button[text()='Cancel']")
	public WebElement CancelStatusBtnToCreateLetterLW;

	@FindBy(id = "button-den-cancel")
	public WebElement ClaimantStatusCancelDenialStatusBtn;

	@FindBy(id = "changeStatusButtonsTopLw_btnLWReassign")
	public WebElement ReassignStatusBtn;

	@FindBy(id = "changeStatusButtonsTopLw_btnUnassign")
	public WebElement UnassignStatusBtn;

	@FindBy(id = "changeStatusButtonsTopLw_btnRollOff")
	public WebElement CloseAccountBtn;

	@FindBy(id = "lnkAssign")
	public WebElement AssignBtn;

	@FindBy(id = "assignControl_ddlReassignTo")
	public WebElement AssigneeDropdown;

	@FindBy(xpath = "//button[normalize-space()='Assign']")
	public WebElement AssignAssigneeBtn;

	@FindBy(css = "div[class='subheader'] h2")
	public WebElement LWAssignee;

	//

	@FindBy(xpath = "//h3[contains(text(),'Welcome Back,')]")
	public WebElement WelcomeBackTitle;

	//

	// Messages in caseworker

	// This is a Combo
	@FindBy(xpath = "//h3[normalize-space()='This is a Combo Claim']")
	public WebElement ComboClaimTitle;

	@FindBy(xpath = "//h2[contains(text(),'Monthly Annuity Premium')]")
	public WebElement AuxMAProduct;

	// PCF Opportunity Reports (OR Reports)
	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_HyperLink2")
	public WebElement OppReport1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_HyperLink2")
	public WebElement OppReport2;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl03_HyperLink2")
	public WebElement OppReport3;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl04_HyperLink2")
	public WebElement OppReport4;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_lnkCreateOppReport")
	public WebElement QueueOppReport1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_lnkCreateOppReport")
	public WebElement QueueOppReport2;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl03_lnkCreateOppReport")
	public WebElement QueueOppReport3;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_A1")
	public WebElement EditOR1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_A1")
	public WebElement EditOR2;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl03_A1")
	public WebElement EditOR3;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl04_A1")
	public WebElement EditOR4;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_hlRecompare")
	public WebElement QueueRecompareOR1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_hlRecompare")
	public WebElement QueueRecompareOR2;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl03_hlRecompare")
	public WebElement QueueRecompareOR3;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl04_hlRecompare")
	public WebElement QueueRecompareOR4;

	@FindBy(xpath = "//h1[normalize-space()='Opportunity Report']")
	public WebElement ORTitle;

	// Opportunity Reports
	@FindBy(id = "ctl00_ctl00_BreadCrumb_BreadCrumb_Breadcrumbs1_lnkClaimantDetails")
	public WebElement BreadCrumbLinkNav;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_HyperLink2")
	public WebElement ViewOR1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_HyperLink2")
	public WebElement ViewOR2;

	@FindBy(id = "ctl00_ctl00_MainContent_MainContent_docComparison_lblAbleToPerformOwnOcc")
	public WebElement VerifyAbletoPerformOwnOccStatus;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_A1")
	public WebElement EditButtonOR1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_A1")
	public WebElement EditButtonOR2;

	@FindBy(xpath = "//button[normalize-space()='Submit And Go To Queue']")
	public WebElement SubmitGoToQueue;

	@FindBy(xpath = "//button[normalize-space()='Submit And Stay On Page']")
	public WebElement SubmitStayOnPage;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Cancel'])[24]")
	public WebElement CancelORQueue;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_lblCompareRunning")
	public WebElement ComparisonisQueued1;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl02_lblCompareRunning")
	public WebElement ComparisonisQueued2;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl03_lblCompareRunning")
	public WebElement ComparisonisQueued3;

	// SIT STAND WALK DRIVE

	@FindBy(id = "ctl00_ctl00_MainContent_Menu_StandardIncAPSDoc_chkBoxListSit_1")
	public WebElement Sit2Hr;

	@FindBy(id = "ctl00_ctl00_MainContent_Menu_StandardIncAPSDoc_chkBoxListSit_2")
	public WebElement Sit3Hr;

	// Save buton in Edit PCF
	@FindBy(id = "ctl00_ctl00_MainContent_Menu_btnSave")
	public WebElement SaveBtnEditPCF;

	@FindBy(xpath = "//a[normalize-space()='Return to Claimant Details']")
	public WebElement ReturntoClaimantDetailsBtnPCF;

	@FindBy(css = "a[class='ui-widget ui-button-icon-only ui-button ui-controlgroup-item'] span[class='ui-button-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement ShowOptionsPCFButton;

	@FindBy(id = "ltdPcfList_rptLifeWaiver_ctl01_btnCopyLWPCFDocument")
	public WebElement CopyPCFBtn;

	@FindBy(xpath = "//a[normalize-space()='Return to Claimant Details']")
	public WebElement PCFOptionsBtn;

	@FindBy(xpath = "//div[not(@style='display: none;')]//*[@id='cqsResults']")
	public List<WebElement> searchResultPopUp;

	@FindBy(xpath = "//*[@id='cqsResults']//a")
	public WebElement claimantName;

	// OR QUEUE
	@FindBy(xpath = "(//span)[602]")
	public WebElement PCFOptionsBtn1;

	@FindBy(xpath = "(//span)[604]")
	public WebElement PCFOptionsBtn2;

	@FindBy(xpath = "//th[normalize-space()='Status']")
	public WebElement ORQueueTableStatusColumn;
	
	
	

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void claimaintQuickSearch(String claimNum) throws InterruptedException {

		DashboardClaimantquickSearch.sendKeys(claimNum);
		DashboardcqsSearchBtn.click();
		Thread.sleep(3000);
		int size = searchResultPopUp.size();
		System.out.println("->" + size);
		if (size > 0) {
			claimantName.click();
		}
	}

	public void claimaintQuickSearchMulipleResults() {

		/// DashboardClaimantquickSearch.sendKeys(claimNum);
		DashboardcqsSearchBtn.click();

	}

	public void verifyWelcomeMessage() {

		WelcomeBackTitle.isDisplayed();

	}

	// Assign feature
	public void unassignUser() {

		LWTab.click();
		UnassignStatusBtn.click();
		driver.switchTo().alert().accept();

	}

	public void reassignUserWhenNoUsersAssigned(String newUser) throws InterruptedException {

		AssignBtn.click();
		AssigneeDropdown.click();
		AssigneeDropdown.sendKeys(newUser);
		Thread.sleep(5000);
		AssignAssigneeBtn.click();

	}

	public void reassignUser(String newUser) throws InterruptedException {

		ReassignStatusBtn.click();
		AssigneeDropdown.click();
		AssigneeDropdown.sendKeys(newUser);
		Thread.sleep(3000);
		AssignAssigneeBtn.click();

	}

	@SuppressWarnings("unlikely-arg-type")
	public void verifyAssineeDisplayed(String Assignee) throws InterruptedException {

		LWAssignee.equals(Assignee);

	}

///////////////////////////////////////////////////    NOTES     /////////////////////////////////////////////////////////////////////////////////////////////

	public void addNewNoteSwitchToChild() throws Exception {
		AddNewNoteBtn.click();
		switchToChildWindow();

	}

	public void verifyRadioBtnSelection() throws Exception {

		// Check whether the Check box is toggled on
		if (OutgoingRadioBtn.isSelected()) {

			System.out.println("Checkbox Outgoing is selected");

		} else {
			System.out.println("Checkbox Incoming is selected");
		}

	}

	public void addNewNoteSwitch2ChildEnterCommentsSaveSwitch2Parent(String comments) throws Exception {
		switchToChildWindow();
		enterCommentstoNotes(comments);
		noteWindowSave();
		switchToParentWindow();
	}

	public void switchToChildWindow() throws InterruptedException {

		genericUtils.waitForNewWindowToLoad();
		genericUtils.switchToNewWind2("View Claimant");

	}

	public void verifyButtonSelected(String btnName) {
		String xpath = String.format(
				"//div[./*[normalize-space()='LTD (EST 26001)']]//input[@value='%s' and not(@onclick)]", btnName);
		By loc = By.xpath(xpath);
		//Assert.assertTrue(col.contains("color: black;"));
	}

	public void selectNoteType(String NoteType) throws Exception {

		Select sel = new Select(NoteTypeDropdown);
		sel.selectByVisibleText(NoteType);

		Thread.sleep(2000);

	}

	public void selectLWTaskfromDropdown(String LWTask) throws Exception {

		Select sel = new Select(LTDLWTaskDropdown);
		sel.selectByVisibleText(LWTask);

	}
	
	public void selectLTDTaskfromDropdown(String LTDTask) throws Exception {

		Select sel = new Select(LTDLWTaskDropdown);
		sel.selectByVisibleText(LTDTask);

	}

	public void noteWindowSaveSwitch2Parent() throws InterruptedException {

		ClaimNotesWindowSaveBtn.click();
		Thread.sleep(3000);
		clickIfDisplayedNotes();
		Thread.sleep(1000);
		switchToParentWindow();

	}

	public void noteWindowSave() throws InterruptedException {

		ClaimNotesWindowSaveBtn.click();
		Thread.sleep(2000);
		clickIfDisplayedNotes();

	}

	public void clickIfDisplayedRecert() {
		By chck = By.id("cbFailAllExistingPendingTasks");
		WebElement ele2 = null;
		try {
			ele2 = driver.findElement(chck);
			Thread.sleep(2000);
			if (recertFailAppTasksCheckBoxBtn.isDisplayed())
				recertFailAppTasksCheckBoxBtn.click();
			recertOKBtn.click();
		} catch (Exception e) {
		}
	}

	public void enterCommentstoNotes(String claimNotesComments) throws Exception {
		ClaimNotesCommentsBox.sendKeys(claimNotesComments);

	}

	public void deleteMedRecTaskFromNotesList() throws InterruptedException {
		MedRecTask.click();
		switchToChildWindow();
		deleteNote();
		switchToParentWindow();
		System.out.println("MedRecTask deleted");
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////

	public void verifyClaimOpened() {
		FullDetailsBtn.isDisplayed();

	}

	public void assignClaimantDropdown(String Assignee) throws Exception {

		AssigneeDropdown.click();

		Select sel = new Select(AssigneeDropdown);

		sel.selectByVisibleText(Assignee);

	}

	public void selectLWTaskOptionfromDropdown(String LWTaskOption) throws Exception {

		Select sel = new Select(LWTaskOptionDropdown);
		sel.selectByVisibleText(LWTaskOption);

	}
	
	public void selectLWTaskOptionfromDropdownValue(String LWTaskOptionValue) throws Exception {

		Select sel = new Select(LWTaskOptionDropdown);
		sel.selectByValue(LWTaskOptionValue);

	}
	
	public void selectLWTaskSubOptionfromDropdown(String LWTaskSubOption) throws Exception {

		Select sel = new Select(LWTaskSubOptionDropdown);
		sel.selectByVisibleText(LWTaskSubOption);

	}

	public void selectTaskStatusfromDropdown(String TaskStatus) throws Exception {

		Select sel = new Select(TaskStatusDropdown);

		sel.selectByVisibleText(TaskStatus);

	}

	public void generateIncompFormRequest() throws Exception {

		IncompleteFormRequestBtn.click();
		AuthorizationDoc.click();
		ClaimaintStatementDoc.click();

	}

	public void clickOnMostRecentTask() {

	}

	public void verifyRecert1stReqestTaskName() {

		Recertification1stRequestTask.getText();
		String expected1stRecertTaskNameText = "Recertification Request — Task Created upon Casewo...";
		Assert.assertEquals(expected1stRecertTaskNameText, expected1stRecertTaskNameText);

	}

	public void verifyRecert2ndReqestTaskName() {

		Recertification2ndRequestTask.getText();
		String expected2ndRecertTaskNameText = "Recertification 2nd Request — Task created due to ";
		Assert.assertEquals(expected2ndRecertTaskNameText, expected2ndRecertTaskNameText);

	}

	public void verifyMedicalQuestionnaireTask() {

		MedQuestionnaireTask.getText();
		String expectedMedQuestionnaireTaskNameText = "Claimant Questionnaire Trigger — Task Created upon...";
		Assert.assertEquals(expectedMedQuestionnaireTaskNameText, expectedMedQuestionnaireTaskNameText);

	}

	public void verifycommentsPATask() {

		PATask.getText();
		String expectedPATaskNameText = "Pending Adjudication - Notes added to PA task crea...";
		Assert.assertEquals(expectedPATaskNameText, expectedPATaskNameText);

	}

	public void verifycommentsMedRecTask() {

		MedRecTask.getText();
		String expectedMedRecTaskNameText = "Medical Received - Medical Record - Notes MR";
		Assert.assertEquals(expectedMedRecTaskNameText, expectedMedRecTaskNameText);

	}

	public void docTrackingRecertRequest_APS() {

		Recertification2ndRequestTask.getText();
		String expected2ndRecertTaskNdameText = "Recertification 2nd Request — Task created due to ";

	}

	public void verifyHasAttachmentIconRecentTask() {
		LTD_AttachmentIconMostRecentTaskPosition2.isDisplayed();
	}

	public void verifyMostRecentTaskName(String ActualComments, String ExpectedComments) {

		ClaimNotesCommentsBox.getText();
		Assert.assertEquals(ActualComments, ExpectedComments);

	}

	public void verifyHasRegularNoteIconRecent() {
		LTD_RegularNoteIconMostRecentTask.isDisplayed();
	}

	public void verifyHasPendingNoteIconRecent_LW() {
		LWPendingIconMostRecentTask.isDisplayed();

	}
	
	public void verifyHasPendingNoteIconRecent_LTD() {
		LTD_PendingIconMostRecentTask.isDisplayed();

	}

	public void verifyHasAll4IconsMostRecentTask() {
		LTD_PendingIconMostRecentTask.isDisplayed();
		LTD_AttachmentIconMostRecentTaskPosition2.isDisplayed();
		LTD_ServiceAdminIconMostRecentTask.isDisplayed();
		LTD_ExpirationIconMostRecentTask.isDisplayed();
	}

	public void verifyHasCallNoteIconMostRecent() {
		LTD_CallIconMostRecentTask.isDisplayed();
	}

	public void verifyHasCompletedIconMostRecent() {
		LW_CompletedMostRecentTaskIcon.isDisplayed();
	}

	public void verifyTaskDrpTaskOptDrpDisabled() {
		WebElement e1 = LTDLWTaskDropdown;
		System.out.println("e1 is Enabled?" + e1.isEnabled());

	}

	public void addCommentstoExistingNotes(String cAddNotesComments) throws Exception {

		// elementControl.setText(AddCommentsTextBox, cAddNotesComments);

	}

	public void notesTCResetData() throws Exception {

	}

	public void verifyTaskStatusisPending() throws Exception {

		TaskStatusDropdown.getText();
		String TaskStatusPending = "Pending";

	}

	public void verifyPATaskStatusisCompleted() throws Exception {			
		
		PATask.click();
		switchToChildWindow();
		Select sel = new Select(TaskStatusDropdown);
		String TaskStatusActual = sel.getFirstSelectedOption().getText();
		System.out.println(TaskStatusActual);
		Assert.assertEquals(TaskStatusActual,"Completed");
		closeCurrentWindow();	
		 switchToParentWindow();

	}
	
	public void verifyPendingWaiverLetterStatusisCompleted() throws Exception {		
		
		
		pendingWaiverLetterTask.click();
		switchToChildWindow();
		Select sel = new Select(TaskStatusDropdown);
		String TaskStatusActual = sel.getFirstSelectedOption().getText();
		System.out.println(TaskStatusActual);
		Assert.assertEquals(TaskStatusActual,"Completed");
		closeCurrentWindow();	
		 switchToParentWindow();

	}
	
public void verifyClaimantQuestionnaireTaskStatusisCompleted() throws Exception {		
		
		claimantQuestionnaireTask.click();
		switchToChildWindow();
		Select sel = new Select(TaskStatusDropdown);
		String TaskStatusActual = sel.getFirstSelectedOption().getText();
		System.out.println(TaskStatusActual);
		Assert.assertEquals(TaskStatusActual,"Completed");
		closeCurrentWindow();	
		switchToParentWindow();

	}
public void verifyRecertApprovalLetterTaskStatusisCompleted() throws Exception {		
	
	recertApprovalLetterTask.click();
	switchToChildWindow();
	Select sel = new Select(TaskStatusDropdown);
	String TaskStatusActual = sel.getFirstSelectedOption().getText();
	System.out.println(TaskStatusActual);
	Assert.assertEquals(TaskStatusActual,"Completed");
	closeCurrentWindow();	
	switchToParentWindow();

}

public void verifyIATTaskStatusisPending() throws Exception {		
	
	IAT_Task.click();
	switchToChildWindow();
	Select sel = new Select(TaskStatusDropdown);
	String TaskStatusActual = sel.getFirstSelectedOption().getText();
	System.out.println(TaskStatusActual);
	Assert.assertEquals(TaskStatusActual,"Pending");
	closeCurrentWindow();	
	switchToParentWindow();

}
	public void verifyTaskStatusFailed() throws Exception {

		TaskStatusDropdown.getText();
		String TaskStatusFailed = "Failed";

	}

	public void verifyTaskStatusSuspended() throws Exception {

		TaskStatusDropdown.getText();
		String TaskStatusSuspended = "Suspended";

	}

	public void verifyCommentsEnteredinNote(String ActualComments, String ExpectedComments) {

		ClaimNotesCommentsBox.getText();
		Assert.assertEquals(ActualComments, ExpectedComments);

	}

	public void refreshPage() {

	}

	public void deleteNote() {
		ClaimantNotesDeleteButton.click();

		Alert al = driver.switchTo().alert();
		// click on OK to accept with accept()
		al.accept();

	}

	public void switchToParentWindow() {

//		genericUtils.closeWindow();
		genericUtils.switchToNewWind("View Claimant");
	}

	public void closeCurrentWindow() {
		genericUtils.closeCurrentWindow();
	}

	public void verifyAssignee(String ActualAssignee, String ExpectedAssignee) {
		// CurrentAssignee.getText();
		Assert.assertEquals(ActualAssignee, ExpectedAssignee);

	}

	public void uploadFile(String file) throws InterruptedException {
		
		String userdir=System.getProperty("user.dir");
		String filePath=String.format("%s\\src\\test\\resources\\TestData\\%s",userdir, file);

		SelectFileBtn.sendKeys(filePath);	
		Thread.sleep(3000);
		UploadFileBtn.click();
		Thread.sleep(10000);
	}

	public void uploadFile2(String FilePath) {

		// SelectFileBtn.click();
		SelectFileBtn.sendKeys(FilePath);
	}

	public void verifyFileName1(String ExpectedFileName1, String ActualFileName1) {

		FileName1.getText();
		Assert.assertEquals(ExpectedFileName1, ActualFileName1);
	}

	public void verifyAbletoPerformOwnOccStatus(String ExpectedOwnOcc, String ActualOwnOcc) {

		VerifyAbletoPerformOwnOccStatus.getText();
		Assert.assertEquals(ExpectedOwnOcc, ActualOwnOcc);
	}

	public void verifyIAT_Task() {

		String actual = IAT_Task.getText();
	
		Assert.assertEquals(actual, "Initiate Annual Task — Annual Task");
	}

	public void verifyMBPSimpleTrigger_Task() {

		MBPSimpleTask.getText();
		String expectedMBPSimpleTriggerTaskNameText = "MBP Simple Trigger —";
		Assert.assertEquals(expectedMBPSimpleTriggerTaskNameText, expectedMBPSimpleTriggerTaskNameText);
	}

	public void verifyMBPDetailedTrigger_Task() {

		MBPDetailedTask.getText();
		String expectedMBPDetailedTriggerTaskNameText = "MBP Simple Trigger —";
		Assert.assertEquals(expectedMBPDetailedTriggerTaskNameText, expectedMBPDetailedTriggerTaskNameText);
	}

	

	public void searchClaimaintQuickSearch(String claimantID) throws Exception {
		// elementControl.setText(DashboardClaimantquickSearch, claimantID);
		// elementControl.clickElement(ViewClaimantquickSearch);

	}

	

	public void verifyNoteTypeandTaskareDisabled() throws Exception {

//add code to verify going into an existing note those fields are disabled

	}

	@SuppressWarnings("unused")
	public void clickIfDisplayedNotes() {
		By chck = By.id("ctl00_ctl00_MainContent_MainContent_ClaimantNote_cbFailAllExistingPendingTasks");
		WebElement ele = null;
		try {
			ele = driver.findElement(chck);
			Thread.sleep(2000);
			if (CheckboxFailAllTasks.isDisplayed())
				CheckboxFailAllTasks.click();
			failAppTasksOKBtn.click();
		} catch (Exception e) {

		}

	}

	public void recertFirstRequest() {

		recertFirstRequestBtn.click();
		clickIfDisplayedRecert();
	}

	public void clickonLWTab() {
		LWTab.click();
	}

	public void clickonLTDTab() {
		LTDTab.click();
	}

	public void clickonAuxTab() {
		AUXTab.click();
	}

	public void downloadCoverLetterandDocs() throws InterruptedException {
		AttachmentsTab.click();
		CoverLetterDownloadlink.click();
		Thread.sleep(2000);
		DocumentsDownloadlink.click();
		Thread.sleep(2000);
		System.out.println("Need to manually verify content of documents");
	}
////Claims Test Cases

	public void createLTDGateWayReview() throws InterruptedException {

		LtdGatewayBtn.click();
		LtdGateway_PCFeed.click();
		LtdGateway_Stat.click();
		// LtdGateway_TypeA.click();
		LtdGateway_DIS_DEG.click();
		LtdGateway_AODEC.click();
		LtdGateway_RTD_MRD.click();
		LtdGateway_LSB_P.click();
		LtdGateway_VerifiedPaidPayable.click();
		LtdGateway_OffsetsReviewed.click();
		LtdGateway_AnyoccMilestone.click();
		LtdGateway_MBPRotationParent.click();
		LtdGateway_MBPRotation_NoClaims.click();
		LtdGateway_MOSERSMBPTerm.click();
		LtdGateway_GeneralUserId.click();
		Thread.sleep(2000);
		LtdGatewayAcceptBtn.click();
		Thread.sleep(5000);

	}

	public void LtdGatewaySaveButtonPopup() throws InterruptedException {
		Thread.sleep(5000);
		RetirementbenefitsPaymentAmount.click();
		Thread.sleep(2000);
		LtdGatewaySaveButtonPopup.click();

	}

	public void verifyMBPSimpleDetailedTasks() throws InterruptedException {
		Thread.sleep(2000);
		MBPDetailedTask.isDisplayed();
		MBPSimpleTask.isDisplayed();
		LTD_ExpiredIconMostRecentTask0.isDisplayed();
		LTD_ExpiredIconMostRecentTask1.isDisplayed();
		Thread.sleep(2000);

	}

	public void declineStatusBtn() {

	}

	public void clickintoLWTab() {
		LWTab.click();
	}

	public void clickintoLTDTab() {
		LTDTab.click();
	}

	public void clickintoAUXTab() {
		AUXTab.click();
	}

	public void selectRecertTypeLW(String recertType) {
		Select sel = new Select(recertTypeDropdownLW);
		sel.selectByVisibleText(recertType);

	}
	
	public void selectRecertTypeLTD(String recertType) {
		Select sel = new Select(recertTypeDropdownLTD);
		sel.selectByVisibleText(recertType);

	}

	public void clickonInitiateAnnualTaskBtnLTD() {
		createAnnualTaskBtnLTD.click();

	}

	public void clickonInitiateAnnualTaskBtnLW() {
		createAnnualTaskBtnLW.click();

	}

	public void createApprovalLetterCancelBtnLW() {
		createApprovalLetterCancelBtnLW.click();
	}
	
	public void createApprovalLetterCancelBtnLTD() {
		createApprovalLetterCancelBtnLTD.click();
	}

	public void selectRadioButtonReduction75() {
		boolean selectStateReductionValue75 = reductionValue75.isSelected();

		if (selectStateReductionValue75 == false) {
			reductionValue75.click();
		}

	}

	public void selectRadioButtonTerms75() {
		boolean selectStateTermsCheckBox75 = terminationValue75.isSelected();

		if (selectStateTermsCheckBox75 == false) {
			terminationValue35.click();
		}
	}

	public void selectSetAReminderChkBox() {
		boolean selectStateSetaReminderChkBox = setaReminderCheckbox.isSelected();

		if (selectStateSetaReminderChkBox == false) {
			setaReminderCheckbox.click();

		}

	}

	public void selectRemindMeChkBox() {
		boolean selectStateRemindMeChkBox = remindMeCheckbox.isSelected();
		if (selectStateRemindMeChkBox == false) {
			remindMeCheckbox.click();
		}
	}

	public void selectUserEST26001() {

		boolean selectStateUserEST26001ChkBox = remindUserEST26001.isSelected();

		if (selectStateUserEST26001ChkBox == false) {
			remindUserEST26001.click();
		}
	}

	public void termsReductionSubmitButton() {
		termsReductionSubmitBtn.click();
		driver.switchTo().alert().accept();
	}

	public void verifyallTermsReductionTasks() {

		inputTerminationInSystemTask.isDisplayed();
		benefitTerminationReminderTask.isDisplayed();
		inputReductioninSystemTask.isDisplayed();
		benefitReductionReminderTask.isDisplayed();
	}
	
	public void requestClaimantQuestionnaire() throws InterruptedException {
		
		MedRequest_Btn.click();
		MedQuestExpirationDate.sendKeys(Keys.RETURN);
		MedRequest_WOP_APSDoc.click();
		MedRequest_AuthorizationDoc.click();
		Thread.sleep(2000);
		MedRequest_CreateBtn.click();
		Thread.sleep(5000);
		
		
		
	}
	
	public void notesPendingTab1stChkBox () {
		Boolean NotesPendingTab1stChkBoxState = notesPendingTab1stChkBox.isSelected();
		
		if(NotesPendingTab1stChkBoxState == false) {
			notesPendingTab1stChkBox.click();
			
		}
	}
	
	public void notesPendingTab2ndChkBox () {
		Boolean NotesPendingTab2ndChkBoxState = notesPendingTab2ndChkBox.isSelected();
		
		if(NotesPendingTab2ndChkBoxState == false) {
			notesPendingTab2ndChkBox.click();
			
		}
	}
	
	////Letters module
	
	public void expirePATaskLTD () throws InterruptedException {
		PATask.click();
		switchToChildWindow();
		ExpireTaskBtn.click();
		driver.switchTo().alert().accept();
		
	}
	
}
