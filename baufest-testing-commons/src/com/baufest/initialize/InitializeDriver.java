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
    private static WebDriver driver = null;


    public void StartBrowser() throws IOException, InterruptedException {

        String browser = getXMLfile.GetConfigProperties("browser");
        String os = getXMLfile.GetConfigProperties("os");

        if (browser.equals("firefox")) {
            switch (os) {
                case "win":
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + getXMLfile.GetProperties("firefox.win"));
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + getXMLfile.GetProperties("firefox.mac"));
                    driver = new FirefoxDriver();
                    break;
            }
        } else {
            switch (os) {
                case "win":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + getXMLfile.GetProperties("chrome.win"));
                    driver = new ChromeDriver();
                    break;
                default:

                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + getXMLfile.GetProperties("chrome.mac"));
                    driver = new ChromeDriver();
                    break;
            }
        }
            setDriver(driver);
            driver.get(getXMLfile.GetConfigProperties("url"));
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        }

    public void EndBrowser() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


}
