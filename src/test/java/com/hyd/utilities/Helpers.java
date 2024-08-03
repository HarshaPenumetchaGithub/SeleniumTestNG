package com.hyd.utilities;

import com.hyd.base.*;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers extends Initialization {

	private WebDriverWait wait;

	public Helpers() {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	public void click(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).click();
	}

	public void sendKeys(By element, String message) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(message);
	}

	public void verifyTitle(String title) {
		if (!title.equals("")) {
			wait.until(ExpectedConditions.titleContains(title));
			assertEquals(driver.getTitle(), title);
		} else
			System.err.println("The title is empty");
	}

	public boolean verifyElementDisplayed(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		return driver.findElement(element).isDisplayed();
	}
}