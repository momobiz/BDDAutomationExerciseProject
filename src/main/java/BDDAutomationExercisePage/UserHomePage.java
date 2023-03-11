package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.UserHomePageLocators;

public class UserHomePage extends BasePage{
	public Header header;
	public UserHomePageLocators userHomePageLocators;
	
	public UserHomePage() {
		header=new Header("user is connected");
		userHomePageLocators=new UserHomePageLocators();
		PageFactory.initElements(driver, userHomePageLocators);
	}
	public HomePage logout() {
		header.clickOnLogout();
		return new HomePage();
	}
	
	
	
	
	

}
