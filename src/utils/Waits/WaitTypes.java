package utils.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by miguel on 27/8/17.
 */
public class WaitTypes {

    public void waitValidations(WebDriver driver, By element, String type) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 15);

        String types = type.toLowerCase();

        if (types.equals("visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        } else if (types.equals("clickable")) {
            wait.until(ExpectedConditions.elementToBeClickable(element));

        } else {
            throw new Exception();
        }
    }
}

