package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class SearchResultsPage extends SeleniumWrappers{

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public By coconutProductLink = By.xpath("(//a[@href='https://keyfood.ro/product/fresh-brown-coconut/'])[1]");
	
	public String partialProductLink =  "https://keyfood.ro/product";
	
	

}
