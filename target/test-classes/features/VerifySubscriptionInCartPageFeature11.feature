@verifySubscriptionInCartPageFeature
Feature: Subscription In Cart Page Feature

  @verifySubscriptionInCartPage
  Scenario Outline: To verify subscription in cart page
  	 Given user opens his browser from "<sheet1>" through <rowNumber>
   	 When user navigates to the website 
   	 Then Verify that home page is visible successfully
   	 When user clicks on Cart button
   	 When user Scroll down to the footer of cart page
   	 Then verify text "SUBSCRIPTION" in cart Page Footer is visible 
   	 When user enters email taken from "<sheet4>" through <rowNumber> in input footer cartpage and clicks on arrow button
   	 Then Verify success message "You have been successfully subscribed!" in cart page footer is visible
    
    Examples: 
      | sheet1  |	sheet4	|	rowNumber | 
      | Feuil1 	| Feuil4  | 	 0 	 		| 
      | Feuil1 	| Feuil4  | 	 1 	 		| 
     