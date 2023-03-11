package BDDAutomationExerciseStep;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCasesPageSteps extends BaseStep {

	public TestCasesPageSteps() {
		super();
	}
	

	// The three first steps are common to other scenario
	
	@When("user clicks on Test Cases button")
	public void user_clicks_on_Test_Cases_button() {
		testCasesPage=homePage.clickOnTestCaseButton();

	}
	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {
	   Assert.assertTrue(testCasesPage.testCasesMessageIsDisplayed());
	}

}
