@Assign
Feature: Assign

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Assign_01_LWOP_UnAssign analyst
    Given User is in claim "246526"
    And Verify new user "Life Waiver (EST 66000)" was assigned properly
    Then Unassign user and go back into claim "246526" and Reassign claim to user "EST 26001"
    And Verify new user "Life Waiver (EST 26001)" was assigned properly
    #Clean up test cases below
    Then Unassign user and go back into claim "246526" and Reassign claim to user "EST 66000"
    And Verify new user "Life Waiver (EST 66000)" was assigned properly

  Scenario: Assign_02_LWOP_Reassign claim to new analyst
    Given User is in claim "246526"
    And Verify new user "Life Waiver (EST 66000)" was assigned properly
    Then Reassign claim user to "EST 26002"
    And Verify new user "Life Waiver (EST 26002)" was assigned properly
    #Clean up test cases below
    Then Reassign claim user to "EST 66000"
    And Verify new user "Life Waiver (EST 66000)" was assigned properly

  Scenario: Assign_03_LWOP_Automated Claim assignment
    Given User is in the WorkLoad Report Page
    Then Click on Pending Assign Tasks report in WLR Page
    And Verify results displayed for selected WLR Report
