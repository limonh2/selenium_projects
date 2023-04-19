@SearchClaimantPage
Feature: Search Claimant Page

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Search_01_Search Claimant- LTD only
    Given filters SearchTypeDropdownMenu "LTD", FirstNameSearchField "A"
    Then filters should display data results accordingly

  Scenario: Search_02_Search Claimant- Waiver Only
    Given filters SearchTypeDropdownMenu "Life Waiver", FirstNameSearchField "B"
    Then filters should display data results accordingly

  Scenario: Search_03_Search Claimant- Combo
    Given filters SearchTypeDropdownMenu "Life Waiver", FirstNameSearchField "D", SelectCollaborativeClaimDropdown "Yes"
    Then filters should display data results accordingly

  Scenario: Search_04_Search SSN in Search Claimant Page
    Given filters SearchTypeDropdownMenu "LTD", SSNFieldSearchClaimaint "1234"
    Then filters should display data results accordingly

  Scenario: Search_05_Search SSN in Dashboard page
    Given filter SSNFieldSearchClaimaint "1234"
    Then Verify claim is opened properly
