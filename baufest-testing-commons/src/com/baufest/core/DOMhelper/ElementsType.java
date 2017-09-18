package src.com.baufest.core.DOMhelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.com.baufest.core.ManageWait.WaitTypes;

/**
 * Created by miguel on 1/9/17.
 */
public class ElementsType {

    WaitTypes wait = new WaitTypes();

    /**
     * Elements Type
     * @param driver
     * @param element
     * @param elementType
     * @Exeption Exception
     */
    public void ElementsType(WebDriver driver, By element, String elementType) throws Exception {

        if (elementType.equals("click")) {

            wait.waitValidations(driver, element, "visible");
            driver.findElement(element).click();
        }
    }
    /**
     * Elements Type
     * @param driver
     * @param element
     * @param elementType
     * @param data
     * @Exeption Exception
     */
    public void ElementsType(WebDriver driver, By element, String elementType, String data) throws Exception {

        if (elementType.equals("send_key")) {

            wait.waitValidations(driver, element, "visible");
            driver.findElement(element).clear();
            driver.findElement(element).sendKeys(data);
        }
    }
}
