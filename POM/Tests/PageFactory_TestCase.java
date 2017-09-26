package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import PageFactory.HomePage;
import PageFactory.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import src.com.baufest.core.ReadFiles.GetXMLfile;

public class PageFactory_TestCase {

    static WebDriver driver;
    GetXMLfile getXMLfile = new GetXMLfile();
    HomePage HomePage;
    LoginPage LoginPage;

    @BeforeMethod
    public void beforeMethod() throws IOException {

        System.setProperty("webdriver.chrome.driver", "baufest-testing-commons/resources/ChromeDriver/win/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        HomePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage = PageFactory.initElements(driver, LoginPage.class);

    }

    @Test
    public void test() {

        HomePage.lnk_MyAccount.click();
        LoginPage.LogIn_Action("testuser_1", "Test@123");
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        HomePage.lnk_LogOut.click();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}