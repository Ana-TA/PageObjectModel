package pages;

import org.openqa.selenium.WebDriver;

import pages.Categories.BeveragesPage;
import pages.Categories.BreadsAndBakeryPage;
import pages.Categories.BreakfastAndDairyPage;
import pages.Categories.FruitsAndVegetablesPage;
import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu = new MenuPage(driver);
	public MyAccountPage myAccount =  new MyAccountPage(driver);
	public HomePage home = new HomePage(driver);
	public SearchResultsPage searchResults = new SearchResultsPage(driver);
	public ProductPage product = new ProductPage(driver);
	public CartPage cart = new CartPage(driver);
	public CheckoutPage checkout = new CheckoutPage(driver);
	public WishlistPage wishlist = new WishlistPage(driver);
	
	public FruitsAndVegetablesPage fruitsAndVegetables = new FruitsAndVegetablesPage(driver);
	public BreakfastAndDairyPage breakfast = new BreakfastAndDairyPage(driver);
	public BeveragesPage beverages = new BeveragesPage(driver);
	public BreadsAndBakeryPage breads = new BreadsAndBakeryPage(driver);

}
