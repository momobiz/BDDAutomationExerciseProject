@verifySubscriptionInHomePageFeature
Feature: subscription in home page feature

  @verifySubscriptionInHomePage
  Scenario Outline: To verify subscription in home page
    Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   	When user Scroll down to footer
   	Then Verify text "SUBSCRIPTION" in footer 
   	When user enters his email from "<sheet4>" through <rowNumber> address in input and click on arrow button
    Then Verify footer subscribtion success message "You have been successfully subscribed!" is visible
		
    Examples: 
      | sheet1  |	sheet4	|	rowNumber | 
      | Feuil1 	| Feuil4  | 	 0 	 		| 
      | Feuil1 	| Feuil4  | 	 1 	 		| 
     
    
