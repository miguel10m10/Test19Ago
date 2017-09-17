package tests.testCases.Module_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Exceptions.ActionException;
import tests.MainTest;

public class Test1 extends MainTest {

    @Test(dataProvider="Login")
    public void Test1(String testCaseName, String userName, String password) throws Exception {
        try {
            actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);

            elements.ElementsType(this.getDriver(), By.id(config.GetLocators("cuit")), "send_key", userName);
            actionsReport.infoTest(config.GetMessageProperties("login.user"));

            elements.ElementsType(this.getDriver(), By.id(config.GetLocators("password")), "send_key", password);
            actionsReport.infoTest(config.GetMessageProperties("login.password"));

            elements.ElementsType(this.getDriver(), By.xpath(config.GetLocators("button.acceder")), "click");
            actionsReport.infoTest(config.GetMessageProperties("login.button.acceder"));

            assertionsType.equals(this.getDriver(), By.xpath(config.GetLocators("header.text")), "Escritorio Único");
            actionsReport.infoTest(config.GetMessageProperties("login.validation"));

        } catch (ActionException e) {
            throw new ActionException();
        }
    }
}
