package BDDAutomationExerciseStep;

import org.testng.Assert;

import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseStep{
	
	public LoginSteps() {
		super();
	}
	
	@Then("We must verify that {string} is visible")
	public void we_must_verify_that_is_visible(String loginMessage) {
		softAssert.assertEquals(signupLoginPage.getLoginMessage(), loginMessage);
	   
	}
	@When("user enters his valid email address and password taken from {string} throw {int}")
	public void user_enters_his_valid_email_address_and_password_taken_from_throw(String sheet4, Integer rowNumber) {
	   signupLoginPage.fillInLoginEmail(ReadExcelSheet.readData(sheet4, rowNumber).get("Email")); 
	   signupLoginPage.fillInLoginPassword(ReadExcelSheet.readData(sheet4, rowNumber).get("Password")); 
	
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		userHomePage=signupLoginPage.clickOnLoginButton();
	   
	}
	@Then("Verify that {string} username from {string} through {int} is visible")
	public void verify_that_username_from_through_is_visible(String loggedIn, String sheet4, Integer rowNumber) {
	 
		String expectedMessage=loggedIn+ReadExcelSheet.readData(sheet4, rowNumber).get("Name");
		Assert.assertEquals(userHomePage.header.getLoggedInMessage(),expectedMessage );
	}
	
	/*****************************************************/
	/***  Steps for Login with invalid credentials *********/
	/****************************************************/
	
	@When("user enters his incorrect email address and password from {string} through {int}")
	public void user_enters_his_incorrect_email_address_and_password_from_through(String sheet5, Integer rawNumber) {
		
		signupLoginPage.fillInLoginEmail(ReadExcelSheet.readData(sheet5, rawNumber).get("InvalidEmail"));
		signupLoginPage.fillInLoginPassword(ReadExcelSheet.readData(sheet5, rawNumber).get("InvalidPassword"));
		
	}
	@When("user clicks on loginButton")
	public void user_clicks_on_loginButton() {
		signupLoginPage.clickOnLoginButtonWhenInvalidCredentials();
		
	    
	}
	@Then("Verify error {string} is visible")
	public void verify_error_is_visible(String expectedInvalidMessage) {
		
		Assert.assertEquals(signupLoginPage.getInvalidLoginMessage(), expectedInvalidMessage);
	    
	}

	
	

}
