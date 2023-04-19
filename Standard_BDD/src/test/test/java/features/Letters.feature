@Letters
Feature: Letters

  Background: User is Logged In
    Given I am logged in the app

  Scenario: Letters_01_Verify Life Waiver Manual Letters list in dropdown for Pending, Approval, Denial, Admin and Closure Letter
    Given User is in claim "258113"
    Then Verify all letters in Create Pending Letter dropdown for LW
    Then Verify all letters in Create Approval Letter dropdown for LW
    Then Verify all letters in Create Denial Letter dropdown for LW
    Then Verify all letters in Create Admin Letter dropdown for LW
    Then Verify all letters in Create Closure Letter dropdown for LW

  Scenario: Letters_02_Verify LTD Manual Letters list in dropdown for Pending, Approval, Denial, Admin and Closure Letter
    Given User is in claim "208050"
    Then Verify all letters in Create Pending Letter dropdown for LTD
    Then Verify all letters in Create Approval Letter dropdown for LT
    Then Verify all letters in Create Denial Letter dropdown for LTD
    Then Verify all letters in Create Admin Letter dropdown for LTD
    Then Verify all letters in Create Closure Letter dropdown for LTD

  #Pending Letters
  Scenario: Letters_03_Create Manual Pending Letter CTA Rollover_LW
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "CTA Rollover"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "CTA Rollover" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Manual Letter Task CTA Rollover was created properly

  Scenario: Letters_04_Ability to view PDF of letter prior to confirming_LW
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "CTA Rollover"
    Then Click on Skip button for Manual Letter
    Then Verify you can Preview Document

  Scenario: Letters_05_Create Pending Manual Letter: Blank Pending_LTD
    Given User is in claim "208050"
    Then Create LTD: Manual Pending Letter, select "Blank Pending"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Pending Waiver Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    And Verify Pending Waiver Letter Task are in Completed Status and verify Icons

  Scenario: Letters_06_Create Pending Letter: Incomplete Form Request
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "Incomplete Form Request"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Incomplete Form Request" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Incomplete Form Request was created properly

  Scenario: Letters_07_Create Pending Letter: Over 60 Contact Letter
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "Over 60 Contact Letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Miscellaneous Document" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Miscellaneous Document was created properly

  Scenario: Letters_08_Create Pending Letter: Extension with tolling
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "Extension with tolling"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Pending Waiver Letter 30th Day" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Pending Waiver Letter 30th Day was created properly

  Scenario: Letters_09_Create Pending Letter: Extension without tolling
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "Extension without tolling"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Pending Waiver Letter 45th Day" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Pending Waiver Letter 45th Day was created properly

  Scenario: Letters_10_Create Pending Letter: Reduction letter - age
    Given User is in claim "258113"
    Then Create LW: Manual Pending Letter, select "Reduction letter - age"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Pending Waiver Letter 60th Day" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Pending Waiver Letter 60th Day was created properly

  #Approval Letters
  Scenario: Letters_11_Ability to include and select specific paragraphs and conditional info in letters Approval Employee Approval letter_LW
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "Employee Approval"
    Then Prep Page Approval Manual Letter: Employee Approval Letter
    Then Click on Save and Continue Button in Prep Page
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Recert Approval Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Employee Approval Letter was created properly

  Scenario: Letters_12_Pending Adjudication Recertification Approval Letter_LTD
    Given User is in claim "208050"
    Then LTD: Add new Note, NoteType "LTD Task", Task "Pending Adjudication", Comments "Letter PA comments"
    Then Save the Claimant Note, switches to parentWindow
    Then LTD: Add new Note, NoteType "LTD Task", Task "Claimant Questionnaire", Comments "Letter CQ comments"
    Then Save the Claimant Note, switches to parentWindow
    Then Click on Recert Approval Letter Button
    And Verify existing Tasks are completed and IAT is created in Pending Status

  Scenario: Letters_13_Create Approval Letter: Approve and Close Employee
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "Approve and Close Employee"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Approval Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Approval Letter was created properly

  Scenario: Letters_14_Create Approval Letter: Blank Approval
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "Blank Approval"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Approver Review" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Approval Review was created properly

  Scenario: Letters_15_Create Approval Letter: Generic ER Approval Letter
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "Generic ER Approval Letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Approval Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Approval Letter was created properly

  Scenario: Letters_16_Create Approval Letter: Generic ER Approval Letter - Oregon
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "Generic ER Approval Letter - Oregon"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Approval Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Approval Letter was created properly

  Scenario: Letters_17_Create Approval Letter: MOSERS Employer Approval Letter
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "MOSERS Employer Approval Letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "MOSERS 201" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: MOSERS 201 was created properly

  Scenario: Letters_18_Create Approval Letter: POL Reopen
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "POL Reopen"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "POL Notification" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: POL Notification was created properly

  Scenario: Letters_19_Create Approval Letter: Recert Approval Letter
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "Recert Approval Letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Recert Approval Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Recert Approval Letter was created properly

  Scenario: Letters_20_Create Approval Letter: State of IOWA Employer Approval Letter
    Given User is in claim "258113"
    Then Create LW: Manual Approval Letter, select "State of IOWA Employer Letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Approval Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Approval Letter was created properly

  #Denial Letters
  Scenario: Letters_21_Ability to include and select specific paragraphs and conditional info in letters- Denial did not serve waiting period_LW
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Denial - did not serve waiting period"
    Then Denial did not serve waiting period Letter Prep Page
    Then Click on Save and Continue Button in Prep Page
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial did not serve waiting period was created properly

  Scenario: Letters_22_Create Denial Letter: Blank Denial
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Blank Denial"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_23_Create Denial Letter: Denial/Closure at Request of Claimant
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Denial/Closure at Request of Claimant"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_24_Create Denial Letter: ER Denial Not Totally Disabled
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "ER Denial Not Totally Disabled"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_25_Create Denial Letter: FTPP Closure Warning Letter - Combo
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "FTPP Closure Warning Letter - Combo"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_26_Create Denial Letter: FTPP Closure Warning Letter - Waiver Only
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "FTPP Closure Warning Letter - Waiver Only"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_27_Create Denial Letter: FTPP Denial_Closure Letter
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "FTPP Denial_Closure letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_28_Create Denial Letter: Denial – did not serve waiting period
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Denial - did not serve waiting period"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Closure Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Closure Letter was created properly

  Scenario: Letters_29_Create Denial Letter: Denial – over age
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Denial - over age"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_30_Create Denial Letter button: Denial/Closure - Claimant
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Denial/Closure - Claimant"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Denial Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Denial Letter was created properly

  Scenario: Letters_31_Create Denial Letter button: Denial – not a member
    Given User is in claim "258113"
    Then Create LW: Manual Denial Letter, select "Denial - not a member"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Miscellaneous Document" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Miscellaneous Document was created properly

  #Adminstration Letters
  Scenario: Letters_32_Create Administration Letter: All Information
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "All Information"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "ARU Deferral" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: ARU Deferral was created properly

  Scenario: Letters_33_Create Administration Letter: Blank Administration
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "Blank Administration"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "ARU Extension" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: ARU Extension was created properly

  Scenario: Letters_34_Create Administration Letter: Correction letter
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "Correction letter"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "ARU Initial Status" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: ARU Initial Status was created properly

  Scenario: Letters_35_Create Administration Letter: Reduction Due to Age
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "Reduction Due to Age"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "ARU Overturn" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: ARU Overturn was created properly

  Scenario: Letters_36_Create Administration Letter: Return Original Documents
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "Return Original Documents"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "ARU Pending Update" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: ARU Pending Update was created properly

  Scenario: Letters_37_Create Administration Letter: SIC Not Responsible for Invoice
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "SIC Not Responsible for Invoice"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "ARU Uphold" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: ARU Uphold was created properly

  Scenario: Letters_38_Create Administration Letter: Termination
    Given User is in claim "258113"
    Then Create LW: Manual Adminstration Letter, select "Termination"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "CAS Request" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: CAS Request was created properly

  #Closure Letters
  Scenario: Letters_39_Create Closure Letter: Blank Closure_LW
    Given User is in claim "258113"
    Then Create LW: Manual Closure Letter, select "Blank Closure"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Closure Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Closure Letter was created properly

  Scenario: Letters_40_Create Closure Letter:  FTPP – LTD Closures/Waiver Closes_LW
    Given User is in claim "258113"
    Then Create LW: Manual Closure Letter, select "FTPP – LTD Closures/Waiver Closes"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Incomplete Form Request" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Incomplete Form Request was created properly

  Scenario: Letters_41_Create Closure Letter:  LTD Closes/Waiver Closes_LW
    Given User is in claim "258113"
    Then Create LW: Manual Closure Letter, select "LTD Closes/Waiver Closes"
    Then Click on Skip button for Manual Letter
    Then SwitchTo Top Section Clear Text and Enter Text
    Then Click on Confirm Document button and Verify Letter Successfully was created
    Then Click Create Task Btn and Select a Task "Closure Letter" and check checkbox for a document and upload a file "AttachmentsTC01.pdf"
    Then Check the checkbox for BRE option
    Then Click on Create Button to create Manual Letter Task from Confirmation page
    Then Click on Return to Claimant Details Page Button
    Then Verify Task: Closure Letter was created properly
