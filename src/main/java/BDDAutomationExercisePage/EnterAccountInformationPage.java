package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BDDAutomationExerciseProjectLocators.EnterAccountInformationPageLocators;

public class EnterAccountInformationPage extends BasePage{
	
	Header header;
	EnterAccountInformationPageLocators enterAccountInformationPageLocators;
	Footer footer;
	
	public EnterAccountInformationPage(){
		header=new Header();
		enterAccountInformationPageLocators=new EnterAccountInformationPageLocators();
		PageFactory.initElements(driver, enterAccountInformationPageLocators);
		footer=new Footer();
		
	}
	
	public String getEnterAccountInformationMessage() {
		try {
			wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(enterAccountInformationPageLocators.enterAccountInformationMessage));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return enterAccountInformationPageLocators.enterAccountInformationMessage.getText();
		
	}
	public void selectGender(String gender) {
		selectRadioButton(enterAccountInformationPageLocators.TitleRadioButton,toCamelCase(gender));
		
	}
	public void fillInName(String nameValue) {
		fillIn(enterAccountInformationPageLocators.NameInput, nameValue);
	}
	
	public void fillInPassword(String passwordValue) {
		fillIn(enterAccountInformationPageLocators.passwordInput, passwordValue);
	}
	public void selectDayOfBirth(String dayValue) {
		scrollDown(200);
		selectOption(enterAccountInformationPageLocators.daysDropdown, dayValue);
	}
	
	public void selectMonthOfBirth(String monthValue) {
		selectOption(enterAccountInformationPageLocators.monthsDropdown, monthValue);
	}
	public void selectYearOfBirth(String yearValue) {
		selectOption(enterAccountInformationPageLocators.yearsDropdown, yearValue);
	}
	
	public void selectNewsletter(String newsletterChoice) {
		Boolean choice=Boolean.valueOf(newsletterChoice);
		if(choice) {selectCheckbox(enterAccountInformationPageLocators.newslettersCheckbox);
		}else {
			deSelectCheckbox(enterAccountInformationPageLocators.newslettersCheckbox);
		}
	}
	public void selectSpecialOffers(String offersChoice) {
		Boolean choice=Boolean.valueOf(offersChoice);
		if(choice) {selectCheckbox(enterAccountInformationPageLocators.specialOffersCheckbox);
		}else {
			deSelectCheckbox(enterAccountInformationPageLocators.specialOffersCheckbox);
		}
	}
	public void fillInFirstname(String firstnameValue) {
		scrollDown(200);
		fillIn(enterAccountInformationPageLocators.firstnameInput, firstnameValue);
	}
	public void fillInLastname(String lastnameValue) {
		fillIn(enterAccountInformationPageLocators.lastnameInput, lastnameValue);
	}
	public void fillInCompany(String companyValue) {
		scrollDown(350);
		fillIn(enterAccountInformationPageLocators.companyInput, companyValue);
	}
	public void fillInAddress(String addressValue) {
		
		fillIn(enterAccountInformationPageLocators.addressInput, addressValue);
	}
	public void fillInAddress2(String address2Value) {
		fillIn(enterAccountInformationPageLocators.address2Input, address2Value);
		
	}
	public void selectCountry(String countryValue) {
		selectOption(enterAccountInformationPageLocators.countryDropdown, toCamelCase(countryValue));
		
	}
	
	public void fillInState(String stateValue) {
		fillIn(enterAccountInformationPageLocators.stateInput, stateValue);
	}
	public void fillInCity(String cityValue) {
		scrollDown(400);
		fillIn(enterAccountInformationPageLocators.cityInput, cityValue);
		
	}
	public void fillInZipcode(String zipcodeValue) {
		fillIn(enterAccountInformationPageLocators.zipcodeInput, zipcodeValue);
	}
	public void fillInMobileNumber(String phoneNumberValue) {		
		fillIn(enterAccountInformationPageLocators.mobileNumberInput, phoneNumberValue);
		
	}
	public CongratulationsAccountSuccessfullyCreatedPage clickOnCreateAccountButton() {
		
		scrollToWebElement(enterAccountInformationPageLocators.createaccountButton);
		clickOn(enterAccountInformationPageLocators.createaccountButton);		
		return new CongratulationsAccountSuccessfullyCreatedPage();
		
	 
	}
	
	
	

}
