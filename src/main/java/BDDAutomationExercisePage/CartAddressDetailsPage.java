package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.CartAddressDetailsPageLocators;

public class CartAddressDetailsPage extends BasePage{
	
	CartAddressDetailsPageLocators cartAddressDetailsPageLocators;
	
	public CartAddressDetailsPage() {
		cartAddressDetailsPageLocators=new CartAddressDetailsPageLocators();
		PageFactory.initElements(driver, cartAddressDetailsPageLocators);
	}
	
	public boolean addressDetailsIsDisplayed() {
		return isDisplayed(cartAddressDetailsPageLocators.addressDetails);
	}

}
