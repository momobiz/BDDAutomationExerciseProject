package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.AlertCardLocators;

public class AlertCard extends BasePage{
	
	AlertCardLocators alertCardLocators;
	
	public AlertCard() {
		alertCardLocators=new AlertCardLocators();
		PageFactory.initElements(driver, alertCardLocators);
	}
	
	public void clickOnContinueShoopingButton() {
		if(isDisplayed(alertCardLocators.continueShoppingButton)) {
			clickOn(alertCardLocators.continueShoppingButton);
		}
		
		
	}
	public void clickOnViewCartLink() {
		if(isDisplayed(alertCardLocators.viewCartLink)) {
		alertCardLocators.viewCartLink.click();
		}
	}
	

}
