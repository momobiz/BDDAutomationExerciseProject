package BDDAutomationExercisePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ContactUsPageLocators;
import BDDAutomationExerciseProjectLocators.HomePageLocators;
import BDDAutomationExerciseProjectLocators.TestCasesPageLocators;

public class HomePage extends BasePage {

	public Header header;
	public HomePageLocators homePageLocators;
	public Footer footer;

	public HomePage() {
		String url = (String) prop.get("urlHomePage");
		openUrl(url);
		header = new Header();
		homePageLocators = new HomePageLocators();
		PageFactory.initElements(driver, homePageLocators);
		footer = new Footer();

	}

	public ContactUsPage clickOnContactUsLink() {
		header.clickOnContactUsLink();
		return new ContactUsPage();
	}

	public TestCasesPage clickOnTestCaseButton() {
		for (WebElement testCasesButton : homePageLocators.testCasesButtons) {
			if (isDisplayed(testCasesButton))
				clickOn(testCasesButton);

		}

		return new TestCasesPage();
	}

	public void scrollDownToFooter() {
		scrollToWebElement(footer.footerLocators.subscriptionMessage);
	}

}
