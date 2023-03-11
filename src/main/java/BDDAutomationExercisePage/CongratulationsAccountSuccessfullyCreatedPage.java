package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.CongratulationsAccountSuccessfullyCreatedPageLocators;

public class CongratulationsAccountSuccessfullyCreatedPage extends BasePage{
	
	Header header;
	CongratulationsAccountSuccessfullyCreatedPageLocators congratulationsAccountSuccessfullyCreatedPageLocators;
	
	public CongratulationsAccountSuccessfullyCreatedPage() {
		header=new Header();
		congratulationsAccountSuccessfullyCreatedPageLocators=new CongratulationsAccountSuccessfullyCreatedPageLocators();
		PageFactory.initElements(driver, congratulationsAccountSuccessfullyCreatedPageLocators);
			
	}
	public String getAccountCreatedMessage() {
		return congratulationsAccountSuccessfullyCreatedPageLocators.accountCreatedMessage.getText();
	}
	
	public UserHomePage clickOnContinueButton() {
		clickOn(congratulationsAccountSuccessfullyCreatedPageLocators.continueButton);
		return new UserHomePage();
	}

}
