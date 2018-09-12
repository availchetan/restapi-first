/*package Utils;

import com.mycompany.app.BasicTC1Test;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
 
public class Listener extends BasicTC1Test implements ITestListener {
 
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

	
    
    //Before starting all tests, below method runs.
   public void onStart(ITestContext iTestContext) {
        System.out.println("I am in on Start method " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", this.driver);
    }
 
    //After ending all tests, below method runs.
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in on Finish method " + iTestContext.getName());
        //Do tier down operations for extentreports reporting!
      //  ExtentTestManager.endTest();
        //ExtentManager.getReporter().flush();
    }
 
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am in on TestStart method " +  getTestMethodName(iTestResult) + " start");
        //Start operation for extentreports.
      //  ExtentTestManager.startTest(iTestResult.getMethod().getMethodName(),"");
    }
 
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I am in on TestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
        //Extentreports log operation for passed tests.
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
        Object testClass = iTestResult.getInstance();
        WebDriver webDriver = ((BasicTC1Test) testClass).getDriver();
        super.testTakesScreenshot(webDriver);
    }
 
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in on Test Failure method " +  getTestMethodName(iTestResult) + " failed");
 
        //Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver webDriver = ((BasicTC1Test) testClass).getDriver();
 
        //Take base64Screenshot screenshot.
      //  String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).
        //        getScreenshotAs(OutputType.BASE64);
               super.testTakesScreenshot(webDriver);
        //Extentreports log and screenshot operations for failed tests.
             //  String base64Screenshot = "data:image/png;base64,";
       // ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
               // ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
    }
 
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("I am in on TestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
        //Extentreports log operation for skipped tests.
       // ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }
 
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
 
}*/