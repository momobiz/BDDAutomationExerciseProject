@RegisterUserWithExistingEmailFeature
Feature: Register User with existing email functionality
  

  @RegisterUserWithExistingEmail
  Scenario Outline: To verify that we cannot register with an existing email
  
    Given user opens his browser from "<sheet1>" through <rowNumber>
    When user navigates to the website 
    Then Verify that home page is visible successfully
    When user Clicks on SignupLogin button
    Then Verify "New User Signup!" is visible
    When user enters his name and email address from "<sheet4>" through <rowNumber>
    And  user clicks on Signup button
    Then Verify error "Email Address already exist!" is visible
    

    Examples: 
    |	sheet1	|	sheet4	| rowNumber	|
    |	Feuil1	|	Feuil4	|	0					|
    |	Feuil1	|	Feuil4	|	1					|
      
