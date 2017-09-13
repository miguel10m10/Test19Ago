package tests.testCases;


import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import utils.Report.ExtentTestManager;
import tests.MainTest;

public class Test3 extends MainTest {
    @Test
    public void parallelClass2TestResultMustEqualFail() throws Exception {


        ExtentTestManager.getTest().log(LogStatus.SKIP, "Log from threadId: " + Thread.currentThread().getId());
        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
    }
}
