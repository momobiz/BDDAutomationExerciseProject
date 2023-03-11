@LoginWithInvalidCredentialsFeature
Feature: Login With Invalid Credentials functionality 

@LoginWithInvalidCredentials
	Scenario Outline: To verify Login functionality with invalid credentials
		Given user opens his browser from "<sheet1>" through <rowNumber>
    When user navigates to the website 
    Then Verify that home page is visible successfully
    When user Clicks on SignupLogin button
    Then We must verify that "Login to your account" is visible
    When user enters his incorrect email address and password from "<sheet5>" through <rowNumber>
    And user clicks on loginButton
    Then Verify error "Your email or password is incorrect!" is visible
    
     Examples: 
      | sheet1  | sheet5  |	rowNumber |
      | Feuil1  | Feuil5  | 0					| 
      | Feuil1  | Feuil5  | 1					| 