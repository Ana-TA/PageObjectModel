package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class HomePage extends SeleniumWrappers{

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	public By logoLink = By.xpath("//img[@class='desktop-logo hide-mobile']");
	public By searchField = By.xpath("//input[@id='dgwt-wcas-search-input-1']");

}
