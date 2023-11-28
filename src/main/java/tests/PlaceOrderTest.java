package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.ah.A;

import utils.BaseTest;

public class PlaceOrderTest extends BaseTest{
	
	@DataProvider(name="productsResultListDataProvider")
	public Object[][] productsResultListDataProvider() {
		
		Object[][] data = new Object[1][3];
		
		data[0][0] = "coconut";
		data[0][1] = "/fresh-brown-coconut/";
		data[0][2] = "Fresh Brown Coconut";
		
		return data;
	}
	
	
	@Parameters({"user", "pass"})
	@Test(priority=1)
	public void stepIntoMyAccount(String user, String pass) throws IOException {
		
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp(user, pass);
		assertTrue(app.elementIsDisplayed(app.myAccount.succesMsg));
	}
	
	@Test(priority=2, dataProvider = "productsResultListDataProvider")
	public void searchProductAndBuy(String product, String partialUrl, String title) {
		
		app.click(app.home.logoLink);
		app.sendKeys(app.home.searchField, product, true);
		
		app.scrollVertically(500);
		By coconutLinkLocator = By.xpath("//a[@href='" + app.searchResults.partialProductLink + partialUrl +"' and @title='" + title + "']");
		
		app.click(coconutLinkLocator);
		assertEquals(app.driver.getCurrentUrl(), app.searchResults.partialProductLink + partialUrl);
		
		app.click(app.product.addToCartButton);
		WebElement confirmAddedMsg = app.returnWebElement(By.xpath("//div[@class='woocommerce-message']"));
		String AddToCarttext = confirmAddedMsg.getText().substring(10, confirmAddedMsg.getText().length());
		assertEquals(AddToCarttext, "“" + title + "” " + app.product.partialSuccessAddedString);
		
		app.click(app.product.viewCartButton);
		WebElement element = app.returnWebElement(app.cart.currentPrice);
		String currentPrice = element.getText();
		app.click(app.cart.quantityPlusButton);
		String newPrice = element.getText();
		assertTrue(newPrice != currentPrice);
		
		app.click(app.cart.checkoutButton);
		app.sendKeys(app.checkout.firstNameField, "firstName", false);
		app.sendKeys(app.checkout.lastNameField, "lastName", false);
		app.filterByValue(app.checkout.countryDropdown, "RO");
		app.sendKeys(app.checkout.streetField, "street", false);
		app.sendKeys(app.checkout.cityField, "Los Angeles", false);
		app.filterByValue(app.checkout.stateDropdown, "B");
		app.sendKeys(app.checkout.postcodeField, "90006", false);
		app.sendKeys(app.checkout.phoneField, "077777777", false);
		app.sendKeys(app.checkout.emailField, "test@test.com", false);
		app.click(app.checkout.agreeTermsCheckbox);
		app.click(app.checkout.placeOrderButton);

		WebElement msg = app.returnWebElement(By.xpath("//li[@class='woocommerce-order-overview__order order']"));
		String[] msgList = msg.getText().split(": ");
		System.out.println(msgList[1]);
		assertTrue(msgList[1] != "");
	}
	

}
