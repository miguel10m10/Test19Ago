package src.com.baufest.core.ManageWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;
import src.com.baufest.initialize.InitializeDriver;
import src.com.baufest.main.MainClass;

/**
 * Created by miguel on 27/8/17.
 */
public class WaitTypes{

    public void waitValidations(By element, String type) throws Exception {

    //    WebDriver driver = this.initializeDriver.getDriver();

   /*     WebDriverWait wait = new WebDriverWait(driver, 15);
        String types = type.toLowerCase();

        if (types.equals("visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        } else if (types.equals("clickable")) {
            wait.until(ExpectedConditions.elementToBeClickable(element));

        } else {
            throw new Exception();
        }*/
    }
}

