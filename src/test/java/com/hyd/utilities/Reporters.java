package com.hyd.utilities;

import com.hyd.base.Initialization;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporters {

	private static ExtentReports extentReports;

	public static ExtentReports Reports(String filePath) {
		if (extentReports == null) {
			extentReports = new ExtentReports();
			extentReports.setSystemInfo("os", System.getProperty("os.name"));
			extentReports.attachReporter(CreateSparkReporter(filePath));
		}
		return extentReports;
	}

	public static ExtentSparkReporter CreateSparkReporter(String filePath) {
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(filePath);

		// Report Configurations
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setDocumentTitle(filePath);
		extentSparkReporter.config().setEncoding("utf-8");
		extentSparkReporter.config().setReportName("Selenium TestNG Report");

		return extentSparkReporter;
	}

	public static void GenerateReport() {
		extentReports.flush();
	}

	public static void ViewTestReport(String filePath) {
		try {
			Desktop.getDesktop().browse(new File(filePath).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String captureScreenshot(String fileName) {
		File sourceFile = ((TakesScreenshot)Initialization.driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destFile.getAbsolutePath();
	}
}