package BDDAutomationExerciseStep;

import org.apache.poi.ss.SpreadsheetVersion;

import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyProductQuantityInCartSteps extends BaseStep{

	public VerifyProductQuantityInCartSteps() {
		super();
		
	}
	//Previous steps are taken from other classes
	
	@When("user clicks chooses product to view from homePage by {string} through {int}")
	public void user_clicks_chooses_product_to_view_from_homePage_by_through(String sheet4, Integer rowNumber) {
				
		String numberOfChoosenProduct=ReadExcelSheet.readData(sheet4, rowNumber).get("ProductNumber");
		productDetailsPage=homePage.clickOnViewProduct(DataSheetProcessing.numberProcessing(numberOfChoosenProduct));
		
	}
	
	@Then("Verify product detail page is opened")
	public void verify_product_detail_page_is_opened() {
		softAssert.assertTrue(productDetailsPage.productDetailsPageIsDeplayed());
	   
	}
	@When("user increase quantity to a number taken from {string} through {int}")
	public void user_increase_quantity_to_a_number_taken_from_through(String sheet4, Integer rowNumber) {
	   
	  String quantity=ReadExcelSheet.readData(sheet4, rowNumber).get("ProductQuantity");
	  productDetailsPage.increaseQuantity(DataSheetProcessing.numberProcessing(quantity));
	}
	@When("user clicks on Add to cart button in product details Page")
	public void user_clicks_on_Add_to_cart_button_in_product_details_Page() {
	   productDetailsPage.clickOnToAddToCartButton();
	}
	@When("user Clicks On View Cart button")
	public void user_Clicks_On_View_Cart_button() {
	    cartPage=productDetailsPage.clickOnViewCartButton();
	}
	@Then("Verify that product is displayed in cart page with exact quantity {string} through {int}")
	public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity_through(String sheet4, Integer rowNumber) {
	   
	String productName=ReadExcelSheet.readData(sheet4, rowNumber).get("NameOFFirstProduct");
	String quantity=DataSheetProcessing.numberProcessing(ReadExcelSheet.readData(sheet4, rowNumber).get("ProductQuantity"));

		
	    softAssert.assertTrue(cartPage.isProductInCart(productName));
	    softAssert.assertEquals(cartPage.getProductQuantity(productName), quantity);
	  
	   
	   
	    
	    
	    
		
	}

}
