package pages.Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BreadsAndBakeryPage extends SeleniumWrappers{

	public BreadsAndBakeryPage(WebDriver driver) {
		super(driver);
	}
	
	public By frenchCroissantLink = By.xpath("//a[@href='https://keyfood.ro/product/100-butter-french-croissants/' and @title='100% Butter French Croissants']");

}
