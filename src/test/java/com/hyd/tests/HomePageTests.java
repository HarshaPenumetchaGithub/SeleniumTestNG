package com.hyd.tests;

import com.hyd.base.*;
import com.hyd.pageobjects.*;

import org.testng.annotations.*;

public class HomePageTests extends Initialization {

	LoginPage loginPage;
	HomePage homePage;
	FriendsPage friendsPage;
	MemoriesPage memoriesPage;
	SavedPage savedPage;

	@Parameters("browserName")
	@BeforeMethod
	public void initialize(String browserName) {
		setup(browserName);
		loginPage = new LoginPage();
		homePage = new HomePage();
		friendsPage = new FriendsPage();
		memoriesPage = new MemoriesPage();
		savedPage = new SavedPage();
	}

	@AfterMethod
	public void closure() {
		teardown();

		// calling garbage collector
		System.gc();
	}

	@Test(priority = 1, groups = { "smoke", "regression" })
	public void verifyHomePageTitle() {
		loginPage.Login(username, password);
		homePage.verifyHomePageTitle();
	}

	@Test(priority = 2, groups = { "regression" })
	public void verifyNavigationToFriends() {
		loginPage.Login(username, password);
		homePage.navigateToFriends();
		friendsPage.verifyFriendsPageTitle();
	}

	@Test(priority = 3, groups = { "regression" })
	public void verifyNavigationToMemories() {
		loginPage.Login(username, password);
		homePage.navigateToMemories();
		memoriesPage.verifyMemoriesPageHeader();
	}

	@Test(priority = 4, groups = { "regression" })
	public void verifyNavigationToSaved() {
		loginPage.Login(username, password);
		homePage.navigateToSaved();
		savedPage.verifySavedPageTitle();
	}
}