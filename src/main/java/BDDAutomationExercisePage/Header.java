package BDDAutomationExercisePage;

import java.util.logging.Level;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.HeaderLocators1;
import BDDAutomationExerciseProjectLocators.HeaderLocators2;
import BDDAutomationExerciseProjectLocators.HeaderLocators3;

public class Header extends BasePage{
	HeaderLocators1 headerLocators1;
	HeaderLocators2 headerLocators2;
	HeaderLocators3 headerLocators3;
	
	public Header() {
		headerLocators1=new HeaderLocators1();
		headerLocators2=new HeaderLocators2();
		headerLocators3=null;
		
		PageFactory.initElements(driver, headerLocators1);
		PageFactory.initElements(driver, headerLocators2);
	}
	public Header(String userConnected) {
		headerLocators1=new HeaderLocators1();
		headerLocators2=null;
		headerLocators3=new HeaderLocators3();
		
		PageFactory.initElements(driver, headerLocators1);
		PageFactory.initElements(driver, headerLocators3);
		
		logger.log(Level.INFO,"A Header of connected user is instanciated");
		
	}
	
	public boolean HomeLinkIsvisible() {
		return isDisplayed(headerLocators1.HomeLink);
	}
	public boolean signupLoginLinkIsVisible() {
		return isDisplayed(headerLocators2.signupLoginLink);
	}
	public SignupLoginPage clickOnSigupLoginLink() {
		clickOn(headerLocators2.signupLoginLink);
		return new SignupLoginPage();
	}
	public String getLoggedInMessage() {
		return headerLocators3.loggedInAs.getText();
						
	}
	public DeleteAccountInformationPage clickOnDeleteAccount() {
		clickOn(headerLocators3.deleteAccountLink);
		return new DeleteAccountInformationPage();
		
	}
	
	public void clickOnLogout() {
		clickOn(headerLocators3.logoutLink);
		
	}
	public void clickOnContactUsLink() {
		clickOn(headerLocators1.ContactusLink);
	}
	
	public ProductsPage clickOnProductsLink() {
		clickOn(headerLocators1.ProductsLink);
		return new ProductsPage();
		
	}
	public CartPage clickOnCartLink() {
		clickOn(headerLocators1.CartLink);
		return new CartPage();
	}
	
	
	
	
	
	
}