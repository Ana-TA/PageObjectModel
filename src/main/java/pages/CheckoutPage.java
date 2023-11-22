package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public By firstNameField = By.xpath("//input[@id='billing_first_name']");
	public By lastNameField = By.xpath("//input[@id='billing_last_name']");
	public By countryDropdown = By.id("billing_country");
	public By streetField = By.xpath("//input[@name='billing_address_1']");
	public By cityField = By.xpath("//input[@name='billing_city']");
	public By stateDropdown = By.id("select2-billing_state-container");
	public By postcodeField = By.xpath("//input[@name='billing_postcode']");
	public By phoneField = By.xpath("//input[@type='tel']");
	public By emailField = By.xpath("//input[@type='email' and @name='billing_email']");
	
	public By placeOrderButton = By.xpath("//button[@type='submit' and @name='woocommerce_checkout_place_order']");
	public By agreeTermsCheckbox = By.xpath("//input[@type='checkbox' and @class='woocommerce-form__input woocommerce-form__input-checkbox input-checkbox']");

}
