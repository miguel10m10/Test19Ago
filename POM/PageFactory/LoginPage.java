package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
    static WebElement lnk_MyAccount;

    @FindBy(how = How.ID, using = "log")
    @CacheLookup
    static WebElement txtbx_UserName;

    @FindBy(how = How.ID, using = "pwd")
    @CacheLookup
    static WebElement txtbx_Password;

    @FindBy(how = How.NAME, using = "submit")
    static WebElement btn_Login;

    @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
    static WebElement lnk_LogOut;

    public void LogIn_Action(String sUserName, String sPassword){

        txtbx_UserName.sendKeys(sUserName);
        txtbx_Password.sendKeys(sPassword);
        btn_Login.click();
    }
    public void Logout(){

        lnk_LogOut.click();
    }


}
