package src.com.baufest.functions.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import src.com.baufest.pages.login.LoginPage;

/**
 * Created by miguel on 19/9/17.
 */
public class FuncLogin {

    static private LoginPage LoginPage;
    static private WebDriver driver;

    public FuncLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginSuccessful(String userName, String password) throws Exception {

        LoginPage = PageFactory.initElements(driver, LoginPage.class);

        LoginPage.userName.sendKeys(userName);
        // actionsReport.infoTest(config.GetMessageProperties("login.user"));

        LoginPage.password.sendKeys(password);
        // actionsReport.infoTest(config.GetMessageProperties("login.password"));

        LoginPage.buttonLogin.click();
        // actionsReport.infoTest(config.GetMessageProperties("login.button.acceder"));

        //assertionsType.AssertValidation(By.xpath(config.GetLocators("header.text")), "Administrador Gestor de Citas", AssertType.ASSERT_EQUALS.element());
        //actionsReport.infoTest(config.GetMessageProperties("login.validation"));
    }
}
