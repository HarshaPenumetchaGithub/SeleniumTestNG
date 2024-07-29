package com.hyd.tests;

import com.hyd.base.*;
import com.hyd.pageobjects.*;

import org.testng.annotations.*;

public class FriendsPageTests extends Initialization {
	
	LoginPage loginPage;
	HomePage homePage;
	FriendsPage friendsPage;
	
	@Parameters("browserName")
	@BeforeMethod
	public void initialize(String browserName) {
		setup(browserName);
		loginPage = new LoginPage();
		homePage = new HomePage();
		friendsPage = new FriendsPage();
	}
	
	@AfterMethod
	public void closure() {
		teardown();
		
		//Calling garbage collector
		System.gc();
	}
	
	@Test(groups = {"smoke", "regression"})
	public void verifyFriendsPageTitle() {
		loginPage.Login(username, password);
		homePage.verifyHomePageTitle();
		homePage.navigateToFriends();
		friendsPage.verifyFriendsPageTitle();
	}
}
