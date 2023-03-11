package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ContactUsPageLocators;

public class ContactUsPage extends BasePage{
	
	ContactUsPageLocators  contactUsPageLocators;
	Header header;
	
	public ContactUsPage() {
		contactUsPageLocators=new ContactUsPageLocators();
		header=new Header();
		PageFactory.initElements(driver, contactUsPageLocators);
	}
	public boolean inTouchMessageIsVisible() {
		return isDisplayed(contactUsPageLocators.getInTouchMessage);
	}
	public String getInTouchMessage() {
	
		return contactUsPageLocators.getInTouchMessage.getText();
	}
	
	public void fillInName(String nameValue) {
		fillIn(contactUsPageLocators.nameInput, nameValue);
		
	}
	public void fillInEmail(String emailValue) {
		fillIn(contactUsPageLocators.emailInput, emailValue);
	}
	public void fillInSubject(String subjectValue) {
		fillIn(contactUsPageLocators.subjectInput, subjectValue);
	}
	public void fillInText(String text) {
		fillIn(contactUsPageLocators.messageInput, text);
	}
	public void uploadNewFile(String path) {
		uploadFile(contactUsPageLocators.uploadFile,System.getProperty("user.dir")+path);
	}
	public void clickOnSubmitButton() {
		clickOn(contactUsPageLocators.submitButtonContactUs);
	}
	public void clickOnAlertButton() {
		clickOnOkAlertButton();
	}
	//********************************
	public String getAlertSuccessMessage() {
		return contactUsPageLocators.alertSuccessMessage.getText();
	}
	public HomePage clickOnHomeButton() {
		clickOn(contactUsPageLocators.homeButton);
		return new HomePage();
	}
	
	

}
