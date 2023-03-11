@VerifyAllProductsAndProductDetailPageFeature
Feature: All Products and product detail page Feature

 
  @VerifyAllProductsAndProductDetailPage
  Scenario Outline: To verify all products and product detail page
   Given user opens his browser from "<sheet1>" through <rowNumber>
   When user navigates to the website 
   Then Verify that home page is visible successfully
   When user click on products button
   Then Verify user is navigated to ALL PRODUCTS page successfully
   And  Verify that the products list is visible
   When user clicks on View Product of product number taken from "<sheet4>" through <rowNumber>
   Then Verify that detail is visible: product name, category, price, availability, condition, brand
 

       Examples: 
      | sheet1  |		sheet4	|rowNumber	| 
      | Feuil1 	|   Feuil4	|  	0				| 
      | Feuil1 	|   Feuil4	|  	1				| 
    
    
