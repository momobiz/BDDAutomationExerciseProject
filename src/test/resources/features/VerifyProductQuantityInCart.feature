@verifyProductQuantityInCartFeature
Feature: verify Product Quantity In Cart Feature

  @verifyProductQuantityInCart
  Scenario Outline: Verify the functionality product quantity in cart
  	
  	Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   
   
   Examples:
  		 |	sheet1	|	rowNumber	|
   		 |	Feuil1	|	1					|	