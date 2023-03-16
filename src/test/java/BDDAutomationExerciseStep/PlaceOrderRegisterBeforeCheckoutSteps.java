package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.When;

public class PlaceOrderRegisterBeforeCheckoutSteps extends BaseStep{

	public PlaceOrderRegisterBeforeCheckoutSteps() {
		super();
		
	}
	
	// Previous steps are already defined in other classes
	
	@When("In user home page, user add three products to cart from {string} through {int}")
	public void in_user_home_page_user_add_three_products_to_cart_from_through(String sheet7, Integer rowNumber) {
		String product1 = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Product1Number"));
		String product2 = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Product2Number"));
		String product3 = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Product3Number"));

		userHomePage.addProductToCart(product1);
		userHomePage.addProductToCart(product2);
		cartPage = userHomePage.addProductAndOpenCart(product3);
	}
	
	

}
