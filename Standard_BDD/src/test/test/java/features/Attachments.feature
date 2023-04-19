@Attachments
Feature: Attachments

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Attachments_01_Attaching PDF Document to Claim
    Given User is in claim "248820"
    Then LTD: Add new Note, NoteType "LTD Task", Task "Pending Adjudication", Comments "PDF comments"
    Then Upload a file from "AttachmentsTC01.PDF"
    Then Save the Claimant Note, switches to parentWindow
    And Verify PA Task has attachment icon
    And Verify LTD: PA Task was created properly
    Then switch to childWindow   
    And Verify Task has Attachments by clicking into the Note
    
    
    Scenario: Attachments_02_ Attaching an Outlook Email to Claim
    Given User is in claim "248820"
    Then LTD: Add new Note, NoteType "LTD Task", Task "Pending Adjudication", Comments "Email comments"
    Then Upload a file from "AttachmentsTC02.msg"
    Then Save the Claimant Note, switches to parentWindow
    And Verify PA Task has attachment icon
    And Verify LTD: PA Task was created properly
    Then switch to childWindow   
    And Verify Task has Attachments by clicking into the Note
    
    
   