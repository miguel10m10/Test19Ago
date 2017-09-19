package src.com.baufest.testcases.module_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import src.com.baufest.main.MainClass;
import src.com.baufest.core.Exceptions.ActionExceptions;


public class login extends MainClass {

    @Test(dataProvider="Login")
    public void Test1(String testCaseName, String userName, String password) throws Exception {
        try {
            actionsReport.startTest(testCaseName, testCaseName, "Login", "Miguel Dalessio", testCaseName);

            elements.ElementsType(this.initializeDriver.getDriver(), By.id(config.GetLocators("cuit")), "send_key", userName);
            actionsReport.infoTest(config.GetMessageProperties("login.user"));

            elements.ElementsType(this.initializeDriver.getDriver(), By.id(config.GetLocators("password")), "send_key", password);
            actionsReport.infoTest(config.GetMessageProperties("login.password"));

            elements.ElementsType(this.initializeDriver.getDriver(), By.xpath(config.GetLocators("button.acceder")), "click");
            actionsReport.infoTest(config.GetMessageProperties("login.button.acceder"));

            assertionsType.equals(this.initializeDriver.getDriver(), By.xpath(config.GetLocators("header.text")), "Escritorio Único");
            actionsReport.infoTest(config.GetMessageProperties("login.validation"));

        } catch (ActionExceptions e) {
            throw new ActionExceptions();
        }
    }
}