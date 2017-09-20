package src.com.baufest.functions.login;

import org.openqa.selenium.By;
import src.com.baufest.initialize.InitializeMethods;
import src.com.baufest.main.MainClass;

import java.io.IOException;

/**
 * Created by miguel on 19/9/17.
 */
public class LoginFunctions extends MainClass {

    public void LoginSuccessful(String userName, String password) throws Exception {

        elements.ElementsType(this.initializeDriver.getDriver(), By.id(config.GetLocators("correo")), "send_key", userName);
        actionsReport.infoTest(config.GetMessageProperties("login.user"));

        elements.ElementsType(this.initializeDriver.getDriver(), By.id(config.GetLocators("password")), "send_key", password);
        actionsReport.infoTest(config.GetMessageProperties("login.password"));

        elements.ElementsType(this.initializeDriver.getDriver(), By.cssSelector(config.GetLocators("button.acceder")), "click");
        actionsReport.infoTest(config.GetMessageProperties("login.button.acceder"));

        assertionsType.equals(this.initializeDriver.getDriver(), By.xpath(config.GetLocators("header.text")), "Administrador Gestor de Citas");
        actionsReport.infoTest(config.GetMessageProperties("login.validation"));
    }
}
