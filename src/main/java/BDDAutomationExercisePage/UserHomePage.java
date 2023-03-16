package BDDAutomationExercisePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.UserHomePageLocators;

public class UserHomePage extends BasePage{
	public Header header;
	public UserHomePageLocators userHomePageLocators;
	public List<ProductCard> productCardList;
	
	public UserHomePage() {
		header=new Header("user is connected");
		userHomePageLocators=new UserHomePageLocators();
		PageFactory.initElements(driver, userHomePageLocators);
		
		productCardList = setListProductsCard(userHomePageLocators.listOfProductCardLocator);
		
	}
	public HomePage logout() {
		header.clickOnLogout();
		return new HomePage();
	}
	public CartPage clickOnCartLink() {
		return header.clickOnCartLink("userConnected");
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
		return alertCard.clickOnViewCartLink("userConnected");
		
	}
	
	
	
	
	

}
