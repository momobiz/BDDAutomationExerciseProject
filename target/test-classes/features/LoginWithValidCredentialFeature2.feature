@LoginFeature
Feature: Testing Login Functionality

    
@LoginWithValidCredentials
  Scenario Outline: To verify Login functionality with valid credentials
    Given user opens his browser from "<sheet1>" through <rowNumber>
    When user navigates to the website 
    Then Verify that home page is visible successfully
    When user Clicks on SignupLogin button
    Then We must verify that "Login to your account" is visible
    When user enters his valid email address and password taken from "<sheet4>" throw <rowNumber>
    And  user clicks on login button
    Then Verify that "Logged in as " username from "<sheet4>" through <rowNumber> is visible 

    Examples: 
      | sheet1  | sheet4  |	rowNumber |
      | Feuil1  | Feuil4  | 	0				| 
      | Feuil1  | Feuil4  | 	1				| 
      

    
	