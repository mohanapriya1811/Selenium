package utils;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
public class Reporter{
		
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("");
	}
}
