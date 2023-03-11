package BDDAutomationExerciseProjectLocators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HeaderLocators3 {
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	public WebElement logoutLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Delete Account')]")
	public WebElement deleteAccountLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Logged in as')]")
	public WebElement loggedInAs;
	
	
	
	
	
	

}
