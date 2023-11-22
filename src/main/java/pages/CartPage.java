package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public By quantityPlusButton = By.xpath("//div[@class='quantity-button plus']");
	public By currentPrice = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[7]");
	public By checkoutButton = By.xpath("//a[@href='https://keyfood.ro/checkout-2/' and @class='checkout-button button alt wc-forward']");

}
