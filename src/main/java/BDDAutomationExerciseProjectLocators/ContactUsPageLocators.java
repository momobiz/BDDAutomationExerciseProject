package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Get In Touch')]")
	public WebElement getInTouchMessage;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='form-group col-md-6']//input[@type='text']")
	public WebElement nameInput;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='form-group col-md-6']//input[@type='email']")
	public WebElement emailInput;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='form-group col-md-12']//input[@type='text']")
	public WebElement subjectInput;
	
	@CacheLookup
	@FindBy(xpath="//textarea[@id='message']")
	public WebElement messageInput;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='file']")
	public WebElement uploadFile;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitButtonContactUs;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='status alert alert-success']")
	public WebElement alertSuccessMessage;
	
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Home')]")
	public WebElement homeButton;
	
	

}
