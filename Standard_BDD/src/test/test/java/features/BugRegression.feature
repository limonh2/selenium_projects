@BugRegression
Feature: BugRegression

  Background: User is Logged In
    Given I am logged in the app

 
  Scenario: FAS_9754_Document Return Tracking items disappearing after saving
    Given User is in claim "208020"   
    #Given User is in claim "207930" 
    #208020
    
    Then Click into LTD tab    
    Then Create Recertification First Request task
    
    Then In a Recert First Request task, Check off at least one tracking item and save
    Then Verify all three tracking items are still displaying
    


  
 
