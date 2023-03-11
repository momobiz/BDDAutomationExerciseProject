package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductsInCartSteps extends BaseStep {

	public AddProductsInCartSteps() {
		super();

	}

	// Previous steps are taken from other class steps
	@When("user hover over a choosern product from {string} trhough {int} and click Add to cart")
	public void user_hover_over_a_choosern_product_from_trhough_and_click_Add_to_cart(String sheet4,
			Integer rowNumber) {

		String productNumber = ReadExcelSheet.readData(sheet4, rowNumber).get("ProductNumber");
		productsPage.hoverOnProductAndClickAddToCart(DataSheetProcessing.numberProcessing(productNumber));
	}

	@When("user clicks on Continue Shopping button")
	public void user_clicks_on_Continue_Shopping_button() {
		productsPage.clickOnAlertCardContinueshoppingButton();

	}

	@And("user hover over a second choosen product from {string} trhough {int} and click Add to cart")
	public void user_hover_over_a_second_choosen_product_from_trhough_and_click_Add_to_cart(String sheet4,
			Integer rowNumber) {

		String productNumber = ReadExcelSheet.readData(sheet4, rowNumber).get("SecondProductNumber");
		productsPage.hoverOnProductAndClickAddToCart(DataSheetProcessing.numberProcessing(productNumber));

	}

	@And("user Clicks on View Cart button")
	public void user_Clicks_on_View_Cart_button() {
		cartPage=productsPage.clickOnAlertCardViewCart();
		
	}
	
	@Then("Verify both products from {string} from {int} are added to Cart")
	public void verify_both_products_from_from_are_added_to_Cart(String sheet4, Integer rowNumber) {
    	String firstProduct=ReadExcelSheet.readData(sheet4, rowNumber).get("NameOFFirstProduct");
	    String secondProduct=ReadExcelSheet.readData(sheet4, rowNumber).get("NameOFSecondProduct");
	   
		softAssert.assertTrue(cartPage.isProductInCart(firstProduct));
		softAssert.assertTrue(cartPage.isProductInCart(secondProduct));    
	}
	
	@Then("Verify their prices, quantity and total price taken from {string} through {int}")
	public void verify_their_prices_quantity_and_total_price_taken_from_through(String sheet4, Integer rowNumber) {
	    //name du produit +quantite
		
	   
	    
	    String firstProduct=ReadExcelSheet.readData(sheet4, rowNumber).get("NameOFFirstProduct");
	    String firstProductPrice=ReadExcelSheet.readData(sheet4, rowNumber).get("FirstProductPrice");
	    String firstProductQuantity=DataSheetProcessing
	    								.numberProcessing(ReadExcelSheet.readData(sheet4, rowNumber)
	    																	.get("QuantityOfFirstProduct"));
	    String firstProductTotalPrice=ReadExcelSheet.readData(sheet4, rowNumber).get("FirstProductTotalPrice");
	    
	   
        String secondProduct=ReadExcelSheet.readData(sheet4, rowNumber).get("NameOFSecondProduct");
	    String secondProductPrice=ReadExcelSheet.readData(sheet4, rowNumber).get("SecondProductPrice");
	    String secondProductQuantity=DataSheetProcessing
	    								.numberProcessing(ReadExcelSheet.readData(sheet4, rowNumber)
	    																	.get("QuantityOfSecondProduct"));
	    String secondProductTotalPrice=ReadExcelSheet.readData(sheet4, rowNumber).get("SecondProductTotalPrice");
	    
	    softAssert.assertEquals(cartPage.getProductPrice(firstProduct), firstProductPrice);
	    softAssert.assertEquals(cartPage.getProductQuantity(firstProduct), firstProductQuantity);
	    softAssert.assertEquals(cartPage.getTotalPrice(firstProduct), firstProductTotalPrice);
	    
	    softAssert.assertEquals(cartPage.getProductPrice(secondProduct), secondProductPrice);
	    softAssert.assertEquals(cartPage.getProductQuantity(secondProduct), secondProductQuantity);
	    softAssert.assertEquals(cartPage.getTotalPrice(secondProduct), secondProductTotalPrice);
		
	}

}
