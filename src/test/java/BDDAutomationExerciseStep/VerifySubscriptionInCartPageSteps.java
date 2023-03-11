package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySubscriptionInCartPageSteps extends BaseStep {

	public VerifySubscriptionInCartPageSteps() {
		super();
	}

	// Previous actions are taken from others step classes

	@When("user clicks on Cart button")
	public void user_clicks_on_Cart_button() {
		cartPage = homePage.header.clickOnCartLink();

	}

	@When("user Scroll down to the footer of cart page")
	public void user_Scroll_down_to_the_footer_of_cart_page() {
		cartPage.scrollDownToFooter();
	}
	
	@Then("verify text {string} in cart Page Footer is visible")
	public void verify_text_in_cart_Page_Footer_is_visible(String str) {
		softAssert.assertEquals(cartPage.footer.getSubscriptionMessage(), false);
	    
	}
	@When("user enters email taken from {string} through {int} in input footer cartpage and clicks on arrow button")
	public void user_enters_email_taken_from_through_in_input_footer_cartpage_and_clicks_on_arrow_button(String sheet4, Integer rowNumber) {
	    
		cartPage.footer.subscribe(ReadExcelSheet.readData(sheet4, rowNumber).get("Email"));
	}
	
	@Then("Verify success message {string} in cart page footer is visible")
	public void verify_success_message_in_cart_page_footer_is_visible(String str) {
	
		softAssert.assertEquals(cartPage.footer.getAlertSuccessMessage(), str);
	}

}
