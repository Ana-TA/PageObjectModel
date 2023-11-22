package pages;

import org.openqa.selenium.WebDriver;

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

}
