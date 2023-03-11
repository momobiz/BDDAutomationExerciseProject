package BDDAutomationExerciseStep;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps extends BaseStep{
	public LogoutSteps() {
		super();
	}
	
	// First steps of the scenario, are automatically taken from Loginsteps 
	// These are the remain steps we'll find in Logout scenario
	
	@When("user clicks on the Logout button")
	public void user_clicks_on_the_Logout_button() {
	    homePage=userHomePage.logout();
	}
	
	@Then("We Verify that user is navigated to the home page")
	public void we_Verify_that_user_is_navigated_to_the_home_page() {
		Assert.assertTrue(homePage.header.signupLoginLinkIsVisible());
	    
	}
	
	

}
