package UTILITY;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.asserts.Assertion;

import java.io.IOException;

public class Listerners implements ITestListener {


    @Override
    public void onTestSuccess(ITestResult result) {
      result.getName();
        Reporter.log("test case is pass,passed test case name is="+result.getName(),true);

    }

    @Override
    public void onTestFailure(ITestResult result) {
        String name = result.getName();
        Reporter.log("test case is fail,failed test case name is="+name,true);
        try {
            Utility.captureScreenShot(name);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporter.log("test case will be skipped skipped test case name will be="+result.getName(),true);
    }
}
