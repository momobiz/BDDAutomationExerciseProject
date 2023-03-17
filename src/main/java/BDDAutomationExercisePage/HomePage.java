package BDDAutomationExercisePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ContactUsPageLocators;
import BDDAutomationExerciseProjectLocators.HomePageLocators;
import BDDAutomationExerciseProjectLocators.TestCasesPageLocators;

public class HomePage extends BasePage {

	public Header header;
	public HomePageLocators homePageLocators;
	public Footer footer;
	List<ProductCard> productCardList;
	public SideBar sideBar;
	
	public ProductsPage productsCategory;
	

	public HomePage() {
		String url = (String) prop.get("urlHomePage");
		openUrl(url);
		header = new Header();
		homePageLocators = new HomePageLocators();
		PageFactory.initElements(driver, homePageLocators);
		footer = new Footer();

		productCardList = setListProductsCard(homePageLocators.listOfProductCardLocator);
		sideBar=new SideBar();
		

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

	private List<ProductCard> setListProductsCard(List<WebElement> listOfLocators) {
		ProductCard productCard;
		List<ProductCard> productCardList = new ArrayList<ProductCard>();
		for (WebElement locator : listOfLocators) {
			productCard = new ProductCard(locator);
			productCardList.add(productCard);

		}
		return productCardList;

	}

	public ProductDetailsPage clickOnViewProduct(String numberOfProduct) {
		   ProductCard productCard=productCardList.get(Integer.valueOf(numberOfProduct)-1);
		   
			scrollToWebElement(productCard.productCardWebElement);
			moveToWebElement(productCard.productCardWebElement);
			productCard.clickOnViewProductButton();
			return new ProductDetailsPage();
	}
	
	private AlertCard selectProductToAdd(String productNumber) {
		
		ProductCard productCard=productCardList.get(Integer.valueOf(productNumber)-1);
		scrollToWebElement(productCard.productCardWebElement);
		moveToWebElement(productCard.productCardWebElement);
        return  productCard.clickOnAddProductToCart();
 	
	}
	public void addProductToCart(String productNumber) {
		AlertCard alertCard=selectProductToAdd(productNumber);
		alertCard.clickOnContinueShoopingButton();
		
		
	}
	public CartPage addProductAndOpenCart(String productNumber) {
		AlertCard alertCard=selectProductToAdd(productNumber);
		return alertCard.clickOnViewCartLink();
		
	}
	/******** side bar    *******/
	public boolean isSideBarDisplayed() {
		scrollToWebElement(sideBar.sideBarLocators.category);
		return sideBar.categoryIsDisplayed();
	}
	
	public void chooseCategory(String category ) {
		sideBar.selectCategory(category.toLowerCase());
	}
	public void chooseSubCategory(String category,String subCategory) {
		productsCategory=sideBar.selectSubCategory(category.toLowerCase(), subCategory.toLowerCase());
	}
	public String getCategoryOfChoosenProducts() {
		return productsCategory.getPageProductsTitle();
	}
	
	
	

	
	
	
	

}
