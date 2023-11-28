package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class WishlistPage extends SeleniumWrappers{

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	public By selectAllCheckbox = By.xpath("//input[@title='Select all for bulk action']");
	public By actionDropdown = By.id("tinvwl_product_actions");
	public By applyActionButton = By.xpath("//button[@class='button tinvwl-break-input tinvwl-break-checkbox']");
	
	public By productNotAddedMsg = By.xpath("//li[contains(text(), 'could not be added to cart because some requirements are not met.')]");

}
