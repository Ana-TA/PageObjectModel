package pages.Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class FruitsAndVegetablesPage extends SeleniumWrappers{

	public FruitsAndVegetablesPage(WebDriver driver) {
		super(driver);
	}
	
	public By bananasLink = By.xpath("//a[@href='https://keyfood.ro/product/fresh-cavendish-bananas/' and @title='Fresh Cavendish Bananas']");

}
