package src.com.baufest.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
    public WebElement myAccount;

    @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
    public WebElement logout;

}