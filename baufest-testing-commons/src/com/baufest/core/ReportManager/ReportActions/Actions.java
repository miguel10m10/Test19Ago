package src.com.baufest.core.ReportManager.ReportActions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import src.com.baufest.core.Enums.Log4jType;
import src.com.baufest.core.ReportManager.ExtentManager;
import src.com.baufest.core.ReportManager.TakeScreenShot.TakeScreenShot;
import src.com.baufest.core.logger.Log4jActions;
import src.com.baufest.core.ReportManager.ExtentTestManager;
import src.com.baufest.initialize.InitializeDriver;

import java.io.IOException;

/**
 * Created by miguel on 2/9/17.
 */
public class Actions extends InitializeDriver{

    InitializeDriver driver = new InitializeDriver();
    TakeScreenShot screenShot = new TakeScreenShot();
    Log4jActions log4j = new Log4jActions();

    public void startTest(String name, String description, String category, String author, String message) throws IOException {
        ExtentTestManager.startTest(name, description);
        ExtentTestManager.getTest().assignCategory(category);
        ExtentTestManager.getTest().assignAuthor(author);
        log4j.Log4jActions(">>>>> | Nombre del caso de prueba: "+name, Log4jType.INFO.element());
        log4j.Log4jActions(">>>>> | Autor de Caso de prueba : "+author, Log4jType.INFO.element());
        log4j.Log4jActions("", Log4jType.NEXT.element());
    }
    public void infoTest(String message) throws IOException {
        ExtentTestManager.getTest().log(LogStatus.INFO, message);
        log4j.Log4jActions(message, Log4jType.INFO.element());
    }
    public void skipTest(String message) throws IOException {
        ExtentTestManager.getTest().log(LogStatus.SKIP, message);
        log4j.Log4jActions(message, Log4jType.INFO.element());
        log4j.Log4jActions("", Log4jType.NEXT.element());
    }
    public void passTest(String message) throws IOException {
        ExtentTestManager.getTest().log(LogStatus.PASS, message);
        log4j.Log4jActions(message, Log4jType.INFO.element());
        log4j.Log4jActions("", Log4jType.NEXT.element());
    }
    public void failTest(String message) throws IOException {
        ExtentTestManager.getTest().log(LogStatus.FAIL, message);
        log4j.Log4jActions(message, Log4jType.ERROR.element());
        log4j.Log4jActions("", Log4jType.NEXT.element());
    }
    public void failWithScreenShot(String message) throws Exception {
        ExtentTestManager.getTest().log(LogStatus.ERROR, ExtentTestManager.getTest().addScreenCapture(screenShot.getScreenshot(driver.getDriver(), message)));
        log4j.Log4jActions(message, Log4jType.ERROR.element());
        log4j.Log4jActions("", Log4jType.NEXT.element());
        throw new Exception(message);
    }
    public void passWithScreenShot( String message) throws Exception {
        ExtentTestManager.getTest().log(LogStatus.PASS, ExtentTestManager.getTest().addScreenCapture(screenShot.getScreenshot(driver.getDriver(), message)));
        log4j.Log4jActions(message, Log4jType.INFO.element());
        log4j.Log4jActions("", Log4jType.NEXT.element());
    }
 /*   public void AssertPassTest(String message){
        //log4j.Log4jActions(message, "info");
        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
    }
    public void AssertFailTest(String message) throws Exception {
        //log4j.Log4jActions(message, "info");
        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.FAIL);
        throw new Exception("intentional failure");
    }*/
    public void endTest() throws IOException {

        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
        ExtentManager.getReporter().flush();
        log4j.Log4jActions(">>>>> | Escribiendo en el Reporte [HTML]", Log4jType.INFO.element());
    }

}
