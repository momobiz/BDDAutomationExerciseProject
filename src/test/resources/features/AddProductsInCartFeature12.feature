@addProductsInCartFeature12
Feature: Add Products In Cart Feature12

  @addProductsInCart
  Scenario Outline: Verify the functionality add product in cart 
    Given user opens his browser from "<sheet1>" through <rowNumber>
   	When user navigates to the website 
   	Then Verify that home page is visible successfully
   	When user click on products button
   	Then Verify user is navigated to ALL PRODUCTS page successfully
   	When user hover over a choosern product from "<sheet4>" trhough <rowNumber> and click Add to cart
   	And  user clicks on Continue Shopping button
   	When user hover over a second choosen product from "<sheet4>" trhough <rowNumber> and click Add to cart
   	And  user Clicks on View Cart button
   	Then Verify both products from "<sheet4>" from <rowNumber> are added to Cart
   	And  Verify their prices, quantity and total price taken from "<sheet4>" through <rowNumber>
  
   	

  Examples: 
	      | sheet1  |	sheet4	|	rowNumber | 
      	| Feuil1 	| Feuil4  | 	 1 	 		| 
      	| Feuil1 	| Feuil4  | 	 0 	 		| 
     
      	
      	
      	
      
      	

