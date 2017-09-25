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
public class WaitTypes {

    InitializeDriver driver = new InitializeDriver();

    public void waitValidations(By element, String type) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver.getDriver(), 15);
        String types = type.toLowerCase();

        switch (types) {
            case "visibility":
                wait.until(ExpectedConditions.visibilityOfElementLocated(element));
                break;
            case "clickable":
                wait.until(ExpectedConditions.elementToBeClickable(element));
            default:
                throw new Exception();
        }
    }
}

