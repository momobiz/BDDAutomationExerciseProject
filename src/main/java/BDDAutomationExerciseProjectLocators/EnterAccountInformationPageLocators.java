package BDDAutomationExerciseProjectLocators;

import java.util.List;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class EnterAccountInformationPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//b[contains(text(),'Enter Account Information')]")
	public WebElement enterAccountInformationMessage;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='radio']")
	public List<WebElement> TitleRadioButton;
	
	@CacheLookup
	@FindBy(id="name")
	public WebElement NameInput;
	
	@CacheLookup
	@FindBy(id="password")
	public WebElement passwordInput;
	
	@CacheLookup
	@FindBy(id="days")
	public WebElement daysDropdown;
	
	@CacheLookup
	@FindBy(id="months")
	public WebElement monthsDropdown;
	
	@CacheLookup
	@FindBy(id="years")
	public WebElement yearsDropdown;
	
	@CacheLookup
	@FindBy(id="newsletter")
	public WebElement newslettersCheckbox;
	
	@CacheLookup
	@FindBy(id="optin")
	public WebElement specialOffersCheckbox;
	
	@CacheLookup
	@FindBy(id="first_name")
	public WebElement firstnameInput;
	
	@CacheLookup
	@FindBy(id="last_name")
	public WebElement lastnameInput;
	
	@CacheLookup
	@FindBy(id="company")
	public WebElement companyInput;
	
	@CacheLookup
	@FindBy(id="address1")
	public WebElement addressInput;
	
	@CacheLookup
	@FindBy(id="address2")
	public WebElement address2Input;
	
	@CacheLookup
	@FindBy(id="country")
	public WebElement countryDropdown;
	
	@CacheLookup
	@FindBy(id="state")
	public WebElement stateInput;
	
	@CacheLookup
	@FindBy(id="city")
	public WebElement cityInput;
	
	@CacheLookup
	@FindBy(id="zipcode")
	public WebElement zipcodeInput;
	
	@CacheLookup
	@FindBy(id="mobile_number")
	public WebElement mobileNumberInput;
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Create Account')]")
	public WebElement createaccountButton;
	
	
	
	
	

}
