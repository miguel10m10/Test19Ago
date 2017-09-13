package tests.testCases;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.MainTest;
import utils.Assertions.AssertionsType;
import utils.Elements.ElementsType;
import utils.ReadFiles.GetExcelFile;
import utils.ReadFiles.GetXMLfile;
import utils.Report.Actions;
import utils.Report.ExtentTestManager;

public class ReadExcelDataProvider extends MainTest{

    ElementsType elements = new ElementsType();
    GetExcelFile getData = new GetExcelFile();
    AssertionsType assertionsType = new AssertionsType();
    GetXMLfile getXMLfile = new GetXMLfile();
    Actions actionsReport = new Actions();

    @Test(dataProvider="empLogin")
    public void VerifyInvalidLogin(String testCaseName, String userName, String password) throws Exception {

        actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", "Login Successful");

        elements.ElementsType(this.getDriver(), By.xpath(".//*[@id='login']/div/input[1]"), "send_key", userName);
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.user"));

        elements.ElementsType(this.getDriver(), By.xpath(".//*[@id='login']/div/input[2]"), "send_key", password);
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.password"));

        elements.ElementsType(this.getDriver(),By.xpath(".//*[@id='login']/button"), "click");
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.button"));

        assertionsType.equals(this.getDriver(), By.xpath(".//*[@id='top']/div[1]/div[2]/div/div/div[3]/ul[2]/li[1]/h5/span"), "MIGUEL ANGEL D ALESSIO MURO");
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.validation"));

    }

    @DataProvider(name="empLogin")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("Libro1.xls","Hoja1");
        return arrayObject;
    }
}