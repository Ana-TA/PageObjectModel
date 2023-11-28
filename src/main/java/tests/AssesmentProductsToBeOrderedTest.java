package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class AssesmentProductsToBeOrderedTest extends BaseTest{
		
	@Parameters({"user", "pass"})
	@Test(priority=1)
	public void stepIntoMyAccount(String user, String pass) throws IOException {
		
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp(user, pass);
		assertTrue(app.elementIsDisplayed(app.myAccount.succesMsg));
	}
	
	@Test(priority=2)
	public void assesmentProducts() {
		
		app.click(app.home.logoLink);
		
		app.addProductToWishlist(app.home.fruitsCategoryLink, app.fruitsAndVegetables.bananasLink, app.product.addToWishlist, app.product.closeWishListButton, app.home.logoLink);
		app.addProductToWishlist(app.home.breakfastCategoryLink, app.breakfast.blueberriesLink, app.product.addToWishlist, app.product.closeWishListButton, app.home.logoLink);
		app.addProductToWishlist(app.home.beveragesCategoryLink, app.beverages.lemonadeLink, app.product.addToWishlist, app.product.closeWishListButton, app.home.logoLink);
		app.addProductToWishlist(app.home.breadsCategoryLink, app.breads.frenchCroissantLink, app.product.addToWishlist, app.product.closeWishListButton, app.home.logoLink);
	
		app.click(app.menu.wishlistLink);
		app.scrollVertically(200);
		
		List<String> productsNameList = new ArrayList<>();
		productsNameList.add("Blueberries - 1 Pint Package");
		productsNameList.add("Zevia Kidz Strawberry Lemonade Zero Calorie Soda");
		productsNameList.add("Fresh Cavendish Bananas");
		productsNameList.add("100% Butter French Croissants");
		
		String[] partialProductsLink = {"100-butter-french-croissants", "zevia-kidz-strawberry-lemonade-zero-calorie-soda", "blueberries-1-pint-package", "fresh-cavendish-bananas"};
		
		for (int i = 0; i < partialProductsLink.length; i++)
		{
			WebElement currentElement = driver.findElement(By.xpath("//td[@class='product-name']/a[contains(@href,'" +partialProductsLink[i] + "')]"));
			System.out.println(currentElement.getText());
			assertTrue(productsNameList.contains(currentElement.getText()));
		}
		
		app.click(app.wishlist.selectAllCheckbox);
		app.filterByValue(app.wishlist.actionDropdown, "add_selected");
		app.click(app.wishlist.applyActionButton);
		
		assertTrue(app.elementIsDisplayed(app.wishlist.productNotAddedMsg));
		WebElement iconCartCount = driver.findElement(app.menu.cartCountIcon);
		assertEquals(iconCartCount.getText(), "3");
		
	}
}
