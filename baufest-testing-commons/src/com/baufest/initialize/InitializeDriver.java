package src.com.baufest.initialize;

import org.apache.xpath.operations.Bool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import src.com.baufest.core.ReadFiles.GetXMLfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by miguel on 17/9/17.
 */
public class InitializeDriver {

    private GetXMLfile getXMLfile = new GetXMLfile();
    boolean firefox = false;
    WebDriver driver;

    public void StartBrowser() throws IOException, InterruptedException {

        if (firefox == true) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/baufest-testing-commons/resources/FirefoxDriver/geckodriver.exe");
            driver = new FirefoxDriver();

        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/baufest-testing-commons/resources/ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        setDriver(driver);
        driver.get(getXMLfile.GetConfigProperties("url"));
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15000,TimeUnit.MILLISECONDS);

    }
    public void EndBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
