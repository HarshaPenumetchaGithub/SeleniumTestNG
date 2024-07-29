package com.hyd.tests;

import com.hyd.pageobjects.*;
import com.hyd.base.*;

import org.testng.annotations.*;

public class LoginPageTests extends Initialization{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Parameters("browserName")
	@BeforeMethod
	public void initialize(String browserName) {
		setup(browserName);
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@AfterMethod
	public void closure() {
		teardown();
		
		//calling garbage collector
		System.gc();
	}
	
	@Test(priority = 1, groups = {"smoke", "regression"})
	public void verifyLoginPageTitle() {
		loginPage.verifyTitle("Facebook – log in or sign up");
	}
	
	@Test(dependsOnMethods = "verifyLoginPageTitle", priority = 2, groups = {"smoke", "regression"})
	public void verifyLogin() {
		loginPage.Login(username, password);
		homePage.verifyHomePageTitle();
	}
}