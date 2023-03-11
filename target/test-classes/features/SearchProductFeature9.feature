@searchProductFeature
Feature: Search Product Feature

  @searchProduct
  Scenario Outline: Verify the searching product functionality 
  
   Given user opens his browser from "<sheet1>" through <rowNumber>
   When user navigates to the website 
   Then Verify that home page is visible successfully
   When user click on products button
   Then Verify user is navigated to ALL PRODUCTS page successfully
   When user enters productName from "<sheet4>" through <rowNumber> in search input and clicks on search button
   Then Verify "SEARCHED PRODUCTS" is visible in products page
   And  Verify all the products taken from "<sheet4>" through <rowNumber> related to search are visible 

      Examples: 
      | sheet1  |		sheet4	|	rowNumber	| 
      | Feuil1 	|   Feuil4	|  	0				| 
      | Feuil1 	|   Feuil4	|  	1				| 
    
 
       
