package src.com.baufest.core.ReportManager.ReportActions;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import src.com.baufest.core.ReportManager.TakeScreenShot.TakeScreenShot;
import src.com.baufest.core.logger.Log4jActions;
import src.com.baufest.core.ReportManager.ExtentTestManager;
import src.com.baufest.initialize.InitializeDriver;

/**
 * Created by miguel on 2/9/17.
 */
public class Actions extends InitializeDriver{

    TakeScreenShot screenShot = new TakeScreenShot();
    Log4jActions log4j = new Log4jActions();

    public void startTest(String name, String description, String category, String author, String message){
        ExtentTestManager.startTest(name, description);
        ExtentTestManager.getTest().assignCategory(category);
        ExtentTestManager.getTest().assignAuthor(author);
    }
    public void infoTest(String message){
        ExtentTestManager.getTest().log(LogStatus.INFO, message);
        log4j.Log4jActions(message, "info");
    }
    public void skipTest(String message){
        ExtentTestManager.getTest().log(LogStatus.SKIP, message);
        log4j.Log4jActions(message, "info");
    }
    public void passTest(String message){
        ExtentTestManager.getTest().log(LogStatus.PASS, message);
        log4j.Log4jActions(message, "info");
    }
    public void failTest(String message){
        ExtentTestManager.getTest().log(LogStatus.FAIL, message);
        log4j.Log4jActions(message, "error");
    }
    public void failWithScreenShot(String message) throws Exception {
    //    ExtentTestManager.getTest().log(LogStatus.ERROR, ExtentTestManager.getTest().addScreenCapture(screenShot.getScreenshot(this.driver, message)));
        log4j.Log4jActions(message, "error");
        throw new Exception(message);
    }
    public void passWithScreenShot( String message) throws Exception {
   //     ExtentTestManager.getTest().log(LogStatus.PASS, ExtentTestManager.getTest().addScreenCapture(screenShot.getScreenshot(this.driver, message)));
        log4j.Log4jActions(message, "info");
    }
    public void AssertPassTest(String message){
        log4j.Log4jActions(message, "info");
        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
    }
    public void AssertFailTest(String message) throws Exception {
        log4j.Log4jActions(message, "info");
        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.FAIL);
        throw new Exception("intentional failure");
    }

}
