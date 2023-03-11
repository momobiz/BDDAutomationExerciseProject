package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.SignupLoginPageLocators;

public class SignupLoginPage extends BasePage{
	
	SignupLoginPageLocators signupLoginPageLocators;
	public Header header;
	
	public SignupLoginPage() {
		
		signupLoginPageLocators=new SignupLoginPageLocators();
		PageFactory.initElements(driver, signupLoginPageLocators);
		header=new Header();
	}
	
	public String getNewUserSignupMessage() {
		return signupLoginPageLocators.signupMessage.getText();
		
	}
	public void fillInName(String name) {
		fillIn(signupLoginPageLocators.signupNameInput,name);
	}
	public void fillInEmailforSignup(String email) {
		fillIn(signupLoginPageLocators.signupEmailInput, email);
	}
	public EnterAccountInformationPage clickOnSingupButton() {
		clickOn(signupLoginPageLocators.signupButton);
		return new EnterAccountInformationPage();
		
	}
	/**********************************/
	/*******   Login Methods  ***********/ 
	/**********************************/
	
	public String getLoginMessage() {
	   return signupLoginPageLocators.loginMessage.getText();
	}
	
	public void fillInLoginEmail(String emailValue) {
		fillIn(signupLoginPageLocators.loginEmailInput, emailValue);
	}
	public void fillInLoginPassword(String passwordValue) {
		fillIn(signupLoginPageLocators.loginPasswordInput, passwordValue);
	}
	public UserHomePage clickOnLoginButton() {
		clickOn(signupLoginPageLocators.loginButton);
		return new UserHomePage();
	}
	
	/**********************************************/
	/*   Login Methods with ivalid credentials ****/ 
	/**********************************************/
	
	public void  clickOnLoginButtonWhenInvalidCredentials() {
		clickOn(signupLoginPageLocators.loginButton);
		
	}
	public String getInvalidLoginMessage() {
		String invalidMessage="";
		try {
			// When we login with invalid credentials
			if(isDisplayed(signupLoginPageLocators.InvalidLoginMessage)) {
				invalidMessage=signupLoginPageLocators.InvalidLoginMessage.getText();
			
				// When we try to register with an existing email
			}else if(isDisplayed(signupLoginPageLocators.emailAlreadyExistMessage)) {
				invalidMessage=signupLoginPageLocators.emailAlreadyExistMessage.getText();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return invalidMessage;
		
	}
	
	
	

}
