@verifyProductQuantityInCartFeature13
Feature: verify Product Quantity In Cart Feature

  @verifyProductQuantityInCart
  Scenario Outline: Verify the functionality product quantity in cart
  	
  	Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   	When user clicks chooses product to view from homePage by "<sheet4>" through <rowNumber>
   	Then Verify product detail page is opened
   	When user increase quantity to a number taken from "<sheet4>" through <rowNumber>
   	And  user clicks on Add to cart button in product details Page
    And  user Clicks On View Cart button
    Then Verify that product is displayed in cart page with exact quantity "<sheet4>" through <rowNumber>
   
   Examples:
  		 |	sheet1	|	sheet4	|	rowNumber	|
   		 |	Feuil1	|	Feuil4	|		0				|	
   		 |	Feuil1	|	Feuil4	|		1				|	
   		
   	