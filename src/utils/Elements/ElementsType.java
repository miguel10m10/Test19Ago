package utils.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits.WaitTypes;

/**
 * Created by miguel on 1/9/17.
 */
public class ElementsType {

    WaitTypes wait = new WaitTypes();

    public void ElementsType(WebDriver driver, By element, String elementType) throws Exception {

        if (elementType.equals("click")) {

            wait.waitValidations(driver, element, "visible");
            driver.findElement(element).click();
        }
    }
    public void ElementsType(WebDriver driver, By element, String elementType, String data) throws Exception {

        if (elementType.equals("send_key")) {

            wait.waitValidations(driver, element, "visible");
            driver.findElement(element).clear();
            driver.findElement(element).sendKeys(data);
        }
    }
}
