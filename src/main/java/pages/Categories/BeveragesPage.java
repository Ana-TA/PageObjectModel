package pages.Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BeveragesPage extends SeleniumWrappers{

	public BeveragesPage(WebDriver driver) {
		super(driver);
	}
	
	public By lemonadeLink = By.xpath("//a[@href='https://keyfood.ro/product/zevia-kidz-strawberry-lemonade-zero-calorie-soda/' and @title='Zevia Kidz Strawberry Lemonade Zero Calorie Soda']");

}
