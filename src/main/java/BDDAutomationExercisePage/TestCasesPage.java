package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.TestCasesPageLocators;

public class TestCasesPage extends BasePage{
	
	TestCasesPageLocators testCasesPageLocators;
	Header header;
	
	public TestCasesPage() {
		testCasesPageLocators=new TestCasesPageLocators();
		header=new Header();
		PageFactory.initElements(driver, testCasesPageLocators);
	}
	
	public boolean testCasesMessageIsDisplayed() {
		return isDisplayed(testCasesPageLocators.testCaseMessage);
	}
	

}
