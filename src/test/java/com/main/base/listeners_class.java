package com.main.base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listeners_class extends base_class implements ITestListener{

	ExtentSparkReporter create_report;
	ExtentReports create_Test;
	ExtentTest create_log;
	
	public void setup_Report()
	{
		create_report=new ExtentSparkReporter("testNG_Report1.html");
		create_Test=new ExtentReports();
		create_Test.attachReporter(create_report);
		
		create_Test.setSystemInfo("OperatingSystem", "Windows");
		create_Test.setSystemInfo("Browesr", "Chrome");
		create_Test.setSystemInfo("BrowesrVersion", "181.91.22.01");
		create_Test.setSystemInfo("MACAddress", "00-B0-D0-63-C2-26");
		create_Test.setSystemInfo("Environment", "Testing");
		create_Test.setSystemInfo("User Name", "Diwakar Agrawal");
		
		create_report.config().setDocumentTitle("my first report");
		create_report.config().setReportName("testcase");
		create_report.config().setTheme(Theme.DARK);
	}
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		create_log=create_Test.createTest(result.getName());
		create_log.log(Status.PASS,MarkupHelper.createLabel("Pass", ExtentColor.BLUE));
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		create_log=create_Test.createTest(result.getName());
		create_log.log(Status.FAIL, MarkupHelper.createLabel("FAIL", ExtentColor.GREY));
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		setup_Report();
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		create_Test.flush();
	}

}
