package BDDAutomationExerciseStep;

import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps extends BaseStep {

	public ContactUsSteps() {
		super();
	}

	// The three first steps of the sceanrio are already implemented in
	// RegisterUserSteps

	@When("user  clicks on Contact Us button")
	public void user_clicks_on_Contact_Us_button() {
		contactUsPage = homePage.clickOnContactUsLink();

	}
// This method is defined in a CoommonSteps class	
//	@Then("We must verify {string} is visible")
//	public void we_must_verify_is_visible(String string) {
//	    
//	}

	@When("user enters name, email, subject and message choose from {string} through {int}")
	public void user_enters_name_email_subject_and_message_choose_from_through(String sheet6, Integer rowNumber) {
	    
		contactUsPage.fillInName(ReadExcelSheet.readData(sheet6, rowNumber).get("Name"));
		contactUsPage.fillInEmail(ReadExcelSheet.readData(sheet6, rowNumber).get("Email"));
		contactUsPage.fillInSubject(ReadExcelSheet.readData(sheet6, rowNumber).get("Subject"));
		contactUsPage.fillInText(ReadExcelSheet.readData(sheet6, rowNumber).get("Message"));
	}
	
	@When("user upload file choosen from {string} through {int}")
	public void user_upload_file_choosen_from_through(String sheet6, Integer rowNumber) {
		
		contactUsPage.uploadNewFile(ReadExcelSheet.readData(sheet6, rowNumber).get("FilePath"));
	   
	}
	
	@When("user clicks on Submit get in touch button and click on alert Ok button")
	public void user_clicks_on_Submit_get_in_touch_button_and_click_on_alert_Ok_button() {
		contactUsPage.clickOnSubmitButton();
		contactUsPage.clickOnAlertButton();
	}

	
	@Then("Verify success message {string} is visible")
	public void verify_success_message_is_visible(String successMesage) {
		softAssert.assertEquals(contactUsPage.getAlertSuccessMessage(), successMesage);
	    
	}
	@Then("user clicks on Home button")
	public void user_clicks_on_Home_button() {
	   homePage=contactUsPage.clickOnHomeButton();
	}

}
