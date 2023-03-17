package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewCategoryProductssteps extends BaseStep {

	public ViewCategoryProductssteps() {
		super();

	}

	@Then("Verify that categories are visible on left side bar")
	public void verify_that_categories_are_visible_on_left_side_bar() {
		softAssert.assertTrue(homePage.isSideBarDisplayed());
	}

	@When("user clicks on category choose from {string} through {int}")
	public void user_clicks_on_category_choose_from_through(String sheet9, Integer rowNumber) {

		String category = ReadExcelSheet.readData(sheet9, rowNumber).get("Category");

		homePage.chooseCategory(category);

	}

	@When("user clicks on subcategory from from {string} through {int}")
	public void user_clicks_on_subcategory_from_from_through(String sheet9, Integer rowNumber) {

		String category = ReadExcelSheet.readData(sheet9, rowNumber).get("Category");
		String subCategory = ReadExcelSheet.readData(sheet9, rowNumber).get("SubCategory");
		
		homePage.chooseSubCategory(category,subCategory);
	}

	@Then("Verify that category page is displayed and confirm text from {string} through {int}")
	public void verify_that_category_page_is_displayed_and_confirm_text_from_through(String sheet9, Integer rowNumber) {
		
		String confirmText = ReadExcelSheet.readData(sheet9, rowNumber).get("CategoryPage");
		softAssert.assertEquals(homePage.getCategoryOfChoosenProducts(), confirmText);
		
	}
	/************ Same job for Second Category and subcategory choosen by user ***************************/
	
	@When("On left side bar, user clicks on any other category link from {string} through {int}")
	public void on_left_side_bar_user_clicks_on_any_other_category_link_from_through(String sheet9, Integer rowNumber) {
	   
		String category = ReadExcelSheet.readData(sheet9, rowNumber).get("Category2");
		homePage.chooseCategory(category);
		
	}
	@When("On left side bar, user clicks on any sub-category link from {string} through {int}")
	public void on_left_side_bar_user_clicks_on_any_sub_category_link_from_through(String sheet9, Integer rowNumber) {

		String category = ReadExcelSheet.readData(sheet9, rowNumber).get("Category2");
		String subCategory = ReadExcelSheet.readData(sheet9, rowNumber).get("SubCategory2");
		
		homePage.chooseSubCategory(category,subCategory);
	}
	@Then("Verify that second category page is displayed and confirm text from {string} through {int}")
	public void verify_that_second_category_page_is_displayed_and_confirm_text_from_through(String sheet9, Integer rowNumber) {
		
		String confirmText = ReadExcelSheet.readData(sheet9, rowNumber).get("CategoryPage2");
		softAssert.assertEquals(homePage.getCategoryOfChoosenProducts(), confirmText);
	}

}
