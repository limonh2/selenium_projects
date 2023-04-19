@Tasks
Feature: Tasks

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Tasks_01_Ability to perform Pending Adjudication Manually by the user_LW
    Given User is in claim "257755"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "Pending Adjudication", Comments "Task comments"
    Then Save the Claimant Note, switches to parentWindow
    And Verify LW: PA Task was created properly

  Scenario: Tasks_02_W4S Received Manually by the user_LTD
    Given User is in claim "248909"
    Then LTD: Add new Note, NoteType "LTD Task", Task "W4S Received", Comments "Task comments"
    Then Save the Claimant Note, switches to parentWindow
    And Verify W4S Received Task was created properly

  #Scenario: Tasks_03_State Tax Withholding Received Manually by the user_LTD
  #Tried few claims throws erorr creating note, therefore skipping for now until application issue is fixed
  #Given User is in claim "248813"
  #Then LTD: Add new Note, NoteType "LTD Task", Task "State Withholding Received", Comments "Task comments"
  # And Verify State Withholding Received Task was created properly
  
  Scenario: Tasks_04_FastTrack Proper_Term Reduction Task_LW
    Given User is in claim "257755"
    Then Create Terminations and Reductions Tasks
    And Verify Terminations and Reductions were created properly

  Scenario: Tasks_05_FastTrack Proper Initiate Setup for "Request Medical Questionnaire" task_LW
    Given User is in claim "257789"
    Then Request Claimant Questionnarie
    And Verify Request Claimant Questionnarie Task was created properly

  Scenario: Tasks_06_Add a Reminder on a Note_LW
    Given User is in claim "257755"
    Then Add new NoteType: Note and with comments "Task for Note"
    Then Add Reminders in tab
    Then Save the Claimant Note, switches to parentWindow
    And Verify Reminders task was created properly

  Scenario: Tasks_07_Ability to dismiss a pending reminder_LW
    Given User is in claim "257755"
    Then Click into the Reminder Note and Dismiss it
    Then Save the Claimant Note, switches to parentWindow
    And Verify Reminder was Dismissed

  Scenario: Tasks_08_Ability to add an Approver Review task to a claim_LW
    Given User is in claim "257755"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "Approver Review Completed", Comments "ARC Comments"
    Then Save the Claimant Note, switches to parentWindow
    And Verify Approver Review Completed Task was created properly


  Scenario: Tasks_09_FastTrack Upload File Proper DMR referral_LW
    Given User is in claim "257755"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "DMR Review - Vocational", Comments "DMR Comments"
    Then Upload a file from "TestCaseTasks_09.xls"
    Then Save the Claimant Note, switches to parentWindow
    And Verify DMR Review Vocational Task was created properly
    And Verify file was uploaded to DMR Review Vocational Task

  Scenario: Tasks_10_FastTrack Upload File Proper DMR Review Completed- Clinica_LW
    Given User is in claim "257755"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "DMR Review Completed - Clinical", Comments "DMR Comments"
    Then Upload a file from "TestCaseTasks_10.xls"
    Then Save the Claimant Note, switches to parentWindow
    And Verify DMR Review Completed Clinical Task was created properly
    And Verify file was uploaded to DMR Review Completed Clinical Task

  Scenario: Tasks_11_FastTrack Proper_ Misc document- POA/Guardian_LW
    Given User is in claim "257755"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "Miscellaneous Document", Comments "DMR Comments"
    Then select LW - Task Options "10_204" and Task Sub Options "New" using selectbyValue
    Then Save the Claimant Note, switches to parentWindow
    And Verify Miscellaneous Document Task was created properly

 
  Scenario: Tasks_12_Create Initiate Annual Task_LTD
    Given User is in claim "257784"
    Then LTD: Create Annual Task with Recert Type "PCF"
    And Verify Annual Task was created properly


  Scenario: Tasks_13_ FastTrack Proper_Quick Complete IAT and PA pending task_LTD
    Given User is in claim "257784"
  	Then LTD: Add new Note, NoteType "LTD Task", Task "Pending Adjudication", Comments "Task comments"
  	Then Save the Claimant Note, switches to parentWindow
   	Then QuickComplete Pending Annual Task and PA Task in Pending Tab
    Then Verify Annual Task and PA Tasks is now completed
