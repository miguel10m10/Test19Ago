package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.Assertions.AssertionsType;
import utils.Elements.ElementsType;
import utils.Log4j.Log4jActions;
import utils.ReadFiles.GetExcelFile;
import utils.Report.Actions;
import utils.Report.BaseClass;
import utils.ReadFiles.GetXMLfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest extends BaseClass {

    protected GetXMLfile config = new GetXMLfile();
    protected ElementsType elements = new ElementsType();
    protected Actions actionsReport = new Actions();
    protected AssertionsType assertionsType = new AssertionsType();
    protected GetExcelFile getData = new GetExcelFile();

    boolean firefox = false;
    WebDriver driver;

    @DataProvider(name="Login")
    public Object[][] loginData() {
        Object[][] arrayObject = getData.getExcelData("src/tests/testCases/Module_1/login.xls","Hoja1");
        return arrayObject;
    }

    @BeforeMethod
    public void BeforeMethod() throws InterruptedException, IOException {

        if (firefox == true) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

        } else {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        setDriver(driver);
        driver.get(config.GetConfigProperties("url"));
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        //
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