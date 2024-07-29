package com.hyd.pageobjects;

import com.hyd.utilities.*;

import org.openqa.selenium.By;

public class HomePage extends Helpers{
	
	//Left Panel
	public By Friends = By.xpath("//span[contains(text(), 'Friends')]");
	public By Memories = By.xpath("//span[contains(text(), 'Memories')]");
	public By Saved = By.xpath("//span[contains(text(), 'Saved')]");
	public By Groups = By.xpath("//span[contains(text(), 'Groups')]");
	public By Video = By.xpath("//span[contains(text(), 'Video')]");
	public By Marketplace = By.xpath("//span[contains(text(), 'Marketplace')]");
	public By SeeMore = By.xpath("//span[contains(text(), 'See more')]");
	
	//User Profile Menu
	public By userprofile = By.xpath("//svg[@aria-label='Your profile']");
	public By userProfileSettings = By.xpath("//span[contains(text(), 'Settings & privacy')]");
	public By userProfileSupport = By.xpath("//span[contains(text(), 'Help & support')]");
	public By userProfileDisplay = By.xpath("//span[contains(text(), 'Display & accessibility')]");
	public By userprofileFeedback = By.xpath("//span[contains(text(), 'Give feedback')]");
	public By userProfileLogout = By.xpath("//span[contains(text(), 'Log out')]");
	
	public void verifyHomePageTitle() {
		verifyTitle("Facebook");
	}
	
	public void Logout() {
		click(userprofile);
		click(userProfileLogout);
	}
	
	public void navigateToFriends() {
		click(Friends);
	}
	
	public void navigateToMemories() {
		click(Memories);
	}
	
	public void navigateToSaved() {
		click(Saved);
	}
	
	public void navigateToGroups() {
		click(Groups);
	}
	
	public void navigateToVideo() {
		click(Video);
	}
}