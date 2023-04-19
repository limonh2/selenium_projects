@Claims
Feature: Claims

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Claims_01_LTD Gateway
    Given User is in claim "258149"
    Then Create LTD Gateway Review
    Then Fill out fields in MBP Preparation window and Save
    And Verify MBP Simple and MBP Deailed tasks were created

  Scenario: Claims_02_Pending Tied Claim- Create Annual Task
    Given User is in claim "257773"
    Then Click into LW tab
    Then LW: Create Annual Task with Recert Type "PCF"
    And Verify Annual Task was created properly

  #Need to update Decline a LTD claim which checkes for color
  @WIPClaim
  Scenario: Claims_03_LTD Deny Claim_LWoP
    Given User is in claim "258089"
    Then Click into LTD tab
    Then Decline a LTD claim
    #And Verify the button selected
    #    | Deny |
    And Perform clean up, Approve claim for next run

  Scenario: Claims_04_MOSERS Retirement - a report is sent to the users from another system notifying Mosers claims to be retired
    Given User is in claim "258890"
    Then Click into LTD tab
    Then Create a Mosers Initiate Retirement Notice
    Then Verify Mosers Initiate Retirement Notice task were created

  Scenario: Claims_06_EFT Request
    Given User is in claim "258890"
    Then Click into LTD tab
    Then Create an EFT Request
    Then Verify EFT Request task were created

  Scenario: Claims_07_LT Combo (Verify AUX Claim Product)
    Given User is in claim "25992"
    Then Click into AUX tab
    Then Verify all Aux product Monthly Annuity Premium is displayed
