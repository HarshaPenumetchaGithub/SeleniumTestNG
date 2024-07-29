package com.hyd.utilities;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporters {

	public static ExtentReports extentReports;

	public void Reports() {
		extentReports = new ExtentReports();
		extentReports.setSystemInfo("os", System.getProperty("os.name"));
		extentReports.attachReporter(CreateSparkReporter(".\\TestReports\\TestReport.html"));
	}

	public ExtentSparkReporter CreateSparkReporter(String filePath) {
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(filePath);

		// Report Configurations
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setDocumentTitle(filePath);
		extentSparkReporter.config().setEncoding("utf-8");
		extentSparkReporter.config().setReportName("Selenium TestNG Report");

		return extentSparkReporter;
	}

	public void GenerateReport() {
		extentReports.flush();
	}

	public void ViewTestReport() throws Exception {
		try {
			Desktop.getDesktop().browse(new File(".\\TestReports\\TestReport.html").toURI());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}