package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	public By myAccountLink = By.linkText("My account");
	public By wishlistLink =  By.linkText("Wishlist");
	
	public By cartCountIcon = By.xpath("//span[@class='cart-count-icon']");

}
