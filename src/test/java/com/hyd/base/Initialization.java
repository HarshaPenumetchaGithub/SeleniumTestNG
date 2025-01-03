package com.hyd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hyd.utilities.Reporters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialization extends Reporters {

	public static WebDriver driver;

	public String username = "harsha_chanti37@yahoo.co.in";
	public String password = "";

	public void setup(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-notifications");
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Invalid Browser Name");
			break;
		}

		//driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	public void teardown() {
		driver.quit();
	}
}