package src.com.baufest.testcases.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import src.com.baufest.functions.login.FuncLogin;
import src.com.baufest.pages.home.HomePage;
import src.com.baufest.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import src.com.baufest.core.ReadFiles.GetXMLfile;

public class test4 {

    static WebDriver driver;
    GetXMLfile getXMLfile = new GetXMLfile();
    HomePage HomePage;
    LoginPage LoginPage;


    @BeforeMethod
    public void beforeMethod() throws IOException {

        System.setProperty("webdriver.chrome.driver", "baufest-testing-commons/resources/ChromeDriver/mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");

    }

    @Test
    public void test() throws Exception {
        FuncLogin funcLogin = new FuncLogin(driver);
        HomePage = PageFactory.initElements(driver, HomePage.class);

        HomePage.myAccount.click();
        funcLogin.LoginSuccessful("testuser_1", "Test@123");
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        HomePage.myAccount.click();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}