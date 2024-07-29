package com.hyd.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporters {
	ExtentReports extentReports = new ExtentReports();
	ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("");
}