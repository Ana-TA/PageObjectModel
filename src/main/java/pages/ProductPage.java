package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ProductPage extends SeleniumWrappers{

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public By addToCartButton = By.xpath("//button[@type='submit' and @name='add-to-cart']");
	public By confirmSuccessAddedMsg = By.xpath("(//div[@class='woocommerce-message']/text())[1]");
	public By viewCartButton = By.xpath("(//a[@class='button wc-forward'  and text()='View cart'])[2]");
	
	public String partialSuccessAddedString = "has been added to your cart.";

}
