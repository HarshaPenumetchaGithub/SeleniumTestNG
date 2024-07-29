package com.hyd.pageobjects;

import com.hyd.utilities.*;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

public class SavedPage extends Helpers{
	
	public By savePageHeader = By.xpath("//h1[contains(text(), 'Saved')]");
		
	public void verifySavedPageTitle() {
		verifyTitle("Saved | Facebook");
	}
	
	public void verifySavedPageHeader() {
		assertTrue(verifyElementDisplayed(savePageHeader));
	}
}
