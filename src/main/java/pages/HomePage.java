package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class HomePage extends SeleniumWrappers{

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	public By logoLink = By.xpath("//img[@class='desktop-logo hide-mobile']");
	public By searchField = By.xpath("//input[@id='dgwt-wcas-search-input-1']");
	public By fruitsCategoryLink = By.xpath("(//li[@class='category-parent  menu-item menu-item-type-taxonomy menu-item-object-product_cat'])[1]");
	public By breakfastCategoryLink = By.xpath("(//li[@class='category-parent  menu-item menu-item-type-taxonomy menu-item-object-product_cat'])[3]");
	public By beveragesCategoryLink = By.xpath("(//li[@class='category-parent  menu-item menu-item-type-taxonomy menu-item-object-product_cat'])[4]");
	public By breadsCategoryLink = By.xpath("(//li[@class='category-parent  menu-item menu-item-type-taxonomy menu-item-object-product_cat'])[5]");
}
