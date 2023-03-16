package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentDetailsPageLocators {
	
	 @CacheLookup
	 @FindBy(xpath="//div[@class='col-sm-12 form-group']//input[@type='text']")
	 public WebElement nameOnCardInput;
	 
	 
	 @CacheLookup
	 @FindBy(xpath="//div[@class='col-sm-12 form-group card']//input[@type='text']")
	 public WebElement cardNumberInput;
	 
	 @CacheLookup
	 @FindBy(xpath="//div[@class='col-sm-4 form-group cvc']//input[@type='text']")
	 public WebElement cvcInput;
	 
	 @CacheLookup
	 @FindBy(xpath="//input[@name='expiry_month']")
	 public WebElement expiredMonthInput;
	 
	 @CacheLookup
	 @FindBy(xpath="//input[@name='expiry_year']")
	 public WebElement expiredYearInput;
	 
	 @CacheLookup
	 @FindBy(id="submit")
	 public WebElement payAndConfirmButton;
	 
	 @CacheLookup
	 @FindBy(css="#success_message > div:nth-child(1)")
	 public WebElement successPaymentMessage;
	 

}
