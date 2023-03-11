package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HeaderLocators1 {
	
	// Locators for common header (when use is connected or disconnected)
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement HomeLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Products')]")
	public WebElement ProductsLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	public WebElement CartLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Test Cases')]")
	public WebElement TestCasesLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'API Testing')]")
	public WebElement APITestingLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Video Tutorials')]")
	public WebElement videoTutorialsLink;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Contact us')]")
	public WebElement ContactusLink;
	

}
