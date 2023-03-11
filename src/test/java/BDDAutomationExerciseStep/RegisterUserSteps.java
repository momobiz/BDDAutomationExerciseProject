package BDDAutomationExerciseStep;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.devtools.v85.runtime.model.ExceptionThrown;

import BDDAutomationExercisePage.BasePage;
import BDDAutomationExercisePage.HomePage;
import BDDAutomationExerciseUtils.BirthDate;
import BDDAutomationExerciseUtils.DataSheetProcessing;
import BDDAutomationExerciseUtils.ReadExcelSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUserSteps extends BaseStep {

	public RegisterUserSteps() {
		super();
	}

	@Given("user opens his browser from {string} through {int}")
	public void user_opens_his_browser_from_through(String sheetName, Integer rowNumber) {

		String browserName = ReadExcelSheet.readData(sheetName, rowNumber).get("Browser");
		BasePage.lauchBrowser(browserName);

	}

	@When("user navigates to the website")
	public void user_navigates_to_the_website() {
		homePage = new HomePage();
	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {

		softAssert.assertTrue(homePage.header.signupLoginLinkIsVisible());

	}

	@When("user Clicks on SignupLogin button")
	public void user_Clicks_on_SignupLogin_button() {
		signupLoginPage = homePage.header.clickOnSigupLoginLink();

	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String str) {
		softAssert.assertEquals(signupLoginPage.getNewUserSignupMessage(), str);

	}

	@When("user enters his name and email address from {string} through {int}")
	public void user_enters_his_name_and_email_address_from_through(String sheetName, Integer row) {

		signupLoginPage.fillInName(ReadExcelSheet.readData(sheetName, row).get("Name"));
		signupLoginPage.fillInEmailforSignup(ReadExcelSheet.readData(sheetName, row).get("Email"));

	}

	@When("user clicks on Signup button")
	public void user_clicks_on_Signup_button() {

		enterAccountInformationPage = signupLoginPage.clickOnSingupButton();

	}

	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String str) {
		softAssert.assertEquals(enterAccountInformationPage.getEnterAccountInformationMessage(), str);

	}

	@When("user Fills details: Title, Name, Email, Password, Date of birth from {string} through {int}")
	public void user_Fills_details_Title_Name_Email_Password_Date_of_birth_from_through(String sheet3,
			Integer rowNumber) {

		enterAccountInformationPage.selectGender(ReadExcelSheet.readData(sheet3, rowNumber).get("Title"));
		enterAccountInformationPage.fillInName(ReadExcelSheet.readData(sheet3, rowNumber).get("Name"));
		enterAccountInformationPage.fillInPassword(ReadExcelSheet.readData(sheet3, rowNumber).get("Password"));

		BirthDate birthDate = new BirthDate(ReadExcelSheet.readData(sheet3, rowNumber).get("DateOfBirth"));
		enterAccountInformationPage.selectDayOfBirth(birthDate.generateDayOfBirth());
		enterAccountInformationPage.selectMonthOfBirth(birthDate.generateMonthOfBirth());
		enterAccountInformationPage.selectYearOfBirth(birthDate.generateYearOfBirth());

	}

	@When("user selects checkbox to receive newsletter & special offers from {string} through {int}")
	public void user_selects_checkbox_to_receive_newsletter_special_offers_from_through(String sheet3,
			Integer rowNumber) {

		enterAccountInformationPage.selectNewsletter(ReadExcelSheet.readData(sheet3, rowNumber).get("Newsletters"));
		enterAccountInformationPage
				.selectSpecialOffers(ReadExcelSheet.readData(sheet3, rowNumber).get("OffersFromPartners"));

	}

	@And("user  Fills Firstname,Lastname, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number from {string} through {int}")
	public void user_Fills_Firstname_Lastname_Company_Address_Address2_Country_State_City_Zipcode_Mobile_Number_from_through(
			String sheet3, Integer rowNumber) {

		enterAccountInformationPage.fillInFirstname(ReadExcelSheet.readData(sheet3, rowNumber).get("Firstname"));
		enterAccountInformationPage.fillInLastname(ReadExcelSheet.readData(sheet3, rowNumber).get("Lastname"));
		enterAccountInformationPage.fillInCompany(ReadExcelSheet.readData(sheet3, rowNumber).get("Company"));
		enterAccountInformationPage.fillInAddress(ReadExcelSheet.readData(sheet3, rowNumber).get("Address"));
		enterAccountInformationPage.fillInAddress2(ReadExcelSheet.readData(sheet3, rowNumber).get("Address2"));
		enterAccountInformationPage.fillInState(ReadExcelSheet.readData(sheet3, rowNumber).get("State"));
		enterAccountInformationPage.selectCountry(ReadExcelSheet.readData(sheet3, rowNumber).get("Country"));
		enterAccountInformationPage.fillInCity(ReadExcelSheet.readData(sheet3, rowNumber).get("City"));
		String zipCode = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet3, rowNumber).get("ZipCode"));
		enterAccountInformationPage.fillInZipcode(zipCode);
		String mobileNumber = DataSheetProcessing
				.numberProcessing(ReadExcelSheet.readData(sheet3, rowNumber).get("MobileNumber"));
		enterAccountInformationPage.fillInMobileNumber(mobileNumber);

	}

	@And("user clicks Create Account button")
	public void user_clicks_Create_Account_button() {
		congratulationsAccountSuccessfullyCreatedPage = enterAccountInformationPage.clickOnCreateAccountButton();

	}

	@Then("You must verify that {string} is visible")
	public void you_must_verify_that_is_visible(String congratulationMessage) {
		softAssert.assertEquals(congratulationsAccountSuccessfullyCreatedPage.getAccountCreatedMessage(),
				congratulationMessage);

	}

	@When("use clicks on Continue button")
	public void use_clicks_on_Continue_button() {
		userHomePage=congratulationsAccountSuccessfullyCreatedPage.clickOnContinueButton();
	
	}

	@Then("You must verify that {string} username from {string} through {int} is visible")
	public void you_must_verify_that_username_from_through_is_visible(String welcomeMessage, String sheet3, Integer rowNumber) {	
		softAssert.assertEquals(userHomePage.header.getLoggedInMessage(), welcomeMessage+ReadExcelSheet.readData(sheet3, rowNumber).get("Firstname"));	
		
	}
	@When("user clicks on Delete Account button")
	public void user_clicks_on_Delete_Account_button() {
		deleteAccountInformationPage=userHomePage.header.clickOnDeleteAccount();
	   
	}

	@Then("You must Verify that {string} is visible")
	public void you_must_Verify_that_is_visible(String deleteMessage) {
		softAssert.assertEquals(deleteAccountInformationPage.getDeleteMessage(), deleteMessage);
		
	  
	}

	@And("user clicks on Continue button")
	public void user_clicks_on_Continue_button() {
		deleteAccountInformationPage.clickOncontinueButton();
	   
	}

}
