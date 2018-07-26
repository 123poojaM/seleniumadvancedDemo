package Utilitypackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener  {
	ExtentTest t;
	ExtentReports r;
	


	public void onTestFailure(ITestResult result) {
		t.log(LogStatus.FAIL, result.getMethod().getMethodName()+"has Failed");
		//System.out.println("Test Passed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
		t.log(LogStatus.PASS, result.getMethod().getMethodName()+"has passed");
		
	}

	public void onFinish(ITestContext arg0) {
		r.endTest(t);
		r.flush();
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	
	}

	public void onTestStart(ITestResult result) {
		t=r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO,"Test started");
		
	}

	public void onStart(ITestContext arg0) {
		r = new ExtentReports("C:\\Users\\pdc4-training.pdc4\\Desktop\\Pooja\\Framwork\\src\\test\\java\\Utilitypackage\\MyReport.html");
		
	}
	

}
