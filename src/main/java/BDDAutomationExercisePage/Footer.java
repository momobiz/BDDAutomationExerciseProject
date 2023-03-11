package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.FooterLocators;

public class Footer extends BasePage{
	
	FooterLocators footerLocators; 
	
	public Footer() {
		footerLocators=new FooterLocators();
		PageFactory.initElements(driver, footerLocators);
	}
	

	public String getSubscriptionMessage() {
		return footerLocators.subscriptionMessage.getText();
	}
	public void subscribe(String email) {
		fillIn(footerLocators.subscriptionInput, email);
		clickOn(footerLocators.subscriptionButton);
	}
	
	public String getAlertSuccessMessage() {
		String alertMessage="";
		if(isDisplayed(footerLocators.alertSuccessMessage)) {
			alertMessage=footerLocators.alertSuccessMessage.getText();
			
		}
		return alertMessage;
	}

}
