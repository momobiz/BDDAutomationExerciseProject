@ViewCategoryProductsFeature18
Feature: View Category Products Feature

  @viewCategoryProducts
  Scenario Outline: To verify View Category Products fonctionality
  
   Given user opens his browser from "<sheet1>" through <rowNumber>
   When user navigates to the website 
   Then Verify that categories are visible on left side bar	
   When user clicks on category choose from "<sheet9>" through <rowNumber>
   And user clicks on subcategory from from "<sheet9>" through <rowNumber>
   Then Verify that category page is displayed and confirm text from "<sheet9>" through <rowNumber>
   When On left side bar, user clicks on any other category link from "<sheet9>" through <rowNumber>
   And On left side bar, user clicks on any sub-category link from "<sheet9>" through <rowNumber>
   Then Verify that second category page is displayed and confirm text from "<sheet9>" through <rowNumber>
   
      Examples: 
	      | sheet1  |	sheet9	|	rowNumber | 
      	| Feuil1 	| Feuil9  | 	 0	 		| 
      	| Feuil1 	| Feuil9  | 	 1 	 		| 
      	
      
     