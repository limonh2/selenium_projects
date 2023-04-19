Feature: Log into App

 @LoginPage
  Scenario: Log into application
    Given I am in the login page
    And Enter username and password
    Then Welcome page should display