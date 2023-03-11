package BDDAutomationExerciseStep;

import io.cucumber.java.en.Then;

public class CommonSteps extends BaseStep{
	
	public CommonSteps() {
		super();
	}
	
	@Then("We must verify {string} is visible")
	public void we_must_verify_is_visible(String str) {
		try {
			if(contactUsPage!=null && contactUsPage.inTouchMessageIsVisible()) {
				softAssert.assertEquals(contactUsPage.getInTouchMessage(), str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

}
