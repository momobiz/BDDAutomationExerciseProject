package BDDAutomationExerciseStep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.asserts.SoftAssert;

import BDDAutomationExercisePage.CartPage;
import BDDAutomationExercisePage.CongratulationsAccountSuccessfullyCreatedPage;
import BDDAutomationExercisePage.ContactUsPage;
import BDDAutomationExercisePage.DeleteAccountInformationPage;
import BDDAutomationExercisePage.EnterAccountInformationPage;
import BDDAutomationExercisePage.HomePage;
import BDDAutomationExercisePage.ProductDetailsPage;
import BDDAutomationExercisePage.ProductsPage;
import BDDAutomationExercisePage.SearchedProductsPage;
import BDDAutomationExercisePage.SignupLoginPage;
import BDDAutomationExercisePage.TestCasesPage;
import BDDAutomationExercisePage.UserHomePage;

public abstract class BaseStep {
	
	SoftAssert softAssert;
	static HomePage homePage;
	static SignupLoginPage signupLoginPage;
	static EnterAccountInformationPage enterAccountInformationPage;
	static CongratulationsAccountSuccessfullyCreatedPage congratulationsAccountSuccessfullyCreatedPage;
	static UserHomePage userHomePage;
	static DeleteAccountInformationPage deleteAccountInformationPage;
	static ContactUsPage contactUsPage;
	static TestCasesPage testCasesPage;
	static ProductsPage productsPage;
	static SearchedProductsPage searchedProductsPage;
	static ProductDetailsPage productDetailsPage;
	static CartPage cartPage;

	
	
	public BaseStep() {
		softAssert=new SoftAssert();
	}
	
	
	
	

}
