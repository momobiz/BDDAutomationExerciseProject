package BDDAutomationExerciseStep;

import org.testng.Assert;

import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProductsFromCartSteps extends BaseStep{

	public RemoveProductsFromCartSteps() {
		super();
		
	}
	
	// Previous steps are already defined in other classes
	
	@When("user  clicks on X button corresponding to particular product from {string} through {int}")
	public void user_clicks_on_X_button_corresponding_to_particular_product_from_through(String sheet8, Integer rowNumber) {
	    
		String indexOfItemToDelete=DataSheetProcessing.numberProcessing(ReadExcelSheet.readData(sheet8, rowNumber).get("IndexOfProductToDelete"));
		cartPage.removeItemFromCart(indexOfItemToDelete);
		
	  
	}
	@Then("Verify that product is removed from the cart")
	public void verify_that_product_is_removed_from_the_cart() {
	    Assert.assertFalse(cartPage.isDeletedProductInCart());
		
	}
	
	

}
