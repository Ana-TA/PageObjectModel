package pages.Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BreakfastAndDairyPage extends SeleniumWrappers{

	public BreakfastAndDairyPage(WebDriver driver) {
		super(driver);
	}
	
	public By blueberriesLink = By.xpath("//a[@href='https://keyfood.ro/product/blueberries-1-pint-package/' and @title='Blueberries – 1 Pint Package']");

}
