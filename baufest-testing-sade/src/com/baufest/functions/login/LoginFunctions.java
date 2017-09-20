package src.com.baufest.functions.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.initialize.InitializeMethods;
import src.com.baufest.main.MainClass;

import java.io.IOException;

/**
 * Created by miguel on 19/9/17.
 */
public class LoginFunctions extends InitializeMethods{


    public void LoginSuccessful(WebDriver driver, String userName, String password) throws Exception {

        elements.ElementsType(driver, By.id(config.GetLocators("correo")), "send_key", userName);
       // actionsReport.infoTest(config.GetMessageProperties("login.user"));

        elements.ElementsType(driver, By.id(config.GetLocators("password")), "send_key", password);
       // actionsReport.infoTest(config.GetMessageProperties("login.password"));

        elements.ElementsType(driver, By.xpath(config.GetLocators("button.acceder")), "click");
       // actionsReport.infoTest(config.GetMessageProperties("login.button.acceder"));

        assertionsType.equals(driver, By.xpath(config.GetLocators("header.text")), "Administrador Gestor de Citas");
        //actionsReport.infoTest(config.GetMessageProperties("login.validation"));

    }

}
