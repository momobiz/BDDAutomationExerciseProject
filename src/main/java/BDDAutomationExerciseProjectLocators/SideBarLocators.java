package BDDAutomationExerciseProjectLocators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SideBarLocators {
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Category')]")
	public WebElement category;
	
	@CacheLookup
	@FindBy(xpath="//div[@id='accordian']/div/div/h4/a[@href='#Women']")
	public WebElement womenCategoryButton;
	
	@CacheLookup
	@FindBy(xpath="//div[@id='accordian']/div[2]/div/h4/a[@href='#Men']")
	public WebElement menCategoryButton;
	
	@CacheLookup
	@FindBy(xpath="//div[@id='accordian']/div[3]/div/h4/a[@href='#Kids']")
	public WebElement kidsCategoryButton;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Tshirts')]")
	public WebElement tshirtsMenButton;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Jeans')]")
	public WebElement jeansMenButton;
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/category_products/1' and contains(text(),'Dress')]")
	public WebElement dressWomenButton;
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/category_products/2' and contains(text(),'Tops')]")
	public WebElement topsWomenButton;
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/category_products/7' and contains(text(),'Saree')]")
	public WebElement sareeWomenButton;
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/category_products/4' and contains(text(),'Dress')]")
	public WebElement dressKidsButton;
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/category_products/5' and contains(text(),'Tops & Shirts')]")
	public WebElement topstshirtsKidsButton;
	

}
