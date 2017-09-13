package tests.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.ReadFiles.GetXMLfile;
import utils.Report.Actions;
import tests.MainTest;
import utils.Elements.ElementsType;
import utils.Assertions.AssertionsType;

public class Test1 extends MainTest {

    ElementsType elements = new ElementsType();
    Actions actionsReport = new Actions();
    AssertionsType assertionsType = new AssertionsType();
    GetXMLfile getXMLfile = new GetXMLfile();

    @Test
    public void Test1() throws Exception {

        actionsReport.startTest("Login Successful", "Login Successful", "Login", "Miguel Dalessio", "Login Successful");

        elements.ElementsType(this.getDriver(), By.xpath(".//*[@id='login']/div/input[1]"), "send_key", "miguel10m");
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.user"));

        elements.ElementsType(this.getDriver(), By.xpath(".//*[@id='login']/div/input[2]"), "send_key", "miguel20");
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.password"));

        elements.ElementsType(this.getDriver(),By.xpath(".//*[@id='login']/button"), "click");
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.button"));

        assertionsType.equals(this.getDriver(), By.xpath(".//*[@id='top']/div[1]/div[2]/div/div/div[3]/ul[2]/li[1]/h5/span"), "MIGUEL ANGEL D ALESSIO MURO");
        actionsReport.infoTest(getXMLfile.GetMessageProperties("marcadores.login.validation"));

    }
}
