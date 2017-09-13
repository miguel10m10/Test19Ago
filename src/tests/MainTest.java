package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.Report.BaseClass;
import utils.ReadFiles.GetXMLfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest extends BaseClass {

    GetXMLfile config = new GetXMLfile();

    boolean firefox = false;
    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod() throws InterruptedException, IOException {


        if (firefox == true) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
            driver = new FirefoxDriver();

        } else {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            driver = new ChromeDriver();
        }

        setDriver(driver);
        driver.get(config.GetConfigProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    }

    @AfterMethod
    public void AfterMethod() throws InterruptedException {

        driver.quit();
    }

    @AfterSuite
    public void AfterSuite(){
       // sendEmail.sendGmailEmail();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}