package BDDAutomationExerciseProjectLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPageLocators {
	
	/****************************************************/
	/************ Signup Formular locators **************/
	/****************************************************/
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'New User Signup!')]")
	public WebElement signupMessage;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='text']")
	public WebElement signupNameInput;
	
	@CacheLookup
	@FindBy(xpath="//form[@action='/signup']//input[@type='email']")
	public WebElement signupEmailInput;
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	public WebElement signupButton;
	/*******************************************************/
	/*****************Login formular Locators **************/
	/*******************************************************/
		
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Login to your account')]")
	public WebElement loginMessage;
	
	@CacheLookup
	@FindBy(xpath="//form[@action='/login']//input[@type='email']")
	public WebElement loginEmailInput;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='password']")
	public WebElement loginPasswordInput;
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Login')]")
	public WebElement loginButton;
	
	/*******************************************************/
	/************     Login with invalid credentials  *******/
	/*******************************************************/
	
	@CacheLookup
	@FindBy(xpath="//p[@style='color: red;']")
	public WebElement InvalidLoginMessage;
	

	/*******************************************************/
	/************    Registration with an existing credentials  *******/
	/*******************************************************/
	
	
	@CacheLookup
	@FindBy(xpath="//p[@style='color: red;']")
	public WebElement emailAlreadyExistMessage;
	
	
	
	
}
