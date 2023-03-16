package BDDAutomationExerciseStep;

import org.testng.Assert;

import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderRegisterWhileCheckoutSteps extends BaseStep {

	public PlaceOrderRegisterWhileCheckoutSteps() {
		super();

	}
	// Previous steps are defined in other classes

	@When("user add three products to cart from {string} through {int}")
	public void user_add_three_products_to_cart_from_through(String sheet7, Integer rowNumber) {
		String product1 = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Product1Number"));
		String product2 = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Product2Number"));
		String product3 = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Product3Number"));

		homePage.addProductToCart(product1);
		homePage.addProductToCart(product2);
		cartPage = homePage.addProductAndOpenCart(product3);
	}

	@Then("Verify that cart page is displayed")
	public void verify_that_cart_page_is_displayed() {
		softAssert.assertTrue(cartPage.proceedToCheckoutIsDisplayed());
	}
	@When("user clicks on Proceed To Checkout and Register-Login button of the alert card")
	public void user_clicks_on_Proceed_To_Checkout_and_Register_Login_button_of_the_alert_card() {
	  signupLoginPage=cartPage.clickOnProceedCheckoutButton();
	}
	// previous steps already defined 
	
	@When("connected user clicks on cart button")
	public void connected_user_clicks_on_cart_button() {
	    cartPage=userHomePage.clickOnCartLink();
	}
	@When("connected user clicks On Proceed To Checkout button")
	public void connected_user_clicks_On_Proceed_To_Checkout_button() {
		cartPage=cartPage.whenconnectedclickOnProceedCheckoutButton();
		
	   
	}
	@Then("Verify Address Details is Visible on Cart Page")
	public void verify_Address_Details_is_Visible_on_Cart_Page() {
	    softAssert.assertTrue(cartPage.cartAddressDetails.addressDetailsIsDisplayed());
	    
	}
	@When("user enter description in comment text area {string} through {int} and clicks on Place Order")
	public void user_enter_description_in_comment_text_area_through_and_clicks_on_Place_Order(String sheet7, Integer rowNumber) {
	    
	   cartPage.addDescription(ReadExcelSheet.readData(sheet7, rowNumber).get("Description"));
	   paymentDetailsPage=cartPage.clickOnplaceOrderButton();
		
	}
	@When("user enters payment details: Name on Card, Card Number, CVC, Expiration date from {string} through {int}")
	public void user_enters_payment_details_Name_on_Card_Card_Number_CVC_Expiration_date_from_through(String sheet7, Integer rowNumber) {
	   
		paymentDetailsPage.fillInCardName(ReadExcelSheet.readData(sheet7, rowNumber).get("NameOnCard"));
		paymentDetailsPage.fillInCardNumber(DataSheetProcessing.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("CardNumber")));
	    paymentDetailsPage.fillInCvc(DataSheetProcessing.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("Cvc")));
	    paymentDetailsPage.fillInExpirationMonth(DataSheetProcessing.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("ExpirationMonth")));
	    paymentDetailsPage.fillInExpirationYear(DataSheetProcessing.numberProcessing(ReadExcelSheet.readData(sheet7, rowNumber).get("ExpirationYear")));
	
	
	}
	@When("use clicks on Pay and Confirm Order button")
	public void use_clicks_on_Pay_and_Confirm_Order_button() {
	  paymentDetailsPage.clickOnPayAndConfirmButton();
	
	  
	}
	@Then("user Verify success message {string} is visible")
	public void user_Verify_success_message_is_visible(String str) {
	
		softAssert.assertEquals(paymentDetailsPage.eventHandler.getSuccessMessage(), str);
	    
	}
	

}
