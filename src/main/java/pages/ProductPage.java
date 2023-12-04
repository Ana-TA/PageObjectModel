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
	public By addToWishlist = By.xpath("(//div[@class='tinv-wraper woocommerce tinv-wishlist tinvwl-shortcode-add-to-cart'])[1]");
	
	public By closeWishListButton = By.xpath("//button[@class='button tinvwl_button_close']");
	public By viewWishListButton = By.xpath("//button[@class='button tinvwl_button_view tinvwl-btn-onclick']");
	
	public String partialSuccessAddedString = "has been added to your cart.";
	
	public void addProductToWishlist(By categoryLocator, By productLocator) {
		click(categoryLocator);
		click(productLocator);
		scrollVertically(300);
		click(addToWishlist);
		click(closeWishListButton);
		scrollVertically(-300);
		driver.get("https://keyfood.ro/");
	}

}
