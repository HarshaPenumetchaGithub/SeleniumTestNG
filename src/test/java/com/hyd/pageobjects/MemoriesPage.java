package com.hyd.pageobjects;

import com.hyd.utilities.*;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

public class MemoriesPage extends Helpers {

	public By MemoriesPageHeader = By.xpath("//h1[contains(text(), 'Memories')]");

	public void verifyMemoriesPageHeader() {
		assertTrue(verifyElementDisplayed(MemoriesPageHeader));
	}
}
