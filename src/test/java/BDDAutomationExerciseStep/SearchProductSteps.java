package BDDAutomationExerciseStep;

import org.testng.Assert;

import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps extends BaseStep{
	
	public SearchProductSteps() {
		super();
	}
	
	// Previous steps are taken from VerifyAllProductsAndProductDetailsPaggeSteps class
	
	@When("user enters productName from {string} through {int} in search input and clicks on search button")
	public void user_enters_productName_from_through_in_search_input_and_clicks_on_search_button(String sheet4, Integer rowNumber) {
	    searchedProductsPage=productsPage.searchProduct(ReadExcelSheet.readData(sheet4, rowNumber).get("ProductName"));
	    
	}
	
	@Then("Verify {string} is visible in products page")
	public void verify_is_visible_in_products_page(String str) {
		softAssert.assertEquals(searchedProductsPage.getSearchedProductMessage(), str);	
	    
	}
	@And("Verify all the products taken from {string} through {int} related to search are visible")
	public void verify_all_the_products_taken_from_through_related_to_search_are_visible(String sheet4, Integer rowNumber) {
	    
		Assert.assertTrue( searchedProductsPage.areProductsSeachedEqualToProductDisplayed(ReadExcelSheet.readData(sheet4, rowNumber).get("ProductName")));

	}




}
