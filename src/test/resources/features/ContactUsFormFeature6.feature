@ContactUsFormFeature
Feature: Testing Contact Us Form feature

  @ContactUsForm
  Scenario Outline: To verify the contact us form 
    Given user opens his browser from "<sheet1>" through <rowNumber>
    When user navigates to the website 
    Then Verify that home page is visible successfully
    When user  clicks on Contact Us button
    Then We must verify "GET IN TOUCH" is visible
    When user enters name, email, subject and message choose from "<sheet6>" through <rowNumber>
    And  user upload file choosen from "<sheet6>" through <rowNumber>
    And  user clicks on Submit get in touch button and click on alert Ok button
  	Then Verify success message "Success! Your details have been submitted successfully." is visible
    And  user clicks on Home button
    Then We Verify that user is navigated to the home page
  
  
    
    Examples:
    |	sheet1	|	sheet6	|	rowNumber	|
    |	Feuil1	|	Feuil6	|	0					|
    |	Feuil1	|	Feuil6	|	1					|