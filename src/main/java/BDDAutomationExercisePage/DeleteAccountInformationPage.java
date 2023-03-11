package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.DeleteAccountInformationPageLocators;

public class DeleteAccountInformationPage extends BasePage {
	
	DeleteAccountInformationPageLocators deleteAccountInformationPageLocators;
	Header header;
	
	public DeleteAccountInformationPage() {
		header=new Header();
		deleteAccountInformationPageLocators=new DeleteAccountInformationPageLocators();
		PageFactory.initElements(driver, deleteAccountInformationPageLocators);
	}
	
	public String getDeleteMessage() {
		return deleteAccountInformationPageLocators.accountDeletedMessage.getText();
		
	}
	public HomePage clickOncontinueButton() {
		clickOn(deleteAccountInformationPageLocators.continueButton);
		return new HomePage();
	}
	

}
