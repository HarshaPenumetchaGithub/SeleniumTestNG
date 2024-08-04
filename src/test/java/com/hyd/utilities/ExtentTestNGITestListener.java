package com.hyd.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGITestListener implements ITestListener{
	
	private static String filePath = ".\\TestReports\\TestReport.html";
	private static ExtentReports extent = Reporters.Reports(filePath);
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	
	@Override
	public synchronized void onStart(ITestContext context) {
	}
	
	@Override
	public synchronized void onFinish(ITestContext context) {
		extent.flush();
		Reporters.ViewTestReport(filePath);
	}
	
	@Override 
	public synchronized void onTestStart(ITestResult result) {
		ExtentTest tmpTest = extent.createTest(result.getMethod().getMethodName());
		tmpTest.assignAuthor("Harshavardhan Penumetcha");
		test.set(tmpTest);
	}
	
	@Override 
	public synchronized void onTestSuccess(ITestResult result) {
		((ExtentTest)test.get()).pass("Test Passed");
	}
	
	@Override
	public synchronized void onTestFailure(ITestResult result) {
		((ExtentTest)test.get()).fail(result.getThrowable());
	}
	
	@Override
	public synchronized void onTestSkipped(ITestResult result) {
		((ExtentTest)test.get()).skip(result.getThrowable());
	}

}
