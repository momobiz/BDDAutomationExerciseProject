@placeOrderLoginBeforeCheckoutFeature16
Feature: Place Order Login Before Checkout Feature

  @placeOrderLoginBeforeCheckout
  Scenario Outline: To verify place Order Login Before Checkout functionality
    
    Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   	When user Clicks on SignupLogin button
   	Then We must verify that "Login to your account" is visible
    When user enters his valid email address and password taken from "<sheet8>" throw <rowNumber>
    And  user clicks on login button
    Then Verify that "Logged in as " username from "<sheet8>" through <rowNumber> is visible 
   	When In user home page, user add three products to cart from "<sheet8>" through <rowNumber>
    Then Verify that cart page is displayed
    And connected user clicks On Proceed To Checkout button
   	Then Verify Address Details is Visible on Cart Page
    When user enter description in comment text area "<sheet8>" through <rowNumber> and clicks on Place Order
		And user enters payment details: Name on Card, Card Number, CVC, Expiration date from "<sheet8>" through <rowNumber>
    And use clicks on Pay and Confirm Order button
    Then user Verify success message "Your order has been placed successfully!" is visible
    
    
   	 Examples: 
	      | sheet1  |	sheet8	|	rowNumber | 
      	| Feuil1 	| Feuil8  | 	 0 	 		| 
      	| Feuil1 	| Feuil8  | 	 1 	 		| 
     