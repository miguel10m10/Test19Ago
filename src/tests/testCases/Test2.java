package tests.testCases;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Elements.ElementsType;
import utils.Report.ExtentTestManager;
import tests.MainTest;

public class Test2 extends MainTest {

    ElementsType elements = new ElementsType();

    @Test
    public void parallelClass2TestResultMustEqualFail() throws Exception {



        elements.ElementsType(this.getDriver(), By.id("account"), "send_key", "ve225414");
        elements.ElementsType(this.getDriver(), By.id("password"), "send_key", "miguel20");

        ExtentTestManager.getTest().log(LogStatus.FAIL, "Log from threadId: " + Thread.currentThread().getId());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());

        throw new Exception("intentional failure");
    }
}
