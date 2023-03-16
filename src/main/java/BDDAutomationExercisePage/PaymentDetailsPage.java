package BDDAutomationExercisePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BDDAutomationExerciseProjectLocators.PaymentDetailsPageLocators;

public class PaymentDetailsPage extends BasePage{
	
	PaymentDetailsPageLocators paymentDetailsPageLocators;
	Header header;
	Footer footer;
	String successMessage="";
	public EventHandler eventHandler;

	
	public PaymentDetailsPage() {
		paymentDetailsPageLocators=new PaymentDetailsPageLocators();
		PageFactory.initElements(driver, paymentDetailsPageLocators);
		header=new Header("userConnected");
		footer=new Footer();
		eventHandler=new EventHandler();
	}
	
	public void fillInCardName(String nameOnCard) {
		fillIn(paymentDetailsPageLocators.nameOnCardInput, nameOnCard);
		
	}
	public void fillInCardNumber(String cardNumber) {
	  fillIn(paymentDetailsPageLocators.cardNumberInput, cardNumber);
	}
	public void fillInCvc(String cvc) {
		fillIn(paymentDetailsPageLocators.cvcInput, cvc);
	}
	public void fillInExpirationMonth(String month) {
		fillIn(paymentDetailsPageLocators.expiredMonthInput, month);
	}
	public void fillInExpirationYear(String year) {
		fillIn(paymentDetailsPageLocators.expiredYearInput, year);
	}
	public void clickOnPayAndConfirmButton() {
	
		eventHandler.afterClickOn(paymentDetailsPageLocators.payAndConfirmButton, driver);
		clickOn(paymentDetailsPageLocators.payAndConfirmButton);
			
	}



	
	

}
