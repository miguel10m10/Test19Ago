package src.com.baufest.functions.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.Enums.AssertType;
import src.com.baufest.core.Enums.ElementType;
import src.com.baufest.initialize.InitializeMethods;

/**
 * Created by miguel on 19/9/17.
 */
public class Login extends InitializeMethods{


    public void LoginSuccessful(WebDriver driver, String userName, String password) throws Exception {

        elements.ElementsType(driver, By.id(config.GetLocators("correo")), ElementType.SEND_KEY.element(), userName);
        // actionsReport.infoTest(config.GetMessageProperties("login.user"));

        elements.ElementsType(driver, By.id(config.GetLocators("password")), ElementType.SEND_KEY.element(), password);
        // actionsReport.infoTest(config.GetMessageProperties("login.password"));

        elements.ElementsType(driver, By.xpath(config.GetLocators("button.acceder")), ElementType.CLICK.element());
        // actionsReport.infoTest(config.GetMessageProperties("login.button.acceder"));

        assertionsType.AssertValidation(driver, By.xpath(config.GetLocators("header.text")), "Administrador Gestor de Citas", AssertType.ASSERT_EQUALS.element());
        //actionsReport.infoTest(config.GetMessageProperties("login.validation"));

    }

}
