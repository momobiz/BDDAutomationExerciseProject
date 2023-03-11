@RegisterUserFeature
Feature: Registration user feature
  
  @RegisterUser
  Scenario Outline: To verify that user is registred 

    Given user opens his browser from "<sheet1>" through <rowNumber>
    When user navigates to the website 
    Then Verify that home page is visible successfully
    When user Clicks on SignupLogin button
    Then Verify "New User Signup!" is visible
    When user enters his name and email address from "<sheet2>" through <rowNumber>
    And  user clicks on Signup button
    Then Verify that "ENTER ACCOUNT INFORMATION" is visible
    When user Fills details: Title, Name, Email, Password, Date of birth from "<sheet3>" through <rowNumber>
    And  user selects checkbox to receive newsletter & special offers from "<sheet3>" through <rowNumber> 
    And  user  Fills Firstname,Lastname, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number from "<sheet3>" through <rowNumber> 
    And  user clicks Create Account button
    Then You must verify that "ACCOUNT CREATED!" is visible
    When use clicks on Continue button
    Then You must verify that "Logged in as " username from "<sheet3>" through <rowNumber> is visible
    When user clicks on Delete Account button
    Then You must Verify that "ACCOUNT DELETED!" is visible
    And  user clicks on Continue button
    
    Examples:
    |	sheet1	|	sheet2	|	sheet3	|	rowNumber	|
    |	Feuil1	|	Feuil2	|	Feuil3	|			0			|
    |	Feuil1	|	Feuil2	|	Feuil3	|			1			|
    
   

     
