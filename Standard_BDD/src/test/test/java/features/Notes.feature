@Notes
Feature: Notes

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Notes TC_01_Ability to open and view attachments on a note
    Given User is in claim "258147"
    Then Create Recertification First Request task
    Then Verify Recertification First Request task
    Then Download Cover Letter and Documents from a Task

  Scenario: Notes TC_02_Ability to add new regular note and enter comments
    Given User is in claim "258147"
    Then Add a regular Note with comments "Regular note comments"
    Then Save the Claimant Note, switches to parentWindow
    Then Verify regular Note was created

  Scenario: Notes TC_03_Ability to log a Call in Notes
    Given User is in claim "258147"
    Then Add a Call note, select NoteType "Call" with comments "Call note comments"
    Then Save the Claimant Note, switches to parentWindow
    Then Verify Call note was created

  Scenario: Notes TC_04_Ability to add a comment to an existing Note
    Given User is in claim "258114"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "Pending Adjudication", Comments "Task comments"
    Then Save the Claimant Note, switches to parentWindow
    Then Verify LW: PA Task was created properly

  Scenario: Notes TC_05_Ability to add a task (PA) to a claim, via creating a note
    Given User is in claim "258140"
    Then LW: Add new Note, NoteType "Life Waiver Task", Task "Pending Adjudication", Comments "Task comments"
    Then Save the Claimant Note, switches to parentWindow
    Then Verify LW: PA Task was created properly
    
  Scenario: Notes TC_06_Ability to add a task with specialized fields to a claim, via creating a note
    Given User is in claim "258140"
    Then Add new Note, NoteType "Life Waiver Task", Task "Medical Received", Task Option "Medical Record" Comments "Task comments"
    Then Save the Claimant Note, switches to parentWindow
    Then Verify Medical Received task was created properly
    Then Clean up and delete Medical Received Task from list