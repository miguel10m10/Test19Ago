package src.com.baufest.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
    public WebElement myAccount;

    @FindBy(how = How.ID, using = "log")
    @CacheLookup
    public WebElement userName;

    @FindBy(how = How.ID, using = "pwd")
    @CacheLookup
    public WebElement password;

    @FindBy(how = How.NAME, using = "submit")
    public WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
    public WebElement logout;

}
