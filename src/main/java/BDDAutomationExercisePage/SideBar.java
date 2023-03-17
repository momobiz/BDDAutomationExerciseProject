package BDDAutomationExercisePage;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.SideBarLocators;

public class SideBar extends BasePage{
	
	SideBarLocators sideBarLocators;
	
	public SideBar() {
		sideBarLocators=new SideBarLocators();
		PageFactory.initElements(driver, sideBarLocators);
	}
	public boolean categoryIsDisplayed() {
		return isDisplayed(sideBarLocators.category);
		
	}
	public void selectCategory(String category) {
		switch(category) {
		    case "men": {
		    	clickOn(sideBarLocators.menCategoryButton);
		    	break;
		    }case "women":{
		    	clickOn(sideBarLocators.womenCategoryButton);
		    	break;
		    }case "kids":{
		    	clickOn(sideBarLocators.kidsCategoryButton);
		    	break;
		    }default:
		    	System.out.println("choose a category among women, men or kids"); 	
		 }
	}
	
	public ProductsPage selectSubCategory(String category, String subCategory) {
		ProductsPage productsPage=null;
		
		
		switch(category) {
			case "men":{
				switch(subCategory) {
					case "tshirts":{
						clickOn(sideBarLocators.tshirtsMenButton);
						productsPage=new ProductsPage();
						break;
					}case "jeans":{
						clickOn(sideBarLocators.jeansMenButton);
						productsPage=new ProductsPage();
						break;
					}
				}
				
			break;
			}case "women":{
				switch(subCategory) {
				case "dress":{
					clickOn(sideBarLocators.dressWomenButton);
					productsPage=new ProductsPage();
					break;
				}case "tops":{
					clickOn(sideBarLocators.topsWomenButton);
					productsPage=new ProductsPage();
					break;
				}case "saree":{
					clickOn(sideBarLocators.sareeWomenButton);
					productsPage=new ProductsPage();
					break;
				}
			}
				
				
				break;
			}case "kids":{
				switch(subCategory) {
					case "dress":{
						clickOn(sideBarLocators.dressKidsButton);
						productsPage=new ProductsPage();
						break;
					}case "tops&tshirts":{
						clickOn(sideBarLocators.topstshirtsKidsButton);
						productsPage=new ProductsPage();
						break;
					}
			}
				
				break;
			}
		
		}
		
		
		
		return productsPage;
		
	}
	
	

}
