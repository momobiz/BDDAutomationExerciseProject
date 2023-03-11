package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyAllProductsAndProductDetailPageSteps extends BaseStep {

	public VerifyAllProductsAndProductDetailPageSteps() {
		super();
	}

	@When("user click on products button")
	public void user_click_on_products_button() {
		productsPage = homePage.header.clickOnProductsLink();

	}

	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verify_user_is_navigated_to_ALL_PRODUCTS_page_successfully() {
		softAssert.assertTrue(productsPage.allProductsMessageIsDisplayed());
		
	}
	@And("Verify that the products list is visible")
	public void verify_that_the_products_list_is_visible() {
	   softAssert.assertTrue(productsPage.productsListIsDisplayed());
	}
	
	@When("user clicks on View Product of product number taken from {string} through {int}")
	public void user_clicks_on_View_Product_of_product_number_taken_from_through(String sheet4, Integer rowNumber) {
	    
		String productNumber=ReadExcelSheet.readData(sheet4, rowNumber).get("ProductNumber");
		productDetailsPage=productsPage.getProductDetails(DataSheetProcessing.numberProcessing(productNumber));
	}
	@Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
	public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {
		
		softAssert.assertTrue(productDetailsPage.productNameIsDisplayed());
		softAssert.assertTrue(productDetailsPage.productCategoryIsDisplayed());
	    softAssert.assertTrue( productDetailsPage.productPriceIsDisplayed());
	    softAssert.assertTrue( productDetailsPage.productAvailabilityIsDisplayed());
	    softAssert.assertTrue(productDetailsPage.productConditionIsDisplayed());
	    softAssert.assertTrue(productDetailsPage.productBrandIsdisplayed());
	    
	   
	    
	}


}
