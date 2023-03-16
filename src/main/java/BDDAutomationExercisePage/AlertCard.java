package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BDDAutomationExerciseProjectLocators.AlertCardLocators;

public class AlertCard extends BasePage{
	
	AlertCardLocators alertCardLocators;
	
	public AlertCard() {
		alertCardLocators=new AlertCardLocators();
		PageFactory.initElements(driver, alertCardLocators);
	}
	
	public void clickOnContinueShoopingButton() {
		try {
			wait.until(ExpectedConditions.visibilityOf(alertCardLocators.continueShoppingButton));
			clickOn(alertCardLocators.continueShoppingButton);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public CartPage clickOnViewCartLink() {	
		CartPage cartPage=null;
		
		try {
			wait.until(ExpectedConditions.visibilityOf(alertCardLocators.viewCartLink));
			clickOn(alertCardLocators.viewCartLink);
			cartPage=new CartPage();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			return cartPage;
	
	}
	
	public CartPage clickOnViewCartLink(String userConnected) {	
		CartPage cartPage=null;
		
		try {
			wait.until(ExpectedConditions.visibilityOf(alertCardLocators.viewCartLink));
			clickOn(alertCardLocators.viewCartLink);
			cartPage=new CartPage("userConnected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			return cartPage;
	
	}


}
