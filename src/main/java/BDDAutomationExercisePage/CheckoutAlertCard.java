package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.CheckoutAlertCardLocators;

public class CheckoutAlertCard extends BasePage{
	
	CheckoutAlertCardLocators checkoutAlertCardLocators;
	
	public CheckoutAlertCard() {
		checkoutAlertCardLocators=new CheckoutAlertCardLocators();
		PageFactory.initElements(driver, checkoutAlertCardLocators);
	

	}
	public SignupLoginPage clickOnRegisterLoginButton() {
		clickOn(checkoutAlertCardLocators.registerLoginButton);
		return new SignupLoginPage();
	}
}