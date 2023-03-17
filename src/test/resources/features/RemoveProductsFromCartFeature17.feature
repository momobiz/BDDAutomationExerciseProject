@removeProductsFromCartFeature17
Feature: Remove Products From Cart Feature

  @removeProductsFromCart
  Scenario Outline: To verify Remove Products From Cart functionalitys
  
    Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   	When user add three products to cart from "<sheet8>" through <rowNumber>
   	Then Verify that cart page is displayed
   	When user  clicks on X button corresponding to particular product from "<sheet8>" through <rowNumber>
   	Then Verify that product is removed from the cart
   	
      Examples: 
	      | sheet1  |	sheet8	|	rowNumber | 
      	| Feuil1 	| Feuil8  | 	 0 	 		| 
      	| Feuil1 	| Feuil8  | 	 1 	 		| 
      