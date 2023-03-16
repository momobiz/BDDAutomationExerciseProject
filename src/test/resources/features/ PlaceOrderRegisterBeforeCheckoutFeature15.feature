@placeOrderRegisterBeforeCheckoutFeature15
Feature: Register before checkout 


  @placeOrderRegisterBeforeCheckout
  Scenario Outline: To verify register before checkout fonctionality
 
  	Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   	When user Clicks on SignupLogin button
    Then Verify "New User Signup!" is visible
    When user enters his name and email address from "<sheet7>" through <rowNumber>
    And  user clicks on Signup button
    Then Verify that "ENTER ACCOUNT INFORMATION" is visible
    When user Fills details: Title, Name, Email, Password, Date of birth from "<sheet7>" through <rowNumber>
    And  user selects checkbox to receive newsletter & special offers from "<sheet7>" through <rowNumber> 
    And  user  Fills Firstname,Lastname, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number from "<sheet7>" through <rowNumber> 
    And  user clicks Create Account button
    Then You must verify that "ACCOUNT CREATED!" is visible
    When use clicks on Continue button
    Then You must verify that "Logged in as " username from "<sheet7>" through <rowNumber> is visible
    When In user home page, user add three products to cart from "<sheet7>" through <rowNumber>
    Then Verify that cart page is displayed
    And connected user clicks On Proceed To Checkout button
   	Then Verify Address Details is Visible on Cart Page
    When user enter description in comment text area "<sheet7>" through <rowNumber> and clicks on Place Order
    And user enters payment details: Name on Card, Card Number, CVC, Expiration date from "<sheet7>" through <rowNumber>
    And use clicks on Pay and Confirm Order button
    Then user Verify success message "Your order has been placed successfully!" is visible
    When user clicks on Delete Account button
    Then You must Verify that "ACCOUNT DELETED!" is visible
    And  user clicks on Continue button
   	
      Examples: 
	      | sheet1  |	sheet7	|	rowNumber | 
      	| Feuil1 	| Feuil7  | 	 0 	 		| 
      	| Feuil1 	| Feuil7  | 	 1 	 		| 
     