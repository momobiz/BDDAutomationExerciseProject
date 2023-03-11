@VerifyTestCasesPageFeature
Feature: Test case feature

  @TestCasesPage
  Scenario Outline: To verify user navigates to test case page 
    Given user opens his browser from "<sheet1>" through <rowNumber>
    When user navigates to the website 
    Then Verify that home page is visible successfully
    When user clicks on Test Cases button
    Then Verify user is navigated to test cases page successfully

    Examples: 
      | sheet1  |	rowNumber	| 
      | Feuil1 	|     0			| 
      | Feuil1 	|     1 		| 
