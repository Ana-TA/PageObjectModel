package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;

import utils.BaseTest;
import utils.ScreenShots;

public class LoginTest extends BaseTest{
	
	@Parameters({"user", "pass"})
	@Test(priority=1)
	public void validLogin(String user, String pass) throws IOException {
		
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp(user, pass);
		assertTrue(app.elementIsDisplayed(app.myAccount.succesMsg));
		ScreenShots.screenshot(driver);
		app.click(app.myAccount.logoutButton);
	}
	
	@Test(priority=2)
	public void invalidLogin() {
		
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp("usergresit", "passgresit");
		assertTrue(app.elementIsDisplayed(app.myAccount.errorMsg));
		
	}

}
