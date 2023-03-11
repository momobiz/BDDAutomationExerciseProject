package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySubscriptionInHomePageSteps extends BaseStep {
	

		public VerifySubscriptionInHomePageSteps(){
				super();
		}
		
		// Previous steps are already implemented in other Class steps
		
		@When("user Scroll down to footer")
		public void user_Scroll_down_to_footer() {
			homePage.scrollDownToFooter();
		}
		
		@Then("Verify text {string} in footer")
		public void verify_text_in_footer(String str) {
			softAssert.assertEquals(homePage.footer.getSubscriptionMessage(), str);
		    
		}
		@When("user enters his email from {string} through {int} address in input and click on arrow button")
		public void user_enters_his_email_from_through_address_in_input_and_click_on_arrow_button(String sheet4, Integer rowNumber) {
		    
			homePage.footer.subscribe(ReadExcelSheet.readData(sheet4, rowNumber).get("Email"));
		}
		@Then("Verify footer subscribtion success message {string} is visible")
		public void verify_footer_subscribtion_success_message_is_visible(String str) {
		    softAssert.assertEquals(homePage.footer.getAlertSuccessMessage(), str);
		}



}
