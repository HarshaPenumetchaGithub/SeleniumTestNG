package com.hyd.pageobjects;

import com.hyd.utilities.*;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

public class FriendsPage extends Helpers {
	
	//Left Pane
	public By friendsPageHeader = By.xpath("//h1[contains(text(), 'Friends')]");
	public By friendPageHome = By.xpath("//span[contains(text(), 'Home')]");
	public By friendRequests = By.xpath("//span[contains(text(), 'Friend requests')]");
	public By friendSuggestions = By.xpath("//span[contains(text(), 'Suggestions')]");
	public By allFriends = By.xpath("//span[contains(text(), 'All friends')]");
	public By birthdays = By.xpath("//span[contains(text(), 'Birthdays')]");
	public By customLists = By.xpath("//span[contains(text(), 'Custom lists')]");
		
	public void verifyFriendsPageTitle() {
		verifyTitle("Friends | Facebook");
	}
	
	public void verifyFriendsPageHeader() {
		assertTrue(verifyElementDisplayed(friendsPageHeader));
	}
	
	public void navigateToFriendsPageHome() {
		click(friendPageHome);
	}
	
	public void navigateToFriendRequests() {
		click(friendRequests);
	}
	
	public void navigateToFriendSuggestions() {
		click(friendSuggestions);
	}
	
	public void navigateToAllFriends() {
		click(allFriends);
	}
	
	public void navigateToFriendBirthdays() {
		click(birthdays);
	}
}
