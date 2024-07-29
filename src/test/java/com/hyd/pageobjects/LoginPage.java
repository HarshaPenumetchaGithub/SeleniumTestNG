package com.hyd.pageobjects;

import com.hyd.utilities.*;

import org.openqa.selenium.By;

public class LoginPage extends Helpers {

	public By inputUsername = By.xpath("//input[@id='email']");
	public By inputPassword = By.xpath("//input[@id='pass']");
	public By buttonLogin = By.xpath("//button[@name='login']");

	public void Login(String username, String password) {
		click(inputUsername);
		sendKeys(inputUsername, username);
		click(inputPassword);
		sendKeys(inputPassword, password);
		click(buttonLogin);
	}
}